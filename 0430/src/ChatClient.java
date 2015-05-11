import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class ChatClient extends JFrame implements ActionListener, Runnable {
	private JTextArea output;
	private JTextField input;
	private JButton send;
	private PrintWriter pw;
	private BufferedReader br;
	private Thread t;
	private Socket socket;

	public ChatClient(){
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//��ũ�� ��
		output.setEditable(false);

		input = new JTextField();

		send = new JButton("������");

		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center",input);
		p.add("East",send);

		add("Center", scroll);
		add("South", p);
	
		setBounds(500,100,300,300);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				pw.println("quit");
				pw.flush();
				
				try{
					br.close();
					pw.close();
					socket.close();

					System.exit(0);
				}catch(IOException io){
					io.printStackTrace();
					System.out.println("������ ������ �������ϴ�");
				}
			}
		});


	}//ChatClient()

	public void init(){
		//����IP �Է´��̾�α�
		//String serverIP = JOptionPane.showInputDialog(this,"����IP�� �Է��ϼ���","����IP",JOptionPane.INFORMATION_MESSAGE);
		String serverIP = JOptionPane.showInputDialog(this,"����IP�� �Է��ϼ���","192.168.");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("����IP�� �Էµ��� �ʾҽ��ϴ�");
			System.exit(0);
		}
		String nickName = JOptionPane.showInputDialog(this, "��ȭ���� �Է��ϼ���","��ȭ��",JOptionPane.INFORMATION_MESSAGE);
		if(nickName==null || nickName.length()==0) nickName="guest";
		
		try{
			//����
			socket = new Socket(serverIP,9500);

			//IO Stream
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
		
		}catch(UnknownHostException e){
			System.out.println("������ ã�� �� �����ϴ�");
			System.exit(0);
		}catch(IOException io){
			System.out.println("������ ������ �ȵǾ����ϴ�");
			System.exit(0);
		}

		//��ȭ�� ������
		pw.println(nickName);
		pw.flush();

		//������
		t = new Thread(this);
		t.start();

		//�̺�Ʈ
		input.addActionListener(this);
		send.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		String msg = input.getText();//JTextField�� ���ڿ� ������
		pw.println(msg);//������ ������
		pw.flush();
		input.setText("");//JTextField �ʱ�ȭ
	}

	@Override
	public void run(){
		String line;
		while(true){
			try{
				line = br.readLine(); //�����κ��� ���� �޽��� �б�
				if(line==null || line.toLowerCase().equals("quit")){
					br.close();
					pw.close();
					socket.close();

					System.exit(0);

				}
				output.append(line+"\n");

				int pos = output.getText().length();
				output.setCaretPosition(pos);// ä���Ҷ� �������� ��ũ��â�� ���߾� ���� ������

			}catch(IOException io){
				io.printStackTrace();
				System.out.println("������ ������ ��Ȱ���� �ʽ��ϴ�");
			}
		}//while
	}

	public static void main(String[] args) {
		new ChatClient().init();
		
	}
}
// ������ ä�����α׷� �ҽ��� Swing���� ���ֽ��ϴ�.
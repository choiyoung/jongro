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
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//스크롤 바
		output.setEditable(false);

		input = new JTextField();

		send = new JButton("보내기");

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
					System.out.println("서버와 연결을 끊었습니다");
				}
			}
		});


	}//ChatClient()

	public void init(){
		//서버IP 입력다이얼로그
		//String serverIP = JOptionPane.showInputDialog(this,"서버IP를 입력하세요","서버IP",JOptionPane.INFORMATION_MESSAGE);
		String serverIP = JOptionPane.showInputDialog(this,"서버IP를 입력하세요","192.168.");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("서버IP가 입력되지 않았습니다");
			System.exit(0);
		}
		String nickName = JOptionPane.showInputDialog(this, "대화명을 입력하세요","대화명",JOptionPane.INFORMATION_MESSAGE);
		if(nickName==null || nickName.length()==0) nickName="guest";
		
		try{
			//소켓
			socket = new Socket(serverIP,9500);

			//IO Stream
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
		
		}catch(UnknownHostException e){
			System.out.println("서버를 찾을 수 없습니다");
			System.exit(0);
		}catch(IOException io){
			System.out.println("서버와 연결이 안되었습니다");
			System.exit(0);
		}

		//대화명 보내기
		pw.println(nickName);
		pw.flush();

		//스레드
		t = new Thread(this);
		t.start();

		//이벤트
		input.addActionListener(this);
		send.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		String msg = input.getText();//JTextField의 문자열 얻어오기
		pw.println(msg);//서버로 보내기
		pw.flush();
		input.setText("");//JTextField 초기화
	}

	@Override
	public void run(){
		String line;
		while(true){
			try{
				line = br.readLine(); //서버로부터 오는 메시지 읽기
				if(line==null || line.toLowerCase().equals("quit")){
					br.close();
					pw.close();
					socket.close();

					System.exit(0);

				}
				output.append(line+"\n");

				int pos = output.getText().length();
				output.setCaretPosition(pos);// 채팅할때 내려가는 스크롤창에 맞추어 같이 내려줌

			}catch(IOException io){
				io.printStackTrace();
				System.out.println("서버와 연결이 원활하지 않습니다");
			}
		}//while
	}

	public static void main(String[] args) {
		new ChatClient().init();
		
	}
}
// 지금의 채팅프로그램 소스는 Swing으로 되있습니다.
import java.io.*;
import java.net.*;
import java.util.*;

class ChatHandler extends Thread {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	private ArrayList<ChatHandler> list;

	public ChatHandler(Socket socket, ArrayList<ChatHandler> list) throws IOException {
		this.socket = socket;
		this.list = list;

		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
	}

	@Override
	public void run(){
		String nickName=null;
		try{
			nickName = br.readLine();//��ȭ���� �о����
			broadcast(nickName+"���� �����Ͽ����ϴ�");//��� Ŭ���̾�Ʈ���� �Ѹ���
			
			String line;
			while(true){
				line = br.readLine();
				if(line==null || line.toLowerCase().equals("quit")) break;
				broadcast("["+nickName+"] "+line);
			}//while

		}catch(IOException io){
			io.printStackTrace();
			System.out.println("Ŭ���̾�Ʈ�� �޽����� ���� ���߽��ϴ�");
		}

		//---------------------
		list.remove(this);
		broadcast(nickName+"���� �����Ͽ����ϴ�");
		try{
			br.close();
			pw.close();
			socket.close();
		}catch(IOException io){
			io.printStackTrace();
			System.out.println("Ŭ���̾�Ʈ���� ������ ���������ϴ�");
		}


	}//run()
	
	public void broadcast(String msg){
		for(ChatHandler handler : list){
			handler.pw.println(msg);//Ŭ���̾�Ʈ���� �޽��� ������
			handler.pw.flush();//�����
		}

	}
}


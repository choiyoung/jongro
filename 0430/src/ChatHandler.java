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
			nickName = br.readLine();//대화명을 읽어오기
			broadcast(nickName+"님이 입장하였습니다");//모든 클라이언트에게 뿌리기
			
			String line;
			while(true){
				line = br.readLine();
				if(line==null || line.toLowerCase().equals("quit")) break;
				broadcast("["+nickName+"] "+line);
			}//while

		}catch(IOException io){
			io.printStackTrace();
			System.out.println("클라이언트의 메시지를 읽지 못했습니다");
		}

		//---------------------
		list.remove(this);
		broadcast(nickName+"님이 퇴장하였습니다");
		try{
			br.close();
			pw.close();
			socket.close();
		}catch(IOException io){
			io.printStackTrace();
			System.out.println("클라이언트와의 연결이 끊어졌습니다");
		}


	}//run()
	
	public void broadcast(String msg){
		for(ChatHandler handler : list){
			handler.pw.println(msg);//클라이언트에게 메시지 보내기
			handler.pw.flush();//비워줌
		}

	}
}


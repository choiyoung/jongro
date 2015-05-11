import java.io.*;
import java.net.*;
import java.util.*;
// *로 묶어서 사용함
class ChatServer {
	private ServerSocket ss;
	private ArrayList<ChatHandler> list;

	public ChatServer(){
		try{
			ss = new ServerSocket(9500);
			System.out.println("서버 준비 완료..");

			list = new ArrayList<ChatHandler>();

			while(true){
				Socket socket = ss.accept();//낚아챈다
				ChatHandler handler = new ChatHandler(socket, list); //스레드 생성
				handler.start();

				list.add(handler);
			}//while
		//IO는 ChatHandler가 갔고있음
		}catch(IOException io){
			io.printStackTrace();
			System.out.println("서버가 제대로 작동하지 않습니다");
		}

	}

	public static void main(String[] args) {
		new ChatServer();
	}
}





















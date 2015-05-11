import java.io.*;
import java.net.*;
import java.util.*;
// *�� ��� �����
class ChatServer {
	private ServerSocket ss;
	private ArrayList<ChatHandler> list;

	public ChatServer(){
		try{
			ss = new ServerSocket(9500);
			System.out.println("���� �غ� �Ϸ�..");

			list = new ArrayList<ChatHandler>();

			while(true){
				Socket socket = ss.accept();//����æ��
				ChatHandler handler = new ChatHandler(socket, list); //������ ����
				handler.start();

				list.add(handler);
			}//while
		//IO�� ChatHandler�� ��������
		}catch(IOException io){
			io.printStackTrace();
			System.out.println("������ ����� �۵����� �ʽ��ϴ�");
		}

	}

	public static void main(String[] args) {
		new ChatServer();
	}
}





















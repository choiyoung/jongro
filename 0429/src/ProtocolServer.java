import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private ServerSocket ss;// 기다리고 클라이언트가 오면 그와 대화할 소켓을 만들어줌(낚시꾼)
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	
	public ProtocolServer(){
		
		try {
			
			ss = new ServerSocket(9500);
			System.out.println("서버준비완료");
			
			socket = ss.accept();//낚아챈다.
			
			// IO
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {			
						
			e.printStackTrace();
			
			System.out.println("제대로 연결이 안되었습니다.");
		}
		String line = null;
		
		while(true){
			
			try {
				line = br.readLine();
				
				String[] ar = line.split(":");// "100","angel"
				
				if(ar[0].equals("100")){
					bw.write(ar[1]+"님이 입장하였습니다.\n");
					bw.flush();
				}else if(ar[0].equals("200")){
					bw.write(ar[1]+"님이 퇴장하였습니다.\n");
					
					br.close();
					bw.close();
					socket.close();
					
					System.exit(0);
					
				}else if(ar[0].equals("300")){
					
					bw.write("["+ar[1]+"] :"+ar[2]+"\n");
					bw.flush();					
				}
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
	}
	public static void main(String[] args) {
		
		new ProtocolServer();

	}

}

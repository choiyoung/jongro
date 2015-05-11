import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyboard;
		
	
	
	
	public ProtocolClient(){
		// 소켓
		try {
			
			socket = new Socket("192.168.33.109",9500);
			// IO
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
		}catch(UnknownHostException e){
			e.printStackTrace();
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("서버와 연결이 안되었습니다.");
			System.exit(0);
		}
		String msg=null;
		String line=null;
		while(true){
		try{			
			
			msg = keyboard.readLine();//200:angel
			
			bw.write(msg+"\n");
			bw.flush();
			
			line = br.readLine();// 서버에서 오는 메세지 읽기
			System.out.println(line);
			
			String[] ar = msg.split(":"); // "200","angel"
			if(ar[0].equals("200")){
				
				br.close();
				bw.close();
				socket.close();
				keyboard.close();
				
				
				System.exit(0);
			}
			
		}catch (IOException e){
			e.printStackTrace();
			
		}
		
		}
		
	}
	public static void main(String[] args) {
		new ProtocolClient();
		

	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private ServerSocket ss;// ��ٸ��� Ŭ���̾�Ʈ�� ���� �׿� ��ȭ�� ������ �������(���ò�)
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	
	public ProtocolServer(){
		
		try {
			
			ss = new ServerSocket(9500);
			System.out.println("�����غ�Ϸ�");
			
			socket = ss.accept();//����æ��.
			
			// IO
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {			
						
			e.printStackTrace();
			
			System.out.println("����� ������ �ȵǾ����ϴ�.");
		}
		String line = null;
		
		while(true){
			
			try {
				line = br.readLine();
				
				String[] ar = line.split(":");// "100","angel"
				
				if(ar[0].equals("100")){
					bw.write(ar[1]+"���� �����Ͽ����ϴ�.\n");
					bw.flush();
				}else if(ar[0].equals("200")){
					bw.write(ar[1]+"���� �����Ͽ����ϴ�.\n");
					
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

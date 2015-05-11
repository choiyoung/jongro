import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressEx {// ���� ���α׷�

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress naver =  InetAddress.getByName("www.naver.com");// new�δ� ������ �ȵǸ� �����ڸ� ���� �޼ҵ带 ã�ƾ���
		System.out.println("NAVER IP "+naver.getHostAddress());
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("Local IP : "+local);
		
		InetAddress[] google = InetAddress.getAllByName("www.google.co");
		for(InetAddress data : google){
			System.out.println("Google IP = "+data.getHostAddress());
	
		}
		InetAddress[] daum = InetAddress.getAllByName("www.daum.net");
		for(InetAddress data : daum){
			System.out.println("daum IP = "+data.getHostAddress());
	
		}
	}

}
// ��
// �ڵ���(����-IO)
// ��ȣ (IP)
//		(port)
// �������� : IP:port/����
// http://123.123.123.123/80 : so/Index
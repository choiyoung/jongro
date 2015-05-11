import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressEx {// 추적 프로그램

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress naver =  InetAddress.getByName("www.naver.com");// new로는 생성이 안되며 생성자를 막음 메소드를 찾아야함
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
// 나
// 핸드폰(소켓-IO)
// 번호 (IP)
//		(port)
// 프로토콜 : IP:port/파일
// http://123.123.123.123/80 : so/Index
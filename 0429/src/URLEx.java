import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.daum.net/index.html");
		System.out.println("프로토콜 = "+url.getProtocol());
		System.out.println("호스트 = "+url.getHost());
		System.out.println("포트 = "+url.getPort());
		System.out.println("기본 포트 = "+url.getDefaultPort());
		System.out.println("경로 = "+url.getPath());
		System.out.println("파일 = "+url.getFile());
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.daum.net/index.html");
		System.out.println("�������� = "+url.getProtocol());
		System.out.println("ȣ��Ʈ = "+url.getHost());
		System.out.println("��Ʈ = "+url.getPort());
		System.out.println("�⺻ ��Ʈ = "+url.getDefaultPort());
		System.out.println("��� = "+url.getPath());
		System.out.println("���� = "+url.getFile());
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int size = (int)file.length();
		byte[] b = new byte[size];
		bis.read(b,0,size);
		System.out.println(new String (b));
		
	}

}
// Serializable 객체 직렬화
// ObjectOutputStream -Serializable
// 크기
// 배열.length
// 문자열.length()
// ArryList.size()
// Vector.size()
// 파일.length()
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
// Serializable ��ü ����ȭ
// ObjectOutputStream -Serializable
// ũ��
// �迭.length
// ���ڿ�.length()
// ArryList.size()
// Vector.size()
// ����.length()
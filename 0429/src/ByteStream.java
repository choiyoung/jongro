import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ByteStream {

	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));//Returns:the next byte of data, or -1 if the end of the stream is reached.
		int data;
		
		while((data = bis.read())!=-1){
			System.out.print((char)data);
			
		}
		bis.close();
		
		

	}

}
// int ������ �о�帰 ���� �������� 1310(\r\n)�� �ִٸ� ���� �ٹٲ��̴�.
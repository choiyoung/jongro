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
// int 정수로 읽어드린 수에 보지못한 1310(\r\n)이 있다면 엔터 줄바꿈이다.
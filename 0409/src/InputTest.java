import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws IOException{
		//IO Stream
		//Application-> 키보드/화면
		//			 <- 파일
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수를 입력 : ");
		
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("실수 입력 : ");
		
		double b = Double.parseDouble( br.readLine());
		System.out.println(a+" + "+b+" = "+(a+b));
		 
	}

}

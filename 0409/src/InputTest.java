import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws IOException{
		//IO Stream
		//Application-> Ű����/ȭ��
		//			 <- ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է� : ");
		
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("�Ǽ� �Է� : ");
		
		double b = Double.parseDouble( br.readLine());
		System.out.println(a+" + "+b+" = "+(a+b));
		 
	}

}

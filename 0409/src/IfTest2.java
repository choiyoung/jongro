import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//a,b�� ���� �Է¹޾Ƽ� ū ���� ����Ͻÿ�
/*[���� ���]
 * a�� �Է� : 25
 * b�� �Է� : 36
 * ū �� : xx
 */
public class IfTest2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.print("a�� ���� �Է����ּ��� : ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("b�� ���� �Է����ּ��� : ");
			int b = Integer.parseInt(br.readLine());
			
			if( a == b ) 	 System.out.println("a�� b�� �����ϴ�.");
			else if( a > b ) System.out.println("ū �� : "+a);
			else 		 	 System.out.println("ū �� : "+b);
			
		
	}

}

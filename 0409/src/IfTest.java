import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class IfTest {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է� : ");

		int a = Integer.parseInt(br.readLine());
		//br.readLine() �� ���·� �״�� ���� ���ڿ��� �޾Ƶ��̱� ������ Integer.parseInt()�ȿ� �Ἥ ���Եȴ�.
		if(a>=50) System.out.println(a+"�� 50���� ũ�ų� ����.");
				  System.out.println(a+"�� 50���� �۴�.");
		if(a>=50) System.out.println(a+"�� 50���� ũ�ų� ����.");
		else 	  System.out.println(a+"�� 50���� �۴�.");
		//if(����){a; b;}
		//else c;
	}

}

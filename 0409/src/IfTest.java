import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class IfTest {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("데이터 입력 : ");

		int a = Integer.parseInt(br.readLine());
		//br.readLine() 이 상태로 그대로 쓰면 문자열로 받아들이기 때문에 Integer.parseInt()안에 써서 쓰게된다.
		if(a>=50) System.out.println(a+"는 50보다 크거나 같다.");
				  System.out.println(a+"는 50보다 작다.");
		if(a>=50) System.out.println(a+"는 50보다 크거나 같다.");
		else 	  System.out.println(a+"는 50보다 작다.");
		//if(조건){a; b;}
		//else c;
	}

}

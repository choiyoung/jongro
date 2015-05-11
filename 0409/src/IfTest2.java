import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//a,b의 값을 입력받아서 큰 값을 출력하시오
/*[실행 결과]
 * a값 입력 : 25
 * b값 입력 : 36
 * 큰 값 : xx
 */
public class IfTest2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.print("a의 값을 입력해주세요 : ");
			int a = Integer.parseInt(br.readLine());
			System.out.print("b의 값을 입력해주세요 : ");
			int b = Integer.parseInt(br.readLine());
			
			if( a == b ) 	 System.out.println("a와 b가 같습니다.");
			else if( a > b ) System.out.println("큰 값 : "+a);
			else 		 	 System.out.println("큰 값 : "+b);
			
		
	}

}

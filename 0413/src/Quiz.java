import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1~100사이의 난수가 발생하였습니다.\n맞추어 보세요.");
		int num;
		num = (int)(Math.random()*100)+1;
		int c= 0;
	
		
		
		while(true){
			System.out.print("수를 입력해주세요 : ");
			
			int i = Integer.parseInt(br.readLine());
			
			c++;
			if(i<num) System.out.println(i+"보다 작습니다.");
			else if(i>num) System.out.println(i+"보다 큽니다.");
			else break;
				
							
		}

		System.out.println("축합니다."+c+" 맞추셨습니다.");
	}

}

/*
 숫자 맞추기 게임
 1~100사이의 난수를 발생시켜 맞추는 게임
[실행 결과]
1~100사이의 난수가 발생하였습니다.
맞추어 보세요.

숫자입력 : 50
50보다 큽니다.
숫자입력 : 80
80보다 작습니다.
...
숫자입력 : 77
추카추카..xx번만에 맞추셨습니다.
*/
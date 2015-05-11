import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가위 바위 보 게임
/*
 	컴퓨터가 1~3사이의 난수를 발생한다
 	돈은 1000원이 배당된다
 	돈 떨어지면 프로그램 종료
 1. 가위
 2. 바위
 3. 보
 숫자 입력 : 2
 배팅 금액 : 200
 
 컴퓨터 : 가위 사용자 : 바위
 	You Win!!
 잔액 1200원 입니다.
 
 
 */
public class Quiz2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		System.out.println("돈은 1000이 배당됩니다.");
		System.out.println("돈을 모두 잃으시면 끝이 납니다.");
		System.out.println("1. 가위 2. 바위 3. 보");
		
		
		num = (int)((Math.random()*3)+1);
		System.out.println(num);

		
		
		
	}

}

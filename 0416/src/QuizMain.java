import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*1~100tkdldml 난수를 2개 발생하여 합을 맞추는 게임
 단) 5문제만 제공하고 한 문제당 20점 입니다.
 [실행 결과]
 --------------기본 생성자
      a  +  b
  [1] 75 + 23 = 15
  틀림 정답 : 98
  [2] 12 + 5 = 17
  딩동뎅
  		.
  		.
  		.
 ---------------Main
  당신은 2개 맞아서 40점 입니다.
 
 */

class Quiz{
	private int a, b, dap, cnt;
	
	public Quiz()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random r = new Random();
		System.out.println("1~100tkdldml 난수를 2개 발생하여 합을 맞추는 게임 \n단) 5문제만 제공하고 한 문제당 20점 입니다.");
		for(int i=1;i<6;i++){
			a = r.nextInt(99)+1;
			b = r.nextInt(99)+1;
			System.out.print(a+"+"+b+"=	");
			int dap = Integer.parseInt(br.readLine());
			if((a+b)==dap){
				cnt++;
				System.out.println("딩동댕");
			}
			else{
				System.out.println("틀림 정답 : "+(a+b));
			}			
	}	
	
}
public int getcnt(){
		return cnt;
	}
}
public class QuizMain {
	public QuizMain(){
		System.out.println(Math.random());//0<난수<1
		Random r = new Random();
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		
	}
	public static void main(String[] args)throws IOException{
		
		Quiz aa = new Quiz();
		System.out.println("당신은 "+aa.getcnt()+"개 맞으셨습니다.");
		System.out.println("당신의 점수는 "+(aa.getcnt()*20)+"입니다.");
		

	
	}

}


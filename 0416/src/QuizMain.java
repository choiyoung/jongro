import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*1~100tkdldml ������ 2�� �߻��Ͽ� ���� ���ߴ� ����
 ��) 5������ �����ϰ� �� ������ 20�� �Դϴ�.
 [���� ���]
 --------------�⺻ ������
      a  +  b
  [1] 75 + 23 = 15
  Ʋ�� ���� : 98
  [2] 12 + 5 = 17
  ������
  		.
  		.
  		.
 ---------------Main
  ����� 2�� �¾Ƽ� 40�� �Դϴ�.
 
 */

class Quiz{
	private int a, b, dap, cnt;
	
	public Quiz()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random r = new Random();
		System.out.println("1~100tkdldml ������ 2�� �߻��Ͽ� ���� ���ߴ� ���� \n��) 5������ �����ϰ� �� ������ 20�� �Դϴ�.");
		for(int i=1;i<6;i++){
			a = r.nextInt(99)+1;
			b = r.nextInt(99)+1;
			System.out.print(a+"+"+b+"=	");
			int dap = Integer.parseInt(br.readLine());
			if((a+b)==dap){
				cnt++;
				System.out.println("������");
			}
			else{
				System.out.println("Ʋ�� ���� : "+(a+b));
			}			
	}	
	
}
public int getcnt(){
		return cnt;
	}
}
public class QuizMain {
	public QuizMain(){
		System.out.println(Math.random());//0<����<1
		Random r = new Random();
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		
	}
	public static void main(String[] args)throws IOException{
		
		Quiz aa = new Quiz();
		System.out.println("����� "+aa.getcnt()+"�� �����̽��ϴ�.");
		System.out.println("����� ������ "+(aa.getcnt()*20)+"�Դϴ�.");
		

	
	}

}


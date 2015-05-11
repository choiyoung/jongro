import java.util.Scanner;


public class StringBufferTest {
	private int dan;
	
	public StringBufferTest(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 :");
		dan = scan.nextInt();
				
	}
	public void disp(){
		
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 1;i<=9;i++){
			//System.out.println(dan+"*"+i+"="+dan*i);
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			// 기존의 값을 사용 그전에 값이 붙어서 나옴 
			// 나올 값은 그 뒤에 붙어서 나옴
			System.out.println(buffer);
			buffer.delete(0,buffer.length());// buffer.length로 하게 되면 나온 문자의 길이 만큼 제거 한 후 다음 문자들 이출력
			
		}
	}
	
	public static void main(String[] args) {
		StringBufferTest sbt = new StringBufferTest();
		sbt.disp();
			
	}

}

/*원하는 단을 입력: 7
7*1=7
7*2=14
   .
   .
   .
   7*9=63
*/
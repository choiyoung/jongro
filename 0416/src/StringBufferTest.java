import java.util.Scanner;


public class StringBufferTest {
	private int dan;
	
	public StringBufferTest(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է� :");
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
			// ������ ���� ��� ������ ���� �پ ���� 
			// ���� ���� �� �ڿ� �پ ����
			System.out.println(buffer);
			buffer.delete(0,buffer.length());// buffer.length�� �ϰ� �Ǹ� ���� ������ ���� ��ŭ ���� �� �� ���� ���ڵ� �����
			
		}
	}
	
	public static void main(String[] args) {
		StringBufferTest sbt = new StringBufferTest();
		sbt.disp();
			
	}

}

/*���ϴ� ���� �Է�: 7
7*1=7
7*2=14
   .
   .
   .
   7*9=63
*/

public class ExceptionTest {

	public static void main(String[] args) {
		try{
			int[] ar = {10,20,30};
			//System.out.println(ar[4]);

			System.out.println(25/3);
			System.out.println(0/3);
			//System.out.println(25/0);
			
						
		}catch(ArithmeticException e){
			
			System.out.println("0���� ������ ������.");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭�� ���ȣ�� 0~2 �Դϴ�.");
		}finally{
			System.out.println("������ ����");
		}
	}

}

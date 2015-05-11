
public class ExceptionTest {

	public static void main(String[] args) {
		try{
			int[] ar = {10,20,30};
			//System.out.println(ar[4]);

			System.out.println(25/3);
			System.out.println(0/3);
			//System.out.println(25/0);
			
						
		}catch(ArithmeticException e){
			
			System.out.println("0으로 나누지 마세요.");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 방번호는 0~2 입니다.");
		}finally{
			System.out.println("무조건 실행");
		}
	}

}

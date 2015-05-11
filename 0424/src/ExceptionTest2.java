import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// IO: 입력과 출력
// IO stream : 입력과 출력의 길을 만들어 달라.
// Reader : 입력
// Writer : 출력

public class ExceptionTest2 {
	private int dan;
	
	public void input() throws NumberFormatException, IOException{//구현
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// System.in의 in은 InputStream형태로 들어 오겠다고 선언 하는것
		System.out.print("원하는 단을 입력해주세요 : ");
		dan = Integer.parseInt(br.readLine());
		
		
	}
	public void output(){
		if(dan>=2 && dan<=9){
			for(int i=1;i<=9;i++){
				System.out.println(dan+"*"+i+"="+dan*i);
			}
		}
		else{ 
		try{//System.out.println("가능한 범위를 초과하셨습니다.");
			throw new Exception("범위초과");// 강제로 Exception 발생
			//throw new MakeException("범위초과");//사용자가 Exception을 만들어 쓴것
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{ //throws는 오류를 잡는것 throw는 오류를 발생시킴
		ExceptionTest2 et = new ExceptionTest2();
		et.input();//호출
		et.output();
		
		
	}

}
// Override가 된 메소드에는 throws을 사용 할수없다.Override에서는 try와 catch를 사용 하여야 한다.

public class CompTest {

	public static void main(String[] args) {
			int score = 85;
			
			String result = score>=80 && score<=100 ? "합격" : "불합격";
			String result2 = (score/2)%2==0 ? "짝수" : "홀수"; 
			System.out.println("결과 = "+result);
			System.out.println("결과 = "+result2);
	}

}

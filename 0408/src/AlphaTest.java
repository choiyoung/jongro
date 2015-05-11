// 문자가 대문자(A~Z,65~90)이면 소문자로 변환하여 출력
// 아니면 대문자로 변환하여 출력
public class AlphaTest {

	public static void main(String[] args) {
		char ch = 'T';
		//char ch = 'e';
		int result = ch>='A' && ch<='Z'? ch+32 : ch-32 ;
		System.out.println(ch+" -> "+(char)result);
	
	}
}

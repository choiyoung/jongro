// ���ڰ� �빮��(A~Z,65~90)�̸� �ҹ��ڷ� ��ȯ�Ͽ� ���
// �ƴϸ� �빮�ڷ� ��ȯ�Ͽ� ���
public class AlphaTest {

	public static void main(String[] args) {
		char ch = 'T';
		//char ch = 'e';
		int result = ch>='A' && ch<='Z'? ch+32 : ch-32 ;
		System.out.println(ch+" -> "+(char)result);
	
	}
}


public class CompTest {

	public static void main(String[] args) {
			int score = 85;
			
			String result = score>=80 && score<=100 ? "�հ�" : "���հ�";
			String result2 = (score/2)%2==0 ? "¦��" : "Ȧ��"; 
			System.out.println("��� = "+result);
			System.out.println("��� = "+result2);
	}

}

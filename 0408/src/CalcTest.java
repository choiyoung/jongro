
public class CalcTest {

	public static void main(String[] args) {
		int a = 5;
			a += 2;
			a *= 3;
			a /= 8;
			System.out.println("a�� ��� : "+a);
			a++;
			System.out.println("a�� ��� : "+a);
			
			int b = a++;
			System.out.println("a�� ��� : "+a+"\tb�� ��� : "+b);
			
			int c= ++a * b--;
			System.out.println("a�� ��� : "+a+"\tb�� ��� : "+b+"\tc�� ��� : "+c);
			
			System.out.println(a++);//println ���¿����� �������� ���� ��ų�� ����
			System.out.println("a="+a);
	}

}


public class ArrayTest {
	static int a;//�ʵ�, �ʱ�ȭ
	
	public static void main(String[] args) {
		
		int a = 0;// ���� ����(local variable), ������(Garbage)= ���� ���� ��
		
		System.out.println("���� ����a ="+a);
		System.out.println("�ʵ� a =" + ArrayTest.a);
		System.out.println();
		
		int[] ar = {10,20,30};// �ڹ��� �迭�� int�ڿ��� ������ �ڿ� ���� []�� �Ἥ �迭�� ���� �� �ִ�.
							// �� [] �ȿ��� ���� �����ʴ´�.
		System.out.println("ar[0] = "+ar[0]);
		System.out.println("ar[1] = "+ar[1]);
		System.out.println("ar[2] = "+ar[2]);
		System.out.println();
		
		int[] ch = {'2','5','3'};
		System.out.println("ch[0] = "+(ch[0]-48));
		System.out.println("ch[1] = "+(ch[1]-48));
		System.out.println("ch[2] = "+(ch[2]-48));
		System.out.println();
		
		String[] str ={"2","5","3"};
		System.out.println("str[0] = "+Integer.parseInt(str[0]));
		System.out.println("str[1] = "+Integer.parseInt(str[1]));
		System.out.println("str[2] = "+Integer.parseInt(str[2]));
		System.out.println();
		
		String[] str2 ={"25.3","52.6","37.8"};
		System.out.println("str2[0] = "+Double.parseDouble(str2[0]));
		System.out.println("str2[1] = "+Double.parseDouble(str2[1]));
		System.out.println("str2[2] = "+Double.parseDouble(str2[2]));
		System.out.println();
		
	}

}


public class StringTest {

	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		
		String c = new String("apple");
		String d = new String("apple");
		
		if(a==b) System.out.println("a�� b�� �������� ����");
		else System.out.println("a�� b�� �������� �ٸ���.");
		if(c==d) System.out.println("c�� d�� �������� �ٸ���");
		else System.out.println("c�� d�� �������� �ٸ���.");
		
		if(a.equals(b)) System.out.println("a�� b�� ���ڿ��� ����");
		else System.out.println("a�� b�� ���ڿ��� �ٸ���");
		if(a.equals(b)) System.out.println("c�� d�� ���ڿ��� ����");
		else System.out.println("c�� d�� ���ڿ��� �ٸ���");
		System.out.println();
		
		String e = "õ�� ANGEL devil "+123+456;// String�� ������ �ȵǹǷ� �޸𸮿� 3�� �����ȴ�.
		// +123+456�� +�� ���� �������� ó����(������ �켱����) 
		//���鵵 ���ڷ� �޾��� String�����ڴ� ������ �ȵ�;;;;
		// java�� ���ڿ��� ũ��� ������ ������ ������.
		System.out.println("���ڿ��� ũ�� = "+e.length());
		System.out.println("���� ���� = "+ e.charAt(5));// G
		System.out.println("���� ���� = "+ e.substring(15));
		System.out.println("���� ���� = "+ e.substring(3,8));// substring(statIndex, endIndex)
		System.out.println("���� ���� = "+ e.substring(3,8).toLowerCase());//toLowerCase�� �ҹ��ڷ� �ٲپ���
		System.out.println("���� ���� = "+ e.substring(9,14));
		System.out.println("���� ���� = "+ e.substring(9,14).toUpperCase());//toUpperCase
		System.out.println("���� �˻� = "+ e.indexOf("��"));//1
		System.out.println("���� �˻� = "+ e.indexOf("34"));//34�� �ϰ� �Ǹ� ���� �κ��� �����´�.
		System.out.println("���� �˻� = "+ e.indexOf("¥"));//-1
		
		System.out.println(Integer.parseInt("2"));
		System.out.println(String.valueOf(2));
	}

}

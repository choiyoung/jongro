
public class StaticTest {
	private int a=3;
	private static int b=3;// static�� �ʱ�ȭ�� 1���� �̷������
	// static���� ���� ������ ���������� �Ѵ� (��� ��ü�� ���� ���� �ִ�.)
	static{
		System.out.println("�ʱ�ȭ ����");
		System.out.println("�����ں��ٵ� ���� ����");
	}
	public StaticTest(){
		System.out.println("defult ������");
	}
	
	public void calc(){
		a++;
		b++;
	}
	public void disp(){
		System.out.println("a ="+this.a+"\t b = "+StaticTest.b);// static�� this�� ���� �ȵȴ�.
		// static�� ���� �տ��� Ŭ�������� �����Ǿ� �ִ�.
		
	}
	public static void output(){
	//	System.out.println("a ="+this.a+"\t b = "+StaticTest.b);
		System.out.println("static method...");
	}
	
	public static void main(String[] args) {
	StaticTest aa = new StaticTest();
	aa.calc();
	aa.disp();
	System.out.println();
	
	StaticTest bb = new StaticTest();
	bb.calc();
	bb.disp();
	System.out.println();
	
	StaticTest.output();
	output();
	aa.output();
	}

}

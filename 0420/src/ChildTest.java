public class ChildTest extends SuperTest{

	private String name;
	private int age;
	
	public ChildTest(String n,int a, double w, double h){
		// �θ������ ȣ��(ù ��° �ٿ� �Է����־����)
		super(w,h);
		this.name = n;
		this.age = a;
		//super.weight = w;//this.weight = w;
		//super.height = h;
		
		
		
	}
	public void disp(){// �θ� Ŭ����(SuperTest)�� �ִ� ���� �̸��� disp�ʹ� ���� �� �� �ִ�(over ride)
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		//System.out.println("������ = "+weight);
		//System.out.println(" Ű  = "+height);
		super.disp();
	}
	public static void main(String[] args) {
		ChildTest aa = new ChildTest("ȫ�浿",25,72.6,183.7);
		aa.disp();
		System.out.println("-----------------");
		SuperTest bb = new ChildTest("�ڳ�",16,58.9,178.5);
		bb.disp();
	}

}
// �ڽ�Ŭ������ �θ�Ŭ�������� �� �� �־ �θ�Ŭ������ �ڽ� Ŭ������ �� �� ����.
// over load 1. �ϳ��� Ŭ�������� ����� �ߺ� ����
//			 2. �޼ҵ��(�μ� ���� X, �μ��� X)
// over ride 1. Super,sub Ŭ����
//			 2. �� ���ƾ��Ѵ�.(��. modifier(public,protected,....)�� sub Ŭ�������� �� ũ�� �ȴ�.)
public class SubTest extends SuperTest{

	private String name;
	private int age;
	
	public SubTest(String n,int a, double w, double h){
		this.name = n;
		this.age = a;
		super.weight = w;//this.weight = w;
		super.height = h;
	}
	public void output(){
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		System.out.println("������ = "+weight);
		System.out.println(" Ű  = "+height);
		
	}
	public static void main(String[] args) {
		SubTest aa = new SubTest("ȫ�浿",25,72.6,183.7);// aa=SuperTest/SubTest������ �޸𸮸� �Ҵ�
		aa.output();
		System.out.println("---------------");
		aa.disp();
		System.out.println("==================");
		
		SuperTest bb = new SubTest("�ڳ�",16,58.9,178.5);
		//bb.output();-error
		bb.disp();
		
	}

}

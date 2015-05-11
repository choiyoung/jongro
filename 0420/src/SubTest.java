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
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println(" 키  = "+height);
		
	}
	public static void main(String[] args) {
		SubTest aa = new SubTest("홍길동",25,72.6,183.7);// aa=SuperTest/SubTest순으로 메모리를 할당
		aa.output();
		System.out.println("---------------");
		aa.disp();
		System.out.println("==================");
		
		SuperTest bb = new SubTest("코난",16,58.9,178.5);
		//bb.output();-error
		bb.disp();
		
	}

}

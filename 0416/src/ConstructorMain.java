class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest(){
		System.out.println("defualt ������");
	}
	public ConstructorTest(String name){
		this();// Overload�� �ٸ� �����ڸ� ȣ��
		this.name = name;
	}
	public ConstructorTest(int age){
		this("��ġ");
		this.age = age;
		
	}
	public String getname(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
}
public class ConstructorMain {

	public static void main(String[] args) {
	
		ConstructorTest aa = new ConstructorTest();
		System.out.println("�̸� = "+aa.getname());
		System.out.println("���� = "+aa.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("ȫ�浿");
		System.out.println("�̸� = "+bb.getname());
		System.out.println("���� = "+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("�̸� = "+cc.getname());
		System.out.println("���� = "+cc.getAge());
		System.out.println();
	
	}

}

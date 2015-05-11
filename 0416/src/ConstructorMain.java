class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest(){
		System.out.println("defualt 생성자");
	}
	public ConstructorTest(String name){
		this();// Overload된 다른 생성자를 호출
		this.name = name;
	}
	public ConstructorTest(int age){
		this("또치");
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
		System.out.println("이름 = "+aa.getname());
		System.out.println("나이 = "+aa.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("홍길동");
		System.out.println("이름 = "+bb.getname());
		System.out.println("나이 = "+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("이름 = "+cc.getname());
		System.out.println("나이 = "+cc.getAge());
		System.out.println();
	
	}

}

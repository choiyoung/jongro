public class ChildTest extends SuperTest{

	private String name;
	private int age;
	
	public ChildTest(String n,int a, double w, double h){
		// 부모생성자 호출(첫 번째 줄에 입력해주어야함)
		super(w,h);
		this.name = n;
		this.age = a;
		//super.weight = w;//this.weight = w;
		//super.height = h;
		
		
		
	}
	public void disp(){// 부모 클래스(SuperTest)에 있는 같은 이름의 disp와는 따로 쓸 수 있다(over ride)
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		//System.out.println("몸무게 = "+weight);
		//System.out.println(" 키  = "+height);
		super.disp();
	}
	public static void main(String[] args) {
		ChildTest aa = new ChildTest("홍길동",25,72.6,183.7);
		aa.disp();
		System.out.println("-----------------");
		SuperTest bb = new ChildTest("코난",16,58.9,178.5);
		bb.disp();
	}

}
// 자식클래스가 부모클래스것을 쓸 수 있어도 부모클래스는 자식 클래스를 쓸 수 없다.
// over load 1. 하나의 클래스에서 생기는 중복 생성
//			 2. 메소드명(인수 개수 X, 인수형 X)
// over ride 1. Super,sub 클래스
//			 2. 다 같아야한다.(단. modifier(public,protected,....)가 sub 클래스보다 더 크면 된다.)
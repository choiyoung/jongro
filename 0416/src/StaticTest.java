
public class StaticTest {
	private int a=3;
	private static int b=3;// static의 초기화는 1번만 이루어진다
	// static으로 잡힌 변수를 공유변수라 한다 (모든 객체가 같이 쓸수 있다.)
	static{
		System.out.println("초기화 영역");
		System.out.println("생성자보다도 먼저 수행");
	}
	public StaticTest(){
		System.out.println("defult 생성자");
	}
	
	public void calc(){
		a++;
		b++;
	}
	public void disp(){
		System.out.println("a ="+this.a+"\t b = "+StaticTest.b);// static은 this를 쓰면 안된다.
		// static의 변수 앞에는 클래스명이 생략되어 있다.
		
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

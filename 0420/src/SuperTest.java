public class SuperTest {
	protected double weight, height;
	public SuperTest(){// 에러 방지차원으로 기본생성자를 만들어놓음
		System.out.println("SuperTest 기본 생성자");
	}
	public SuperTest(double w,double h){
		this.weight = w;
		this.height = h;
		
	}
	public void disp(){
		System.out.println("몸무게 : "+weight);
		System.out.println("키 ="+height);
	}
}

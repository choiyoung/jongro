import java.util.Scanner;


abstract class ShapeTest{
	
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	public ShapeTest(){
		System.out.println("ShapeTest 기본생성자");
		
	}
	public void templateMethod(){
		calcArea();
		dispArea();
	}
	
	public abstract void calcArea();
	public abstract void dispArea();
	 

}
//--------------------------
class SamTest extends ShapeTest{
	private int base, height;
	public SamTest(){
		System.out.println("SamTest 기본 생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override//틀린 Override를 잡아줌 찾아줌 메소드 마다 잡아줘야 한다.
	public void calcArea(){
		area = base*height/2.0;
		
	}
	@Override
	public void dispArea(){
		System.out.println("삼각형 넓이 = "+area);
		
	}
}

//--------------------------
class SaTest extends ShapeTest{
	private int top,base, height;
	public SaTest(){
		System.out.println("SaTest 기본 생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override//틀린 Override를 잡아줌 찾아줌 메소드 마다 잡아줘야 한다.
	public void calcArea(){
		area = (top+base)*height/2.0;
		
	}
	@Override
	public void dispArea(){
		System.out.println("사각형 넓이 = "+area);
		
	}
}
//---------------------------
class SadariTest extends ShapeTest{
	private int top,base, height;
	public SadariTest(){
		System.out.println("SadariTest 기본 생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override//틀린 Override를 잡아줌 찾아줌 메소드 마다 잡아줘야 한다.
	public void calcArea(){
		area = (top+base)*height/2.0;
		
	}
	@Override
	public void dispArea(){
		System.out.println("사각형 넓이 = "+area);
		
	}
}
//---------------------------

public class ShapeMain {

	public static void main(String[] args) {
	/*	SamTest sam = new SamTest();// 결합도 100% 
		sam.calcArea();
		sam.dispArea();
		SaTest sa = new SaTest();
		sa.calcArea();
		sa.dispArea();
		SadariTest sadari = new SadariTest();
		sadari.calcArea();
		sadari.dispArea();
*/
		ShapeTest shape;
		shape = new SamTest();// 부모클래스를 부르고 자식클래스의 것을 참조 할수있다.
		shape.templateMethod();
		System.out.println();
		
		shape = new SaTest();// 부모 = 자식 (다용성)
		shape.templateMethod();
		System.out.println();
		
		shape = new SadariTest();
		shape.templateMethod();
		System.out.println();
		
	}

}
// 부모 = 자식 O
// 자식 = 부모 X
// 자식 = (자식)부모
import java.util.Scanner;


abstract class ShapeTest{
	
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	public ShapeTest(){
		System.out.println("ShapeTest �⺻������");
		
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
		System.out.println("SamTest �⺻ ������");
		System.out.print("�غ� : ");
		base = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	@Override//Ʋ�� Override�� ����� ã���� �޼ҵ� ���� ������ �Ѵ�.
	public void calcArea(){
		area = base*height/2.0;
		
	}
	@Override
	public void dispArea(){
		System.out.println("�ﰢ�� ���� = "+area);
		
	}
}

//--------------------------
class SaTest extends ShapeTest{
	private int top,base, height;
	public SaTest(){
		System.out.println("SaTest �⺻ ������");
		System.out.print("���� : ");
		top = scan.nextInt();
		System.out.print("�غ� : ");
		base = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	@Override//Ʋ�� Override�� ����� ã���� �޼ҵ� ���� ������ �Ѵ�.
	public void calcArea(){
		area = (top+base)*height/2.0;
		
	}
	@Override
	public void dispArea(){
		System.out.println("�簢�� ���� = "+area);
		
	}
}
//---------------------------
class SadariTest extends ShapeTest{
	private int top,base, height;
	public SadariTest(){
		System.out.println("SadariTest �⺻ ������");
		System.out.print("���� : ");
		top = scan.nextInt();
		System.out.print("�غ� : ");
		base = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}
	@Override//Ʋ�� Override�� ����� ã���� �޼ҵ� ���� ������ �Ѵ�.
	public void calcArea(){
		area = (top+base)*height/2.0;
		
	}
	@Override
	public void dispArea(){
		System.out.println("�簢�� ���� = "+area);
		
	}
}
//---------------------------

public class ShapeMain {

	public static void main(String[] args) {
	/*	SamTest sam = new SamTest();// ���յ� 100% 
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
		shape = new SamTest();// �θ�Ŭ������ �θ��� �ڽ�Ŭ������ ���� ���� �Ҽ��ִ�.
		shape.templateMethod();
		System.out.println();
		
		shape = new SaTest();// �θ� = �ڽ� (�ٿ뼺)
		shape.templateMethod();
		System.out.println();
		
		shape = new SadariTest();
		shape.templateMethod();
		System.out.println();
		
	}

}
// �θ� = �ڽ� O
// �ڽ� = �θ� X
// �ڽ� = (�ڽ�)�θ�
import java.util.Scanner;


public class InputTest {
	private int a;
	private double b;
	// 기본 생성자
	public InputTest(){
		Scanner scan = new Scanner(System.in);//System.in은 InputStream타입
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextDouble();
	}
	public int getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	
	public static void main(String[] args) {
		InputTest it = new InputTest();
		System.out.println(it.getA()+"+"+it.getB()+" = "+(it.getA()+it.getB()));

	}

}

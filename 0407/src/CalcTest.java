//320, 258의 합을 구하시오
public class CalcTest {

	public static void main(String[] args) {
		short a, b;
		a = 320;
		b = 258;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		float div = (float)a / b;
		
		System.out.println(a+" + "+ b +" = " + sum);
		System.out.println(a+" - "+ b +" = " + sub);
		System.out.println(a+" * "+ b +" = " + mul);
		System.out.println(a+" / "+ b +" = " + div);
		System.out.printf("%d / %d = %.2f", a, b, div);
	}

}

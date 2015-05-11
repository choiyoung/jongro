
public class CalcTest {

	public static void main(String[] args) {
		int a = 5;
			a += 2;
			a *= 3;
			a /= 8;
			System.out.println("a의 결과 : "+a);
			a++;
			System.out.println("a의 결과 : "+a);
			
			int b = a++;
			System.out.println("a의 결과 : "+a+"\tb의 결과 : "+b);
			
			int c= ++a * b--;
			System.out.println("a의 결과 : "+a+"\tb의 결과 : "+b+"\tc의 결과 : "+c);
			
			System.out.println(a++);//println 상태에서도 변수값을 변경 시킬수 있음
			System.out.println("a="+a);
	}

}

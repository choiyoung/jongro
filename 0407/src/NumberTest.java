
public class NumberTest {

	public static void main(String[] args) {
		System.out.println('A'+3);
		System.out.println("A"+3);
		System.out.println((char)('A'+3));//D-강제형 변환
		System.out.println('2'+10);//60
		System.out.println(('2'-48)+10);//12
		System.out.println(25.0/6);//3->3.0 - 자동형변환
		System.out.println(25.0/6);//25.33
		System.out.println((int)(25.0/6*100+0.5)/100.0);
	}

}

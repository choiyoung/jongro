
public class Operator {

	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a="+a);
		System.out.println("a="+!a);
		
		boolean b = 'A'<'B';
		System.out.println("b="+b);
		System.out.println("b="+!b);
		
		String c = "A";
		String d = "B";
		System.out.println(c.equals(d));
		System.out.println(!(c.equals(d)));
		
		int e = 5;//0000 0000 0000 0000 0000 0000 0000 0101
		System.out.println("10진수 ="+e);
		System.out.println("2진수 ="+Integer.toBinaryString(e));
		
		System.out.println("10진수 ="+(~e+1));//2의 보수 - 음수 표현
		System.out.println("2진수 ="+Integer.toBinaryString(~e+1));
		//비트 연산자
		System.out.println("20^7 = "+(20^7));
		System.out.println("0xca&18 = "+(0xca&18));
	}

}

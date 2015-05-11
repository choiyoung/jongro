
public class ArrayTest {
	static int a;//필드, 초기화
	
	public static void main(String[] args) {
		
		int a = 0;// 지역 변수(local variable), 가비지(Garbage)= 쓸모 없는 값
		
		System.out.println("지역 변수a ="+a);
		System.out.println("필드 a =" + ArrayTest.a);
		System.out.println();
		
		int[] ar = {10,20,30};// 자바의 배열은 int뒤에나 변수명 뒤에 어디든 []을 써서 배열을 만들 수 있다.
							// 단 [] 안에는 수를 적지않는다.
		System.out.println("ar[0] = "+ar[0]);
		System.out.println("ar[1] = "+ar[1]);
		System.out.println("ar[2] = "+ar[2]);
		System.out.println();
		
		int[] ch = {'2','5','3'};
		System.out.println("ch[0] = "+(ch[0]-48));
		System.out.println("ch[1] = "+(ch[1]-48));
		System.out.println("ch[2] = "+(ch[2]-48));
		System.out.println();
		
		String[] str ={"2","5","3"};
		System.out.println("str[0] = "+Integer.parseInt(str[0]));
		System.out.println("str[1] = "+Integer.parseInt(str[1]));
		System.out.println("str[2] = "+Integer.parseInt(str[2]));
		System.out.println();
		
		String[] str2 ={"25.3","52.6","37.8"};
		System.out.println("str2[0] = "+Double.parseDouble(str2[0]));
		System.out.println("str2[1] = "+Double.parseDouble(str2[1]));
		System.out.println("str2[2] = "+Double.parseDouble(str2[2]));
		System.out.println();
		
	}

}

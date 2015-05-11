
public class StringTest {

	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		
		String c = new String("apple");
		String d = new String("apple");
		
		if(a==b) System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다.");
		if(c==d) System.out.println("c와 d의 참조값은 다르다");
		else System.out.println("c와 d의 참조값은 다르다.");
		
		if(a.equals(b)) System.out.println("a와 b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		if(a.equals(b)) System.out.println("c와 d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "천사 ANGEL devil "+123+456;// String은 편집이 안되므로 메모리에 3번 생성된다.
		// +123+456의 +가 문자 결합으로 처리됨(연산자 우선순위) 
		//공백도 문자로 받아줌 String연산자는 편집이 안됨;;;;
		// java는 문자열의 크기는 문자의 개수로 따진다.
		System.out.println("문자열의 크기 = "+e.length());
		System.out.println("문자 추출 = "+ e.charAt(5));// G
		System.out.println("문자 추출 = "+ e.substring(15));
		System.out.println("문자 추출 = "+ e.substring(3,8));// substring(statIndex, endIndex)
		System.out.println("문자 추출 = "+ e.substring(3,8).toLowerCase());//toLowerCase는 소문자로 바꾸어줌
		System.out.println("문자 추출 = "+ e.substring(9,14));
		System.out.println("문자 추출 = "+ e.substring(9,14).toUpperCase());//toUpperCase
		System.out.println("문자 검색 = "+ e.indexOf("사"));//1
		System.out.println("문자 검색 = "+ e.indexOf("34"));//34를 하게 되면 시작 부분을 가져온다.
		System.out.println("문자 검색 = "+ e.indexOf("짜"));//-1
		
		System.out.println(Integer.parseInt("2"));
		System.out.println(String.valueOf(2));
	}

}


public class GenericTest<T> {
	
	private T a;
	public void setA(T a){
		this.a = a;
	}
	public T getA(){
		return a;
	}
	
	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();// 생성
		aa.setA("홍길동");
		aa.getA();
		System.out.println("이름 : "+aa.getA());
		
		//aa.setA(25); String으로 정의 해놓았기 때문에 문자나 문자열이 아니면 들어가지 않는다.
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
		bb.getA();
		System.out.println("나이 : "+bb.getA());
	}

}

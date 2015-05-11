
public class GenericTest2<T> {
	private T a;
	public GenericTest2(T a){
		this.a = a;
	}
	public void setA(T a){
		this.a = a;
	}
	public T getA(){
		return a;
	}

	public static void main(String[] args) {
		GenericTest2<String> aa = new GenericTest2<String>("홍길동");// 생성
		//aa.setA("홍길동");
		Object name = aa.getA();// Object로 들어온 데이터는 Object로 받아 주어야 한다.
		System.out.println("이름 : "+name);
		
		GenericTest2<Integer> bb = new GenericTest2<Integer>(25);
		int age = (Integer)bb.getA();//unAutoBoxing
		System.out.println("나이 : "+age);
		

	}

}

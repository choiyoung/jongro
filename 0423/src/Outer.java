// 중복 클래스
public class Outer {
	private String name;
	// 멤버로 직접 접근이 가능 하다.
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void output(){
		Inner in = new Inner();
		
	}
	
	class Inner{
		private int age;
		public void setAge(int age){// set은 주는것(내 입장에서)
			this.age = age;
		}
		public int getAge(){// get은 받는 것(내 입장에서)
			return age;
		//  반환
		}
		
		public void disp(){
			System.out.println("이름 = "+Outer.this.name+"\t 나이"+this.age);
			// Outer의 this가 생략 되어있다.
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.setName("홍길동");
		System.out.println("이름 = "+outer.getName());
		
		Outer.Inner inner =  outer.new Inner();// outer라는 객체 속에 Inner를 찾아야한다.
		inner.setAge(25);
		inner.disp();
		
		Outer.Inner inner2 =  outer.new Inner();
		inner2.setAge(30);
		inner2.disp();
		
		Outer.Inner inner3 = new Outer(). new Inner();
		inner3.setAge(35);
		inner3.disp();
		
	}

}
// 달러라는건 오른쪽 클래스가 왼쪽클래스에 소속되어 있다고 알려주는 것이다.
//private은 자기 자신만 사용가는 하기 때문에 함수를 이용하여 가져와야한다.
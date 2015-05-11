// 추상메소드가 없어도 추상클래스를 만들어도 된
public abstract class AbstractTest { // 추상메소드가 있는 클래스는 반드시 추상클래스여야 한다.
// 추상클래스를 쓰는 이유는 부모클래스가 자식클래스 제어하기 위하여
// Interface는 다중상속 하기위해 만든다.
	 String name;
	
	public abstract void setName(String name); // 추상메소드
	
	public String getName(){//구현
		
		return name;
	
	}
}

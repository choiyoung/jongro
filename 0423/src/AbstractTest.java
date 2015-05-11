
public abstract class AbstractTest { //pojo형식 = object만 가져오는 것
	protected String name;
	public abstract void setName(String name);// 추상메소드는 누군가가 override해주어야 한다.
	
	public String getName(){// 구현
		return name;
	}
	
}

import java.io.Serializable;

public class ObjectTest extends Object implements Serializable{
	
	private String name;
	private int age;
	private float height;
	
	public ObjectTest(String name, int age, float height) {
		
		super(); // object생성자
		this.name = name;
		this.age = age;
		this.height = height;
		
	}// 여기까지가 받는곳	
	public String getName() {
		return name;
	}	
	public int getAge() {
		return age;
	}
	public float getHeight() {
		return height;
	}//getter로 받음
	
}

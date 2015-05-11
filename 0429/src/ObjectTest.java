import java.io.Serializable;

public class ObjectTest extends Object implements Serializable{
	
	private String name;
	private int age;
	private float height;
	
	public ObjectTest(String name, int age, float height) {
		
		super(); // object������
		this.name = name;
		this.age = age;
		this.height = height;
		
	}// ��������� �޴°�	
	public String getName() {
		return name;
	}	
	public int getAge() {
		return age;
	}
	public float getHeight() {
		return height;
	}//getter�� ����
	
}

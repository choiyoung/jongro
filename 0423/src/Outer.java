// �ߺ� Ŭ����
public class Outer {
	private String name;
	// ����� ���� ������ ���� �ϴ�.
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
		public void setAge(int age){// set�� �ִ°�(�� ���忡��)
			this.age = age;
		}
		public int getAge(){// get�� �޴� ��(�� ���忡��)
			return age;
		//  ��ȯ
		}
		
		public void disp(){
			System.out.println("�̸� = "+Outer.this.name+"\t ����"+this.age);
			// Outer�� this�� ���� �Ǿ��ִ�.
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.setName("ȫ�浿");
		System.out.println("�̸� = "+outer.getName());
		
		Outer.Inner inner =  outer.new Inner();// outer��� ��ü �ӿ� Inner�� ã�ƾ��Ѵ�.
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
// �޷���°� ������ Ŭ������ ����Ŭ������ �ҼӵǾ� �ִٰ� �˷��ִ� ���̴�.
//private�� �ڱ� �ڽŸ� ��밡�� �ϱ� ������ �Լ��� �̿��Ͽ� �����;��Ѵ�.
class ThisTest{
	private String name;
	
	public void setName(String name){//���� 
		
		System.out.println("this = "+this);
		this.name = name;
	}// ���� ����(class)�� �ٸ� ��ȣ this�� ��ȣ�� ���ؼ� �������´�.
	
	public String getName(){
		
		return name;
	}
}
//--------------------
public class ThisMain {
	
	public static void main(String[] args) {
		ThisTest aa= new ThisTest();
		System.out.println("aa= "+aa);
		aa.setName("ȫ�浿");
		System.out.println("�̸� = "+aa.getName());
		System.out.println();
		
		ThisTest bb = new ThisTest();
		System.out.println("aa= "+aa);
		bb.setName("�ڳ�");
		System.out.println("�̸� = "+bb.getName());
		System.out.println();
	}

}

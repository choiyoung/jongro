class PersonTest{
	//�����
	private String name;// �ʵ�, �ʱ�ȭ
	private int age;
	
	// ����
	//setter �޼ҵ�
	public void setName(String n){//���� 
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setData(String n,int a){
		name = n;
		age = a;
	}
	
	public void setData(){}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	
}
//-----------------
//�տ� public�� �ִ°��� �ְ� �ȴ�.

public class PersonMain {

	public static void main(String[] args) {
		PersonTest pt; // ��ü����
		pt = new PersonTest(); //����
		System.out.println("pt = "+pt);
		pt.setName("ȫ�浿");//ȣ��
		pt.setAge(25);
		System.out.println("�̸� = "+pt.getName()+"\t���� = "+pt.getAge());
		
		PersonTest pt2;
		pt2 = new  PersonTest();//����
		System.out.println("pt2 = "+pt2);
		pt2.setName("�ڳ�");//ȣ��
		pt2.setAge(16);
		System.out.println("�̸� = "+pt2.getName()+"\t���� = "+pt2.getAge());
		
		PersonTest pt3;
		pt3 = new PersonTest();
		System.out.println("pt3 = "+pt3);
		pt3.setData("����",30);
		System.out.println("�̸� = "+pt3.getName()+"\t���� = "+pt3.getAge());

		PersonTest pt4;
		pt4 = new PersonTest();
		System.out.println("pt4 = "+pt4);
		pt4.setData();// �ڱⰡ �˾Ƽ� � setData���� ���� ������ ���� ��
		System.out.println("�̸� = "+pt4.getName()+"\t���� = "+pt4.getAge());

		
	}

}

//Ŀ�� �޼ҵ�(300) void �޼ҵ�(1200) 	
// �ְ� ������        set*(             
//                     
// Ŀ�� �޼ҵ�()   void �޼ҵ�()
// �ְ� ����				boolean get*()
// �������� ����
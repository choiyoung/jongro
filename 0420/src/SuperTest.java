public class SuperTest {
	protected double weight, height;
	public SuperTest(){// ���� ������������ �⺻�����ڸ� ��������
		System.out.println("SuperTest �⺻ ������");
	}
	public SuperTest(double w,double h){
		this.weight = w;
		this.height = h;
		
	}
	public void disp(){
		System.out.println("������ : "+weight);
		System.out.println("Ű ="+height);
	}
}


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
		GenericTest2<String> aa = new GenericTest2<String>("ȫ�浿");// ����
		//aa.setA("ȫ�浿");
		Object name = aa.getA();// Object�� ���� �����ʹ� Object�� �޾� �־�� �Ѵ�.
		System.out.println("�̸� : "+name);
		
		GenericTest2<Integer> bb = new GenericTest2<Integer>(25);
		int age = (Integer)bb.getA();//unAutoBoxing
		System.out.println("���� : "+age);
		

	}

}

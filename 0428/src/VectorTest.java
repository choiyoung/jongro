import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;


public class VectorTest {
	public void init(){
		Vector<String>  V = new Vector<String>();
		
		V.add("���");
		V.add("����");
		System.out.println("���� ũ�� = "+ V.size());//2
		System.out.println("���� �뷮 = "+ V.capacity());//10
		
		System.out.println("\n �׸� �߰�");
		V.add("����");
		V.add("������");
		V.add("Ű��");
		V.add("����");
		V.add("�ٳ���");
		V.add("��");
		V.add("��Ÿ�ĸ���");
		V.add("����");
		System.out.println("���� ũ�� = "+ V.size());
		System.out.println("���� �뷮 = "+ V.capacity());

	//	Iterator<String> it = V.iterator();//iterator�� iterator�� ���?
	//	while(it.hasNext()){//�����Ͱ� �ִ� ã���ش�.
	//	System.out.println(it.next());//�����ش� �������� �Ѱ��ش�.
	//	}
		
		System.out.println("\n �׸� ����");
		V.remove("����");
		V.remove(2);//ó���� �ϳ� �����
		
		//for(int i =0;i<V.size();i++){
			//System.out.println(V.get(i));
		//}
		for(String data : V ){
			System.out.println(data);
		}
		
	}
	public static void main(String[] args) {
		new VectorTest().init();

	}

}

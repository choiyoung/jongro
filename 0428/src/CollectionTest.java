import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;




public class CollectionTest {	// �����ϴ�, ������.
	@SuppressWarnings("all")// ���޼����� ������ �ʰ� ���ش�.
	public void init(){
		Collection coll = new ArrayList();
		coll.add("ȣ����");
		coll.add("����");
		coll.add(25);
		coll.add(43.8);
		coll.add("�⸰");
		coll.add("ȣ����");// �ߺ����, ����
		coll.add("�ڳ���");
		
		Iterator it = coll.iterator();//iterater�� iterator�� ���?
		while(it.hasNext()){//�����Ͱ� �ִ� ã���ش�.
		System.out.println(it.next());//�����ش� �������� �Ѱ��ش�.
		}
	}
	public static void main(String[] args) {
		new CollectionTest().init();

	}

}
/* #inteface

1. implements
	��� �߻�޼ҵ� Override

2. �͸� Inner Class
	new Collection(){
		��� �߻�޼ҵ� Override
}
this.addWindowListener(new WindwoAdapter()){
}

*/
	import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;




	public class CollectionTest2 {	// �����ϴ�, ������.
		
		public void init(){
			Collection<String> coll = new ArrayList<String>();
			coll.add("ȣ����");
			coll.add("����");
			//coll.add(25);
			//coll.add(43.8);
			coll.add("�⸰");
			coll.add("ȣ����");// �ߺ����, ����
			coll.add("�ڳ���");
			
			Iterator<String> it = coll.iterator();//iterator�� iterator�� ���?
			while(it.hasNext()){//�����Ͱ� �ִ� ã���ش�.
			System.out.println(it.next());//�����ش� �������� �Ѱ��ش�.
			}
		}
		public static void main(String[] args) {
			new CollectionTest2().init();

		}

	}


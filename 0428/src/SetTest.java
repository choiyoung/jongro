import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {
	public void init(){
		Set<String> set = new HashSet<String>();
		set.add("ȣ����");
		set.add("����");
		set.add("�⸰");
		set.add("�ڳ���");
		// set�� �ߺ������ �ȵ�
		
		Iterator<String> it = set.iterator();//iterator�� iterator�� ���?
		while(it.hasNext()){//�����Ͱ� �ִ� ã���ش�.
		System.out.println(it.next());//�����ش� �������� �Ѱ��ش�.
		}
	}
	public static void main(String[] args) {
		new SetTest().init();

	}

}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class MapTest {
	public void init(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("b101", "�鼳����");
		map.put("b201", "��������");
		map.put("b301", "�鼳����");//Value �ߺ���� map.put(key,Value);
		map.put("b101", "�ξ����");//key �ߺ����(����� ������ �� ������ ���� ������)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڵ� �Է� : ");
		String code = scan.next();
		if(map.get(code)==null)
			System.out.println("�ڵ� error");
		else
			System.out.println(map.get(code));
		
	}
	
	public static void main(String[] args) {
		new MapTest().init();

	}

}

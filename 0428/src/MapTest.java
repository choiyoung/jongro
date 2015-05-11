import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class MapTest {
	public void init(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("b101", "백설공주");
		map.put("b201", "엄지공주");
		map.put("b301", "백설공주");//Value 중복허용 map.put(key,Value);
		map.put("b101", "인어공주");//key 중복허용(허용은 하지만 전 데어터 값이 덮어짐)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("코드 입력 : ");
		String code = scan.next();
		if(map.get(code)==null)
			System.out.println("코드 error");
		else
			System.out.println(map.get(code));
		
	}
	
	public static void main(String[] args) {
		new MapTest().init();

	}

}

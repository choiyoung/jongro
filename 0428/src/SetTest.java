import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {
	public void init(){
		Set<String> set = new HashSet<String>();
		set.add("호랑이");
		set.add("사자");
		set.add("기린");
		set.add("코끼리");
		// set은 중복허용이 안됨
		
		Iterator<String> it = set.iterator();//iterator는 iterator를 출력?
		while(it.hasNext()){//데이터가 있는 찾아준다.
		System.out.println(it.next());//꺼내준다 다음으로 넘겨준다.
		}
	}
	public static void main(String[] args) {
		new SetTest().init();

	}

}

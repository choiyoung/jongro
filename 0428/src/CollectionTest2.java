	import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;




	public class CollectionTest2 {	// 수집하다, 모으다.
		
		public void init(){
			Collection<String> coll = new ArrayList<String>();
			coll.add("호랑이");
			coll.add("사자");
			//coll.add(25);
			//coll.add(43.8);
			coll.add("기린");
			coll.add("호랑이");// 중복허용, 순서
			coll.add("코끼리");
			
			Iterator<String> it = coll.iterator();//iterator는 iterator를 출력?
			while(it.hasNext()){//데이터가 있는 찾아준다.
			System.out.println(it.next());//꺼내준다 다음으로 넘겨준다.
			}
		}
		public static void main(String[] args) {
			new CollectionTest2().init();

		}

	}


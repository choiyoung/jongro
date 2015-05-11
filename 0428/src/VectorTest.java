import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;


public class VectorTest {
	public void init(){
		Vector<String>  V = new Vector<String>();
		
		V.add("사과");
		V.add("딸기");
		System.out.println("백터 크기 = "+ V.size());//2
		System.out.println("백터 용량 = "+ V.capacity());//10
		
		System.out.println("\n 항목 추가");
		V.add("참외");
		V.add("복숭아");
		V.add("키위");
		V.add("수박");
		V.add("바나나");
		V.add("배");
		V.add("스타후르츠");
		V.add("참외");
		System.out.println("백터 크기 = "+ V.size());
		System.out.println("백터 용량 = "+ V.capacity());

	//	Iterator<String> it = V.iterator();//iterator는 iterator를 출력?
	//	while(it.hasNext()){//데이터가 있는 찾아준다.
	//	System.out.println(it.next());//꺼내준다 다음으로 넘겨준다.
	//	}
		
		System.out.println("\n 항목 삭제");
		V.remove("수박");
		V.remove(2);//처음에 하나 사라짐
		
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

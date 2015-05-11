
public class ArrayTest {

	public static void main(String[] args) {
		int[] ar;// 배열 선언
		//int ar[];
		ar =  new int[5];
		ar[0]=25;
		ar[1]=36;
		ar[2]=42;
		ar[3]=57;
		ar[4]=35;
		System.out.println("배열명 ar= "+ar);
		System.out.println("배열크기 = "+ar.length);
		for(int i=0;i<ar.length;i++){
			System.out.println("ar["+i+"]="+ar[i]);
		}
		
		System.out.println("\n JDK 5.0 확장된 for");//입력받을때는 쓰지는 못함
		for(int data : ar){
			System.out.println(data);
		}
	}// 자바에서는 ar주소값이 아니고 참조값이라한다.
	 // 자바는 실제 주소값을 못얻어오며 참조되는 값을 불러온다. 형태는 클래스명@16진수
}


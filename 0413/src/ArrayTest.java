
public class ArrayTest {

	public static void main(String[] args) {
		int[] ar;// �迭 ����
		//int ar[];
		ar =  new int[5];
		ar[0]=25;
		ar[1]=36;
		ar[2]=42;
		ar[3]=57;
		ar[4]=35;
		System.out.println("�迭�� ar= "+ar);
		System.out.println("�迭ũ�� = "+ar.length);
		for(int i=0;i<ar.length;i++){
			System.out.println("ar["+i+"]="+ar[i]);
		}
		
		System.out.println("\n JDK 5.0 Ȯ��� for");//�Է¹������� ������ ����
		for(int data : ar){
			System.out.println(data);
		}
	}// �ڹٿ����� ar�ּҰ��� �ƴϰ� �������̶��Ѵ�.
	 // �ڹٴ� ���� �ּҰ��� �������� �����Ǵ� ���� �ҷ��´�. ���´� Ŭ������@16����
}


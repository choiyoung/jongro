
public class VarArge {
	
	public static void main(String[] args) {
		
		VarArge va = new VarArge();
		System.out.println("합 = "+va.sum(10,20));
		System.out.println("합 = "+va.sum(10,20,30));
		System.out.println("합 = "+va.sum(10,20,30,40));

	}
public int sum(int ...ar){// 인수(매개변수)의 개수를 자유롭게-내부적으로는 배열화
	int hap = 0;
	for(int i=0;i<ar.length;i++){
		hap+=ar[i];
		
	}
	return hap;
	
}

}

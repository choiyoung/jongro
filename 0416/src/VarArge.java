
public class VarArge {
	
	public static void main(String[] args) {
		
		VarArge va = new VarArge();
		System.out.println("�� = "+va.sum(10,20));
		System.out.println("�� = "+va.sum(10,20,30));
		System.out.println("�� = "+va.sum(10,20,30,40));

	}
public int sum(int ...ar){// �μ�(�Ű�����)�� ������ �����Ӱ�-���������δ� �迭ȭ
	int hap = 0;
	for(int i=0;i<ar.length;i++){
		hap+=ar[i];
		
	}
	return hap;
	
}

}

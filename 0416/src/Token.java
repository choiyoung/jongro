import java.util.StringTokenizer;


public class Token {
	
	public static void main(String[] args) {
		String str = "�п�,��,,���ӹ�";
		StringTokenizer st = new StringTokenizer(str,",");//str�� , �� �и��Ͻÿ�
		System.out.println("��ū ���� ="+st.countTokens());
		
		while(st.hasMoreTokens()){// st.hasMoreToken ������ġ�� �ִ��� ������ Ȯ���� 
		
			System.out.println(st.nextToken());// �����ְ� �������� ����
		}
		String[] ar = str.split(",");
		//for(int i = 0; i<ar.length; i++){
		for(String data : ar){
			
			System.out.println(data);
			
			
		}
		
		
	}
	

}

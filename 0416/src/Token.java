import java.util.StringTokenizer;


public class Token {
	
	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		StringTokenizer st = new StringTokenizer(str,",");//str을 , 로 분리하시오
		System.out.println("토큰 개수 ="+st.countTokens());
		
		while(st.hasMoreTokens()){// st.hasMoreToken 현재위치에 있는지 없는지 확인함 
		
			System.out.println(st.nextToken());// 꺼내주고 다음으로 보냄
		}
		String[] ar = str.split(",");
		//for(int i = 0; i<ar.length; i++){
		for(String data : ar){
			
			System.out.println(data);
			
			
		}
		
		
	}
	

}

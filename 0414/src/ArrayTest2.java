
public class ArrayTest2 {

	public static void main(String[] args){
			char[] ar;
			ar = new char[50];
			for(int i=0;i<ar.length;i++){
				
			ar[i]= (char)((int)(Math.random()*26)+65);//65~90
			
		}
			int i=0;
		for(char data : ar){
				System.out.print(data+"  ");
				 i++;
				if(i%10==0) System.out.println();
		}
	}
}
/*자바의 배열을 생성할때 형식은
   
  생성 - 배열(배열명) = new 자료형[방크기]
 
*/
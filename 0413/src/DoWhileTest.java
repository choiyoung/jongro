// A B C D E F ....... X Y Z
/*public class DoWhileTest {

	public static void main(String[] args) {
		
		char ch = 'A';
		do{
			System.out.print(ch+" ");
			ch++;
					
		}while(ch<='Z');


	}

}*/
// A~Z출력하되 1줄에 7개씩 출력하시오
/*
 [실행 결과]
 A B C D E F G
 H I J k L M N
 O P Q R S T U
 V W X Y Z 
  
*/

public class DoWhileTest {

	public static void main(String[] args) {
		
		char ch = 'A';
		int i=0;
							
		do{			
		
			
			
			System.out.print(ch+" ");
				 ch++;
				 i++;
				if(i%7==0) System.out.println();
		}while(ch<='Z');
		
		
				
	}
	}



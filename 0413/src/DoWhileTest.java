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
// A~Z����ϵ� 1�ٿ� 7���� ����Ͻÿ�
/*
 [���� ���]
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



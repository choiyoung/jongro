
/*public class ArrayTest3 {

	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];
		for(int i=0;i<ar.length;i++){
			
			ar[i]= (int)(Math.random()*100)+1;
		
				
			}
		}
		
		for(int data: ar){
			System.out.print(data+" ");
		}
	}

}*/
/*
 1~100 난수를 발생하여 배열에 저장 
 
*/
// 정렬 - Select Sort(오름차순, 내림차순)
public class ArrayTest3 {

	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];
		for(int i=0;i<ar.length;i++){
			
			ar[i]= (int)(Math.random()*100)+1;
		
				
			}
		for(int i=0;i<ar.length-1;i++){
			for(int j=i+1;j<ar.length;j++)
			if(ar[i]>ar[j]){
				int temp;
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
	
		for(int data: ar){
			System.out.print(data+" ");
		}
	}

}
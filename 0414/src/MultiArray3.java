
public class MultiArray3 {

	public static void main(String[] args) {
		int[][] ar = new int[11][11];
		int c=1;
		for(int j=1;j<11;j++){
			
			for(int i=1;i<11;i++){
				ar[i][j]=c++;
			}
		}
		for(int i=1;i<ar.length;i++){
			for(int j=1;j<11;j++){
				
				System.out.print("ar["+i+"]["+j+"] = "+ar[i][j]+"\t");
			
			}
			System.out.println();
		}
	}

}

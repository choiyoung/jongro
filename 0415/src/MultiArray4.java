/*
 * 
 */
public class MultiArray4 {

	public static void main(String[] args) {
		int[][] ar= {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0}};	
		for(int i=0; i<ar.length-1;i++){
			
			for(int j=0;j<ar[i].length-1;j++){
				ar[i][3] += ar[i][j];
				ar[3][i] += ar[j][i];
				ar[3][3] += ar[i][j];
			}
		}
		for(int i=0; i<ar.length;i++){
			for(int j=0;j<ar.length;j++){
				//System.out.print(ar[i][j]+"  ");
				System.out.printf("%4d",ar[i][j]);
			}
			System.out.println();
		}
	}

}

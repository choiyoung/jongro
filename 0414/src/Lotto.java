import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Lotto {

	public static void main(String[] args) throws  IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] lotto = new int[6];
		int money;
		
		System.out.print("�� ?");
		money = Integer.parseInt(br.readLine());
		
		//1~45������ ������ �߻��Ͽ� �迭 ����
		for(int k=1;k<=money/1000;k++){
		
		for(int i = 0; i<lotto.length; i++){
			
			lotto[i]= (int)(Math.random()*45)+1;
			
			for(int j = 0; j<i;j++){
				if(lotto[i]==lotto[j]){ i--; break;}
			}
			
		}
		
		Arrays.sort(lotto);
		//���
		for(int data : lotto){
			System.out.print(data+"  ");
		}
		System.out.println();
		
		if(k%5==0){
			System.out.println();
		}
	}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ForTest2 {

	public static void main(String[] args) throws  IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		System.out.print("���ϴ� ���� �Է� : ");
		int dan = Integer.parseInt(br.readLine());
		for(i=1;i<=9;i++){
			
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
	}

}
/*
���ϴ� ���� �Է� : 7
7*1=7
7*2=14 
~~~
~~~
~~~
7*9=63
*/
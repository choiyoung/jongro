import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1~100������ ������ �߻��Ͽ����ϴ�.\n���߾� ������.");
		int num;
		num = (int)(Math.random()*100)+1;
		int c= 0;
	
		
		
		while(true){
			System.out.print("���� �Է����ּ��� : ");
			
			int i = Integer.parseInt(br.readLine());
			
			c++;
			if(i<num) System.out.println(i+"���� �۽��ϴ�.");
			else if(i>num) System.out.println(i+"���� Ů�ϴ�.");
			else break;
				
							
		}

		System.out.println("���մϴ�."+c+" ���߼̽��ϴ�.");
	}

}

/*
 ���� ���߱� ����
 1~100������ ������ �߻����� ���ߴ� ����
[���� ���]
1~100������ ������ �߻��Ͽ����ϴ�.
���߾� ������.

�����Է� : 50
50���� Ů�ϴ�.
�����Է� : 80
80���� �۽��ϴ�.
...
�����Է� : 77
��ī��ī..xx������ ���߼̽��ϴ�.
*/
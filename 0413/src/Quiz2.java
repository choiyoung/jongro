import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� ���� �� ����
/*
 	��ǻ�Ͱ� 1~3������ ������ �߻��Ѵ�
 	���� 1000���� ���ȴ�
 	�� �������� ���α׷� ����
 1. ����
 2. ����
 3. ��
 ���� �Է� : 2
 ���� �ݾ� : 200
 
 ��ǻ�� : ���� ����� : ����
 	You Win!!
 �ܾ� 1200�� �Դϴ�.
 
 
 */
public class Quiz2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		System.out.println("���� 1000�� ���˴ϴ�.");
		System.out.println("���� ��� �����ø� ���� ���ϴ�.");
		System.out.println("1. ���� 2. ���� 3. ��");
		
		
		num = (int)((Math.random()*3)+1);
		System.out.println(num);

		
		
		
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 �̸�, ����, ����, ���� ������ �Է��Ͽ� ����, ���, ������ ���Ͻÿ�
 [���� ���]
 �̸� �Է� : ȫ�浿
 ���� �Է� : 98
 ���� �Է� :100
 ���� �Է� : 95
 
 *** ȫ�浿 ����ǥ ***
 ����	����	����	����	���	����
 98		100		95		293		xxx		xxx
  90�̻� A
  80�̻� B
  70�̻� C
  60���� D
  50���� F
 */
public class IfTest3 {

	public static void main(String[] args) throws  IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			System.out.print("�̸��� �Է����ּ��� : ");
			String name = br.readLine() ; 
			System.out.print("���� ���� : ");
			int kor = Integer.parseInt(br.readLine());
			System.out.print("���� ���� : ");
			int eng = Integer.parseInt(br.readLine());
			System.out.print("���� ���� : ");
			int math= Integer.parseInt(br.readLine());
			int tot;
			char grade = 0;
			
			tot = kor + eng + math;
			
			double avg = (int)(tot/3.0*100+0.5)/100.0;
			
			/*if(avg>=90)		 grade = 'A';
			
			else if(avg>=80) grade = 'B';
			
			else if(avg>=70) grade = 'C';
			
			else if(avg>=60) grade = 'D';
			
			else 			 grade = 'F';
			*/
			switch((int)avg/10){
			case 10:  grade='A';break;
			case 9 : grade='A';break;
			case 8 : grade='B';break;
			case 7 : grade='C';break;
			case 6 : grade='D';break;
			default : grade='F';
			
			
			 
			}
			System.out.println(" *** "+name+"�� ����ǥ *** ");
			System.out.println("����\t����\t����\t����\t���\t����\t");
			System.out.printf(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+grade+"\t");
			
			
	}

}

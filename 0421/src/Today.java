// �� ���� �Է¹޾� �޷��� ����ÿ� set�� ���
/* [���� ���]
 �� �Է� : 2014
 �� : 2
 
 �� �� ȭ �� �� �� ��
 	   1  2  3  4  5
 	   .......
 28	   
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Today {
	public Today(){
		System.out.println("���� ���� : "+new Date());
		
		//Calendar cal = new  Caledar();- error
		//Calendar cal = new  GregorianCalendar(); // Sub Class�� �̿��Ͽ� ����
		Calendar cal = Calendar.getInstance();//�޼ҵ� ����
		
		//�ڽ��� ���� Ŭ������ �Լ��� �̿��Ͽ� ������Ų��.
		//int year = cal.get(Calendar.YEAR);
		int year = cal.get(1);//get(1)�� YEAR(��)�̴�.
		int month = cal.get(Calendar.MONTH)+1;//���� 1���� 0���� ��⶧���� +1�� ���־���Ѵ�.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int Week = cal.get(Calendar.DAY_OF_WEEK);
		String WeekDay=null;
		switch(Week){
		case 1 : WeekDay="�Ͽ���"; break;
		case 2 : WeekDay="������"; break;
		case 3 : WeekDay="ȭ����"; break;
		case 4 : WeekDay="������"; break;
		case 5 : WeekDay="�����"; break;
		case 6 : WeekDay="�ݿ���"; break;
		case 7 : WeekDay="�����"; break;
		}
		System.out.println("���� ���� :"+year+"��"+month+"��"+day+"��"+WeekDay);
		
		
	}
	
	public static void main(String[] args) {
		Today t = new Today();

	}

}
// veoni5@naver.com
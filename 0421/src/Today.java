// 년 월을 입력받아 달력을 만드시오 set을 사용
/* [실행 결과]
 년 입력 : 2014
 월 : 2
 
 일 월 화 수 목 금 토
 	   1  2  3  4  5
 	   .......
 28	   
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Today {
	public Today(){
		System.out.println("현제 날자 : "+new Date());
		
		//Calendar cal = new  Caledar();- error
		//Calendar cal = new  GregorianCalendar(); // Sub Class를 이용하여 생성
		Calendar cal = Calendar.getInstance();//메소드 생성
		
		//자식이 없는 클래스는 함수를 이용하여 생성시킨다.
		//int year = cal.get(Calendar.YEAR);
		int year = cal.get(1);//get(1)은 YEAR(년)이다.
		int month = cal.get(Calendar.MONTH)+1;//월은 1월을 0부터 잡기때문에 +1을 해주어야한다.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int Week = cal.get(Calendar.DAY_OF_WEEK);
		String WeekDay=null;
		switch(Week){
		case 1 : WeekDay="일요일"; break;
		case 2 : WeekDay="월요일"; break;
		case 3 : WeekDay="화요일"; break;
		case 4 : WeekDay="수요일"; break;
		case 5 : WeekDay="목요일"; break;
		case 6 : WeekDay="금요일"; break;
		case 7 : WeekDay="토요일"; break;
		}
		System.out.println("오늘 날자 :"+year+"년"+month+"월"+day+"일"+WeekDay);
		
		
	}
	
	public static void main(String[] args) {
		Today t = new Today();

	}

}
// veoni5@naver.com
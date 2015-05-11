import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 이름, 국어, 영어, 수학 점수를 입력하여 총점, 평균, 학점을 구하시오
 [실행 결과]
 이름 입력 : 홍길동
 국어 입력 : 98
 영어 입력 :100
 수학 입력 : 95
 
 *** 홍길동 성적표 ***
 국어	영어	수학	총점	평균	학점
 98		100		95		293		xxx		xxx
  90이상 A
  80이상 B
  70이상 C
  60이하 D
  50이하 F
 */
public class IfTest3 {

	public static void main(String[] args) throws  IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			System.out.print("이름을 입력해주세요 : ");
			String name = br.readLine() ; 
			System.out.print("국어 점수 : ");
			int kor = Integer.parseInt(br.readLine());
			System.out.print("영어 점수 : ");
			int eng = Integer.parseInt(br.readLine());
			System.out.print("수학 점수 : ");
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
			System.out.println(" *** "+name+"의 성적표 *** ");
			System.out.println("국어\t영어\t수학\t총점\t평균\t학점\t");
			System.out.printf(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+grade+"\t");
			
			
	}

}

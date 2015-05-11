import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.System.out;

public class ImportStatic {
	
	public static void main(String[] args) {
		out.println(random());
		out.println(pow(2,5));
	}

}
/*[첫 번째 문제] 
[필드-전역변수]
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111";  //정답-상수화

[메소드]
생성자 - Scanner를 이용해서 데이터 입력
compare() - 비교//for문
getName()
getOx(){ return ox; }
getScore()

[처리결과]
이름 입력 : 홍길동
답 입력 : 13211

    이름       1 2 3 4 5      점수
   홍길동    O X X O O      60
   for문을 이용 비교 채점


2번째 문제

   [실습] 객체배열
 //static이 꼭 들어가야함 하지 않으면 합이 나오지 않음
클래스명 : Fruit
필드       : pum, jan, feb, mar, tot
               sumJan, sumFeb, sumMar

메소드   : 생성자(데이터,데이터,..)
              calc()
              disp()
              output() - static 메소드

클래스명 : FruitMain

[결과]
PUM   JAN   FEB   MAR   TOT
==================
사과    100    80     75      255  ---> Fruit

포도     30     25     10      xxx  ---> Fruit

딸기     25     30     90      xxx  ---> Fruit

==================
         xxx     xxx   xxx         ---> output()

 */
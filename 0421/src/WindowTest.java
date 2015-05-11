// 모두 대문자인 경우는 상수이다. 정해져 있고 변경시킬수 있다.
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
// 자바에서 중요한 기능 override

public class WindowTest extends Frame {

	public WindowTest(){// 구현부
	
	super("ㅇㅅㅇ");//setTitle(String Title)써도 된다. 더 활용도가 넓다
	// paint()메소드가 윈도 창을 띄운곳에 글을 쓸수있다.
	//setBackground(Color.PINK);// 창을 띄운 배경을 (핑크)로 바꾸어준다.	
	setBackground(new Color(33,124,216)); //생성자를 넣을 때는 new를 앞에 해주어야한다.
	//setSize(300,400);
	setBounds(700,100,300,400);
	//show(); 줄이 그어져 있으면 단품되서 쓰지말아라는 표시
	setVisible(true);
	System.out.println("여기는 콘솔창에서 쓸수 있는것");
	}
	// 그림을 그리겠다는 paint 
	// Graphics 은 도구
	
	public void paint(Graphics g){// 구현부이지만 java가상 머신이 불러준다.(콜백 메소드)
								  //				==
								  // setVisible이 뜰때 사용될때 Java가상 머신이 불러준다. 
		g.drawString("도형그리기",100,80);
		g.drawLine(120,120,200,200);
		g.drawRect(120, 120, 80, 80);
		g.drawOval(110, 110, 100, 100);
	
	}
	public static void main(String[] args) {
		WindowTest wt  = new WindowTest();

	}

}
// 4byte(32bit)색
// 빛의 3요소
// 	Rad			Grin		Bule
//	 1byte		1byte		1byte
// 0000 0000   00000 0000	00000 0000
// 그림판(mspaint)에서 R G B의 색 조절을 볼수있다.
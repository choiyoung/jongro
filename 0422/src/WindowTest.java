import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class WindowTest extends Frame implements MouseListener, MouseMotionListener{
	// MAIN
	public static void main(String[] args) {
		//WindowTest wt = new WindowTest();
		//wt.init();
		// 클래스 메모리를 만들고 생성자 만들어주고 init을 불러줌
		new WindowTest().init();
	}
	
	
	//-------------------------------------------------------------------
	
	
	
	public void init(){
		//super() 생성자는 생성자만 부를 수 있다.
		setTitle("이미지");
		setBounds(700,80,400,400);		
		setVisible(true);
		
		//이벤트
		this.addMouseListener(this);
		this.addWindowListener(new WindowExit());
	}
	
	// 콜백 자바가상머신에서 한번 호출하기 때문에 main에선 쓸 수 없다.
	public void paint(Graphics g){
		g.drawString("이쁜그림",170,100);
	}

	// Mouse Listener
	public void mouseClicked(MouseEvent arg0) {System.out.println("마우스 클릭");}
	public void mouseEntered(MouseEvent arg0) {System.out.println("마우스 IN");}
	public void mouseExited(MouseEvent e) {System.out.println("마우스 OUP");}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
//---------------------------------------------------

	// Mouse MotionListener
	public void mouseDragged(MouseEvent arg0) {}
	public void mouseMoved(MouseEvent arg0) {}

}

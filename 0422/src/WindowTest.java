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
		// Ŭ���� �޸𸮸� ����� ������ ������ְ� init�� �ҷ���
		new WindowTest().init();
	}
	
	
	//-------------------------------------------------------------------
	
	
	
	public void init(){
		//super() �����ڴ� �����ڸ� �θ� �� �ִ�.
		setTitle("�̹���");
		setBounds(700,80,400,400);		
		setVisible(true);
		
		//�̺�Ʈ
		this.addMouseListener(this);
		this.addWindowListener(new WindowExit());
	}
	
	// �ݹ� �ڹٰ���ӽſ��� �ѹ� ȣ���ϱ� ������ main���� �� �� ����.
	public void paint(Graphics g){
		g.drawString("�̻۱׸�",170,100);
	}

	// Mouse Listener
	public void mouseClicked(MouseEvent arg0) {System.out.println("���콺 Ŭ��");}
	public void mouseEntered(MouseEvent arg0) {System.out.println("���콺 IN");}
	public void mouseExited(MouseEvent e) {System.out.println("���콺 OUP");}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
//---------------------------------------------------

	// Mouse MotionListener
	public void mouseDragged(MouseEvent arg0) {}
	public void mouseMoved(MouseEvent arg0) {}

}

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class WindowExit implements WindowListener{

	
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}// 닫아주는 행동을 해주는
	public void windowClosing(WindowEvent arg0) {System.exit(0);}// 호출 , 실행
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

}

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;


public class Clock extends Frame implements Runnable {
	
	private String time;
	private Thread t;
	public void init(){
		
		t = new Thread(this);// 스레드 생성 - Runnable를 가진 클래스를 스래드로 생성해야한다.
		
		t.start();//스래드를 시작해주어야 한다.
		// Frame 창 생성
		setFont(new Font("Calibi",Font.BOLD,20));// 시계 폰트 조정
		setForeground(new Color(255,0,0));
		setBounds(800,200,400,200);
		setVisible(true);
		
		// 이벤트
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	} // init()
public void run(){
	
		while(true){
			//Calender cal = new GregorianCalendar();
			Calendar cal = Calendar.getInstance();// 메소드를 이용해도 괜찮다.
			int hour =	cal.get(Calendar.HOUR_OF_DAY);
			int minute = cal.get(cal.MINUTE);
			int second = cal.get(cal.SECOND);
			time = hour +" : "+minute+" : "+second;
		
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	
}

public void paint(Graphics g){
	
	g.drawString(time,100,100);
	
}

public static void main(String[] args){
	
	
	new Clock().init();
	
	
}
}
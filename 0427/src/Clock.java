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
		
		t = new Thread(this);// ������ ���� - Runnable�� ���� Ŭ������ ������� �����ؾ��Ѵ�.
		
		t.start();//�����带 �������־�� �Ѵ�.
		// Frame â ����
		setFont(new Font("Calibi",Font.BOLD,20));// �ð� ��Ʈ ����
		setForeground(new Color(255,0,0));
		setBounds(800,200,400,200);
		setVisible(true);
		
		// �̺�Ʈ
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	} // init()
public void run(){
	
		while(true){
			//Calender cal = new GregorianCalendar();
			Calendar cal = Calendar.getInstance();// �޼ҵ带 �̿��ص� ������.
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
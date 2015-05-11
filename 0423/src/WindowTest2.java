import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;





public class WindowTest2 {
	private Frame frame;
	private Button redB,greenB,blueB,exitB;
	private DrCanvas can;
	
	public WindowTest2(){
		frame = new Frame(); // frame을 불러주자 , 순서를 지키자
		redB = new Button("빨강");
		greenB = new Button("그린");
		blueB = new Button("파랑");
		exitB = new Button("끝내기");//생성
		
		can = new DrCanvas();
		
		Panel p = new Panel();//FlowLayout(순서대로 - 중앙)
		p.add(redB);
		p.add(greenB);
		p.add(blueB);
		p.add(exitB);
		
		frame.add("North",p);// frame을 생성시켜주지 않으면 null값을 갔기때문에 nullpointerExcetion이 실행시킬때 발생된다.
		frame.add("Center", can);
		
		
		frame.setBounds(800,100,300,400);
		frame.setVisible(true);
		
		
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		// 상황마다 생성 해주기 때문에 if를 쓰지 않아도 된다. 안드로이드에서 많이씀
		exitB.addActionListener(new ActionListener(){//ActionListener을 new 시킨게 아니라 뒤에있는 익명을 new 시킨것이다.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		redB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(255,0,0));
			}
		});
		greenB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,255,0));
			}
		});
		blueB.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,0,255));
			}
		});
	}
	public class DrCanvas extends Canvas{
		public DrCanvas(){
			setBackground(new Color(255,0,255));
		}
	}

		

	public static void main(String[] args) {
		new WindowTest2();
		

	}

}

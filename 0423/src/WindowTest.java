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


public class WindowTest extends Frame implements ActionListener{// BorberLayout(동,서,남,북)
	private Button redB,greenB,blueB,exitB;//초기값으로 null로 잡고잇음
	private DrCanvas can;
	
	public WindowTest(){
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
		
		this.add("North",p);
		// 그냥은 하나밖에 올려 놓을 수 없다. 그래서 Panel을 써서 같이 쓸 수 있게한다.
		
		this.add("Center", can);
		
		setBounds(800,100,300,400);
		setVisible(true);
		
		// 이벤트
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		exitB.addActionListener(this);// 끝내기 버튼
		redB.addActionListener(this);
		greenB.addActionListener(this);
		blueB.addActionListener(this);
	}
	
	
	
	public class DrCanvas extends Canvas{
		public DrCanvas(){
			setBackground(new Color(255,0,255));
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==redB){
			can.setBackground(new Color(255,0,0));
		}
		else if(e.getSource()==greenB){
			can.setBackground(new Color(0,255,0));
		}
		else if(e.getSource()==blueB){
			can.setBackground(new Color(0,0,255));
		}	
		else if(e.getSource()==exitB){
			System.exit(0);
		}		
	}
		
		
		
	
	
	
	
	
	// MAIN
	public static void main(String[] args) {
		
		new WindowTest();

	}


}

//Component(도구)   
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


public class WindowTest extends Frame implements ActionListener{// BorberLayout(��,��,��,��)
	private Button redB,greenB,blueB,exitB;//�ʱⰪ���� null�� �������
	private DrCanvas can;
	
	public WindowTest(){
		redB = new Button("����");
		greenB = new Button("�׸�");
		blueB = new Button("�Ķ�");
		exitB = new Button("������");//����
		
		can = new DrCanvas();
		
		Panel p = new Panel();//FlowLayout(������� - �߾�)
		p.add(redB);
		p.add(greenB);
		p.add(blueB);
		p.add(exitB);
		
		this.add("North",p);
		// �׳��� �ϳ��ۿ� �÷� ���� �� ����. �׷��� Panel�� �Ἥ ���� �� �� �ְ��Ѵ�.
		
		this.add("Center", can);
		
		setBounds(800,100,300,400);
		setVisible(true);
		
		// �̺�Ʈ
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		exitB.addActionListener(this);// ������ ��ư
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

//Component(����)   
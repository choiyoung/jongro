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
		frame = new Frame(); // frame�� �ҷ����� , ������ ��Ű��
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
		
		frame.add("North",p);// frame�� ������������ ������ null���� ���⶧���� nullpointerExcetion�� �����ų�� �߻��ȴ�.
		frame.add("Center", can);
		
		
		frame.setBounds(800,100,300,400);
		frame.setVisible(true);
		
		
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		// ��Ȳ���� ���� ���ֱ� ������ if�� ���� �ʾƵ� �ȴ�. �ȵ���̵忡�� ���̾�
		exitB.addActionListener(new ActionListener(){//ActionListener�� new ��Ų�� �ƴ϶� �ڿ��ִ� �͸��� new ��Ų���̴�.
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

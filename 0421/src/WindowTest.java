// ��� �빮���� ���� ����̴�. ������ �ְ� �����ų�� �ִ�.
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
// �ڹٿ��� �߿��� ��� override

public class WindowTest extends Frame {

	public WindowTest(){// ������
	
	super("������");//setTitle(String Title)�ᵵ �ȴ�. �� Ȱ�뵵�� �д�
	// paint()�޼ҵ尡 ���� â�� ������ ���� �����ִ�.
	//setBackground(Color.PINK);// â�� ��� ����� (��ũ)�� �ٲپ��ش�.	
	setBackground(new Color(33,124,216)); //�����ڸ� ���� ���� new�� �տ� ���־���Ѵ�.
	//setSize(300,400);
	setBounds(700,100,300,400);
	//show(); ���� �׾��� ������ ��ǰ�Ǽ� �������ƶ�� ǥ��
	setVisible(true);
	System.out.println("����� �ܼ�â���� ���� �ִ°�");
	}
	// �׸��� �׸��ڴٴ� paint 
	// Graphics �� ����
	
	public void paint(Graphics g){// ������������ java���� �ӽ��� �ҷ��ش�.(�ݹ� �޼ҵ�)
								  //				==
								  // setVisible�� �㶧 ���ɶ� Java���� �ӽ��� �ҷ��ش�. 
		g.drawString("�����׸���",100,80);
		g.drawLine(120,120,200,200);
		g.drawRect(120, 120, 80, 80);
		g.drawOval(110, 110, 100, 100);
	
	}
	public static void main(String[] args) {
		WindowTest wt  = new WindowTest();

	}

}
// 4byte(32bit)��
// ���� 3���
// 	Rad			Grin		Bule
//	 1byte		1byte		1byte
// 0000 0000   00000 0000	00000 0000
// �׸���(mspaint)���� R G B�� �� ������ �����ִ�.
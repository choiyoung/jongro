import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ATMTest implements Runnable {
	private long depositeMoney = 100000; // �ܾ�
	private long balance;// ã���� �ϴ� �ݾ�
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm,"����");// ������ ����
		Thread son = new Thread(atm,"�Ƶ�");// ������ ����
		mom.start();//������ ���� - ������ ����
		son.start();

	}

	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName()+"�� �ȳ��ϼ���");//������ �Ѿ���� �����带 �˷���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ã���� �ϴ� �ݾ� �Է� : ");
		
			try {
				balance = Long.parseLong(br.readLine());
			} catch(NumberFormatException e){
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
							withDraw();
	}
	public void withDraw(){
		if(depositeMoney>=balance){
			if(balance%10000==0){
				depositeMoney-=balance;//depositeMoney = depositeMoney-balance;
			System.out.println("�ܾ���"+depositeMoney+"�� �Դϴ�.");
			}else{
				System.out.println("���� ������ ����� �����մϴ�.");
			}
		}
		else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ATMTest implements Runnable {
	private long depositeMoney = 100000; // 잔액
	private long balance;// 찾고자 하는 금액
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		Thread mom = new Thread(atm,"엄마");// 스레드 생성
		Thread son = new Thread(atm,"아들");// 스레드 생성
		mom.start();//스레드 시작 - 스레드 실행
		son.start();

	}

	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName()+"님 안녕하세요");//나한테 넘어오는 스레드를 알려줌
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("찾고자 하는 금액 입력 : ");
		
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
			System.out.println("잔액은"+depositeMoney+"원 입니다.");
			}else{
				System.out.println("만원 단위로 출금이 가능합니다.");
			}
		}
		else{
			System.out.println("잔액이 부족합니다.");
		}
		
	}

}

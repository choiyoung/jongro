
public class RoseTest extends Thread{
	private String str;
	public RoseTest(String str){
		this.str =str;
	}
	public void run(){
		for(int i = 1; i <= 7;i++){
			System.out.println(str+"\t"+Thread.currentThread());
			try{
			Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		RoseTest aa= new RoseTest("사랑");// aa Thread 생성
		RoseTest bb= new RoseTest("가시");// bb Thread 생성
		RoseTest cc= new RoseTest("정열");// cc Thread 생성
		
		aa.setName("사랑");
		bb.setName("가시");
		cc.setName("정열");
		
		aa.setPriority(Thread.MAX_PRIORITY);
		bb.setPriority(Thread.MIN_PRIORITY);
		cc.setPriority(Thread.NORM_PRIORITY);
		
		aa.start();// Thread 시작_스레드 실행(운영체제-run())
		//aa.join();
		bb.start();
		cc.start();
	}

}

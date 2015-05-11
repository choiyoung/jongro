
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
		RoseTest aa= new RoseTest("���");// aa Thread ����
		RoseTest bb= new RoseTest("����");// bb Thread ����
		RoseTest cc= new RoseTest("����");// cc Thread ����
		
		aa.setName("���");
		bb.setName("����");
		cc.setName("����");
		
		aa.setPriority(Thread.MAX_PRIORITY);
		bb.setPriority(Thread.MIN_PRIORITY);
		cc.setPriority(Thread.NORM_PRIORITY);
		
		aa.start();// Thread ����_������ ����(�ü��-run())
		//aa.join();
		bb.start();
		cc.start();
	}

}


public class SingleTon {
	private int num = 3;
	private static SingleTon instance;
	
	public static SingleTon getInsance(){
		
		if(instance==null){
			synchronized(SingleTon.class){
				instance = new SingleTon();
			}
		}
		return instance;
	}
	
	public void calc(){
		num++;
		
	}
	public void disp(){
		System.out.println("num = "+num);
	}
	public static void main(String[] args) {
		SingleTon aa = new SingleTon();
		aa.calc();
		aa.disp();
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.calc();
		bb.disp();
		System.out.println();
		
		System.out.println("*** ΩÃ±€≈Ê ***");
		
		SingleTon cc = SingleTon.getInsance();
		cc.calc();
		cc.disp();
		System.out.println();
		
		SingleTon dd = SingleTon.getInsance();
		dd.calc();
		dd.disp();
		System.out.println();
	}

}




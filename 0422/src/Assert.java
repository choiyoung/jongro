import java.util.Scanner;




public class Assert {
	private int x,y;
	
	public void Input(){
		Scanner scan = new Scanner(System.in);
		System.out.print("x���� �Է����ּ��� : ");
		 x = scan.nextInt();
		System.out.print("y���� �Է����ּ��� : ");
		 y = scan.nextInt();
		
	}
	public  void output(){
		int mul=1;
		
		assert y>=0 : "y�� 0���� Ŀ���մϴ�.";
		
		for(int i=1;i<=y;i++){
			mul*=x;
		}
		System.out.println(x+"��"+y+"��"+mul);
	}
	
	public static void main(String[] args){
		Assert as = new Assert();
		as.Input();
		as.output();
		
	}

}
// Input()
// x �Է� : 2
// y �Է� : 5
// Output()
// 2�� 5�� xx
// 2*2*2*2*2
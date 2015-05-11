import java.util.Scanner;




public class Assert {
	private int x,y;
	
	public void Input(){
		Scanner scan = new Scanner(System.in);
		System.out.print("x값를 입력해주세요 : ");
		 x = scan.nextInt();
		System.out.print("y값를 입력해주세요 : ");
		 y = scan.nextInt();
		
	}
	public  void output(){
		int mul=1;
		
		assert y>=0 : "y는 0보다 커야합니다.";
		
		for(int i=1;i<=y;i++){
			mul*=x;
		}
		System.out.println(x+"의"+y+"승"+mul);
	}
	
	public static void main(String[] args){
		Assert as = new Assert();
		as.Input();
		as.output();
		
	}

}
// Input()
// x 입력 : 2
// y 입력 : 5
// Output()
// 2의 5승 xx
// 2*2*2*2*2
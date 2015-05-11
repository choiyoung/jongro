class ThisTest{
	private String name;
	
	public void setName(String name){//구현 
		
		System.out.println("this = "+this);
		this.name = name;
	}// 같은 구역(class)에 다른 번호 this의 번호에 의해서 구분짓는다.
	
	public String getName(){
		
		return name;
	}
}
//--------------------
public class ThisMain {
	
	public static void main(String[] args) {
		ThisTest aa= new ThisTest();
		System.out.println("aa= "+aa);
		aa.setName("홍길동");
		System.out.println("이름 = "+aa.getName());
		System.out.println();
		
		ThisTest bb = new ThisTest();
		System.out.println("aa= "+aa);
		bb.setName("코난");
		System.out.println("이름 = "+bb.getName());
		System.out.println();
	}

}

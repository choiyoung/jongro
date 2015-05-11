class PersonTest{
	//비공개
	private String name;// 필드, 초기화
	private int age;
	
	// 공개
	//setter 메소드
	public void setName(String n){//구현 
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setData(String n,int a){
		name = n;
		age = a;
	}
	
	public void setData(){}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	
}
//-----------------
//앞에 public이 있는것이 주가 된다.

public class PersonMain {

	public static void main(String[] args) {
		PersonTest pt; // 객체선언
		pt = new PersonTest(); //생성
		System.out.println("pt = "+pt);
		pt.setName("홍길동");//호출
		pt.setAge(25);
		System.out.println("이름 = "+pt.getName()+"\t나이 = "+pt.getAge());
		
		PersonTest pt2;
		pt2 = new  PersonTest();//생성
		System.out.println("pt2 = "+pt2);
		pt2.setName("코난");//호출
		pt2.setAge(16);
		System.out.println("이름 = "+pt2.getName()+"\t나이 = "+pt2.getAge());
		
		PersonTest pt3;
		pt3 = new PersonTest();
		System.out.println("pt3 = "+pt3);
		pt3.setData("쵸파",30);
		System.out.println("이름 = "+pt3.getName()+"\t나이 = "+pt3.getAge());

		PersonTest pt4;
		pt4 = new PersonTest();
		System.out.println("pt4 = "+pt4);
		pt4.setData();// 자기가 알아서 어떤 setData인지 들어가는 변수에 따라 들어감
		System.out.println("이름 = "+pt4.getName()+"\t나이 = "+pt4.getAge());

		
	}

}

//커피 메소드(300) void 메소드(1200) 	
// 넣고 나오는        set*(             
//                     
// 커피 메소드()   void 메소드()
// 넣고 저장				boolean get*()
// 나오지는 않음
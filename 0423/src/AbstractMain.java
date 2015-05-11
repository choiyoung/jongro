
public class AbstractMain{
	
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest(){ // 익명 Inner class
			public void setName(String name){
				this.name = name;
			}
		};
		InterA aa = new InterA(){ // 익명 Inner class를 생성 시켜준것이다.
			public void aa(){}			
			public void bb(){}
			
		};
		AbstractExam ae = new AbstractExam(){// override를 골라서 쓸 수 있다.
			
		}; 
	}

}

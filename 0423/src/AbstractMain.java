
public class AbstractMain{
	
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest(){ // �͸� Inner class
			public void setName(String name){
				this.name = name;
			}
		};
		InterA aa = new InterA(){ // �͸� Inner class�� ���� �����ذ��̴�.
			public void aa(){}			
			public void bb(){}
			
		};
		AbstractExam ae = new AbstractExam(){// override�� ��� �� �� �ִ�.
			
		}; 
	}

}

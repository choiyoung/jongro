//자기가 Override하기싫으면 되물림 자식 클래스 넘긴다. 대신 꼭 다음은 Override해주어야 한다.
public class AbstractMain extends AbstractTest{ 
	public void setName(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); - error 추상클래스여서 혼자서 공간을 잡을 수 없다.
		AbstractTest at = new AbstractMain();

	}

}

//�ڱⰡ Override�ϱ������ �ǹ��� �ڽ� Ŭ���� �ѱ��. ��� �� ������ Override���־�� �Ѵ�.
public class AbstractMain extends AbstractTest{ 
	public void setName(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); - error �߻�Ŭ�������� ȥ�ڼ� ������ ���� �� ����.
		AbstractTest at = new AbstractMain();

	}

}

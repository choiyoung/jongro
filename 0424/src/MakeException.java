public class MakeException extends Exception{//MakeException�� Exception�� ��� �Ѵٴ°��� MakeException�� Exception�� �����(����ڰ� ���� ����)
	private String errMsg;
	
	public MakeException(){}
	public MakeException(String errMsg){
		this.errMsg = errMsg;
	}
	@Override
	public String toString(){//��ü�� ���۷������� �ٲپ� �ַ��� toString �޼ҵ带 ����Ѵ�.
		
		return errMsg;
		
	}
}

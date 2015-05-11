public class MakeException extends Exception{//MakeException가 Exception을 상속 한다는것은 MakeException가 Exception을 대신해(사용자가 만든 오류)
	private String errMsg;
	
	public MakeException(){}
	public MakeException(String errMsg){
		this.errMsg = errMsg;
	}
	@Override
	public String toString(){//객체의 레퍼런스값을 바꾸어 주려면 toString 메소드를 사용한다.
		
		return errMsg;
		
	}
}

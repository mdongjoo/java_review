package throwTest;

public class MyException extends Exception {
	//사용자 지정 예외 처리
	
	//생성자 
	public MyException(){
		super("음수를 입력하면 안됩니다");
	}
}

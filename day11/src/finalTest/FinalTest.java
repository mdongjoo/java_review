package finalTest;

public class FinalTest {
	final static int MAX_LENGTH = 100 ;
	
	public static void main(String[] args) {
		int maxLength = 10 ;
		System.out.println(maxLength);
		maxLength = 30 ;
		System.out.println(maxLength);
		
		//클래스 내부에서 상수를 선언하는 방법 
		System.out.println(MAX_LENGTH);
//		MAX_LENGTH = 200 ; //상수는 동일한 값만 넣어줄 때 사용한다 .
	}
}

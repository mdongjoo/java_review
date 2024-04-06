package exceptionTest;

public class ExceptionTest04 {
	public static void main(String[] args) {
		
		//클래스, 코드 등을 사용하다보면 필수적으로 예외처리 코드를 작성해야하는 경우가있다 
		
		try {
		Class.forName("java.lang.String");
		System.out.println("\"java.lang.String\"라는 클래스가 존재합니다 .");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
		
		try {
			Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
}
}
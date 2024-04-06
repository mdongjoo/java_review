package exceptionTest;

public class ExceptionTest02 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작 ");
		ExceptionTest02 et = new ExceptionTest02();
		
		et.printLength(null);
		
		System.out.println("프로그램 실행 종료 ");
	}
	//메소드
	public void printLength(String data) {
		try{
		int result = data.length();
		}catch(NullPointerException e) {
			//예외정보를 얻는 3가지 방법
			//1. 
			System.out.println(e.toString()); //예외 종류 , 발생이유 리턴 
			//2. 
			System.out.println(e.getMessage()); //예외 발생 이유만 리턴
			//3.
			e.printStackTrace();//발생의 추적 위치 출력 
		}finally {
			System.out.println("예외처리 끝");
		}
	
	}
}

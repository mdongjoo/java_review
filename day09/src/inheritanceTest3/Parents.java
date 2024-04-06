package inheritanceTest3; //패키지 

public class Parents { //클래스 선언부 
	//필드 정수형 변수 선언 
	int number; 
	
	//메소드 반환값없고 매개변수 문자열을 받는 메서드 
	void printStr(String str) {
		System.out.println(str); //출력
	}//메소드 종료 
	//기본 생성자 
	public Parents() {
		super();//모든 클래스의 최상위클래스는 object클래스 
		System.out.println("Parents 생성자 호출 "); //출력
	} //생성자 종료
	
	
}//클래스 종료 

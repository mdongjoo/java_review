package classTest; //패키지 

public class Student { //클래스 선언부 
	//필드
	String name; //클래스 필드 문자열 변수 선언 
	int math; //정수형 멤버변수 정수형 변수 3개 선언 
	int eng;
	int kor;
	double avg; //실수형 멤버변수 선언 
	char grade; //문자형 멤버변수 선언 
	
	//메소드
	//학생의 총합을 구하는 기능을 가진 메소드 
	int getTotal() { //정수형 반환타입을 가진 메소드 
		return math + eng + kor; //리턴값 int
	} //메소드 종료 
	//평균을 구하는 기능을 가진 메소드
	//매개변수 x 리턴값
	double getAvg() { //실수형 반환타입을 가진 메소드 
		return getTotal() /3.0; //리턴값 실수형 
	} //메소드 종료 
	//
	
}//클래스 종료 

package classTest02;//패키지 

public class MarvelHero { //클래스 선언부 

	//필드
	String name; //문자열 필드 선언 
	String superPower; //문자열 필드 선언 
	int age; //정수형 필드 선언 
	//메소드
	//히어로 정보 출력 메소드
	void heroInfo() { //반환값 없는 메소드 
		System.out.println("마블 이름 : "+ name ); //출력 
		System.out.println("슈퍼 파워 : "+ superPower ); //출력 
		System.out.println("나이 : "+ age ); //출력 
	} //메소드 종료 
	//히어로 액션 메소드
	void performAction() {//반환값 없는 메소드 
		System.out.println(name + " 이/가 슈퍼파워를 사용합니다/");//출력 
	} //메소드 종료 
	//생성자
	public MarvelHero() { //기본 생성자 
		
	}// alt shift s + o
	public MarvelHero(String name, String superPower, int age) { //매개변수 3개짜리 생성자 
		this.name = name; //this: 객체 자기자신의 필드에 매개변수값 대입 
		this.superPower = superPower;//객체 자기자신의 필드에 매개변수값 대입 
		this.age = age;//객체 자기자신의 필드에 매개변수값 대입 
	}//생성자 종료 
	
} //클래스 종료 

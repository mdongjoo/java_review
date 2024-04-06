package review; //패키지 

public class Tv { //클래스 선언부 
	//필드 //정수형 필드 2개 , 논리형 1개 , 문자열 1개 
	int ch;
	int vol;
	boolean power;
	String color;
	
	//메소드 
	void powerOnOff() { //반환값없고 매개변수 없는 단순 출력 메소드 
		System.out.println("Tv 전원을 켜고 끕니다");
	}
	
	void chUp() {//반환값없고 매개변수 없는 단순 출력 메소드 
		System.out.println("현재 채널 ;" + ch);
		System.out.println("티비의 채널을 1올립니다" + ++ch);
	}
	void chDown() {//반환값없고 매개변수 없는 단순 출력 메소드 
		System.out.println("현재 채널 ;" + ch);
		System.out.println("티비의 채널을 1내립니다" + --ch);
	}
	//생성자
	//생성자 오버로딩 : 같은 이름의 생성자로 매개변수의 
	// 타입 , 개수 , 순서가 다르면 선언이 가능하다
	public Tv(int ch, int vol, boolean power, String color) { //매개변수 4개인 생성자 
	//	super();
		this.ch = ch; //객체의 필드에 매개변수를 통한 값 대입 
		this.vol = vol;//객체의 필드에 매개변수를 통한 값 대입 
		this.power = power;//객체의 필드에 매개변수를 통한 값 대입 
		this.color = color;//객체의 필드에 매개변수를 통한 값 대입 
	}//생성자 종료 
	
} //클래스 종료 

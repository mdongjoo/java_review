package classTest02; //패키지 

public class MarvelMain { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		MarvelHero ironMan = new MarvelHero("아이언맨", "에너지빔", 20); //객체 생성 
		System.out.println(ironMan); //출력 
		
		MarvelHero hulk = new MarvelHero(); //객체 생성 
		System.out.println(hulk); //출력 
		
		ironMan.name = "아이언맨"; //객체의 문자열 필드에 문자열 대입해 초기화 
		ironMan.superPower = "빔";//객체의 문자열 필드에 문자열 대입해 초기화 
		ironMan.age = 30; //객체의 정수형  필드에 정수값 대입해 초기화 
		
		hulk.name = "헐크";//객체의 문자열 필드에 문자열 대입해 초기화 
		hulk.superPower = "주먹";//객체의 문자열 필드에 문자열 대입해 초기화 
		hulk.age = 30; //객체의 정수형  필드에 정수값 대입해 초기화 
		
		ironMan.performAction(); //객체에 메소드 호출 
		hulk.performAction();//객체에 메소드 호출 
		
		ironMan.heroInfo();//객체에 메소드 호출 
		hulk.heroInfo();//객체에 메소드 호출 
	} //메인 메소드 종료 
} //클래스 종료 

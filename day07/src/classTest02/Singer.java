package classTest02; //패키지 

public class Singer { //클래스 선언부 
	//필드
	String artist; //문자열 필드 선언 
	String title;//문자열 필드 선언 
	String album;//문자열 필드 선언 
	
	//메소드
	//정보출력 메소드
	void artistInfo() { //반환값없는 메소드 
		System.out.println("노래 제목: "+ title);//출력 
		System.out.println("가수 명: "+ artist);
		System.out.println("앨범명: "+ album);
	}//메소드 종료 
} //클래스 종료 

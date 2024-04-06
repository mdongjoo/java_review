package classTest02; //패키지 

public class SingerMain { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//객체 생성
		Singer s1 = new Singer(); 
		
		s1.title = "노래 제목"; //객체 필드에 문자열 대입해 초기화 
		s1.artist = "가수 이름";//객체 필드에 문자열 대입해 초기화 
		s1.album = "앨범 명";//객체 필드에 문자열 대입해 초기화 
		
		s1.artistInfo(); //객체 메소드 호출 
	} //메인 메소드 종료 
} //클래스 종료 

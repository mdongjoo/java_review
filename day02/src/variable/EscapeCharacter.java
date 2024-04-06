package variable; //패키지명 variable

public class EscapeCharacter { //접근제한자 public 클래스명 EscapeCharacter
	public static void main(String[] args) { //접근제한자 public 정적키워드 static 반환값 void 메인메소드 
		System.out.println("안녕하세요\t 반갑습니다"); //제어문자 tab 
		System.out.println("안녕하세요\n 반갑습니다"); //제어문자 줄바꿈
		System.out.println("안녕하세요\" 웹개발 공부\" 를 열심히 합니다"); //제어문자 "
 		System.out.println("안녕하세요\' 반갑습니다\'"); //제어문자 '
		System.out.println("안녕하세요\\ 반갑습니다\\"); //제어문자\
	}
}

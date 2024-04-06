package day03; //패키지명 

public class Review { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		//복사 단축키 : ctrl + alt + 방향키 위아래
		//이동 단축키 : alt + 방향키 위아래 
		char ch1 = ' '; //문자형 변수 초기값으로 선언 및 초기화 
		//char 타입은 '' 빈 문자 지정할 수 없다 (오류발생)
		//String 타입은 "" 빈 문자열 값을 넣을 수 있다 
		System.out.println(ch1); //출력문 
		System.out.println("========="); //출력문 
		
		String st1 = ""; //문자열 초기값으로 선언 및 초기화 
		System.out.println(st1); //출력문 
		System.out.println("========="); //출력문 
	      //""안에 숫자가 들어가 있어도 ""로 묶여있으면 문자열이다
	      System.out.println("12424" + 1); // 문자열로 연결되어 출력
	      System.out.println(12424 + 1); //숫자로 연산하여 출력
	      
	} //메인메소드 종료
} //클래스 종료 

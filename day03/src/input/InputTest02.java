package input; //패키지명 

import java.util.Scanner; //입력 클래스 불러오기 

public class InputTest02 { //클래스 선언부 

	public static void main(String[] args) { //메인메소드 선언부 
		//import 자동완성 ctrl + shift + o 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		
		System.out.print("1 입력 :"); //출력문 
		String str1 = scan.next(); //문자열 입력받아 문자열 변수에 대입 
		System.out.println(str1); //출력
		
		System.out.print("2 입력 :"); //출력
		String str2 = scan.next(); //문자열 입력받아 문자열 변수에 대입
		System.out.println(str2); //출력
		
		System.out.print("3 입력 :"); //출력
		String str3 = scan.next(); //문자열 입력받아 문자열 변수에 대입
		System.out.println(str3); //출력
	} //메인메소드 종료
} //클래스 종료 

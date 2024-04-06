package oper; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class SwitchTest01 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		int choice = 0 ; //정수형 변수 초기값으로 선언 및 초기화 
		String result = ""; //문자열 변수 초기값으로 선언 및 초기화 
		
		System.out.print("1부터 4까지 정수 입력 : "); //출력
		choice = scan.nextInt(); //정수값을 입력받아 정수형 변수에 대입 
		
		switch(choice) { //switch -case문 
		case 1: case 3: //case 1,3 의 값은 동일하니 같은 코드줄에 작성 
			result = "홀수";
			break ; //{} 탈출
		case 2: case 4:
			result = "짝수";
			break ;

//		case 3:
//			result = "홀수";
//			break ;

//		case 4:
//			result = "짝수";
//			break ;

		default : //case에 해당하지 않는 나머지 경우는 모두 default로 들어옴 
			result = "잘못 입력하셨습니다."; //출력 
			break ; //{}탈출 
		} //switch 종료 
		System.out.println(result); //종료
	} //메인메소드 종료 
} //클래스 종료 

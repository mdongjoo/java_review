package input; //클래스명 

import java.util.Scanner; //스캐너 클래스 불러오기 

public class InputTask02 { //클래스 시작부
	public static void main(String[] args) { //메인메소드 선언부 
		//두 정수를 입력받고 합을 출력하기
		//next()메소드만 사용
		Scanner scan = new Scanner(System.in); //객체 생성
		System.out.print("입력1 : "); //출력문 
		int num1 = Integer.parseInt(scan.next()); //입력을 문자열로 받은 것을 정수형으로 바꾸어준 값을 정수형 변수에 대입 
		System.out.print("입력2 : "); //출력문 
		int num2 = Integer.parseInt(scan.next());//입력을 문자열로 받은 것을 정수형으로 바꾸어준 값을 정수형 변수에 대입 
		System.out.println(num1 + num2); //출력문 
		//자료형의 기본값
		//int : 0
		//double : 0.0
		//char : ' '
		//String : "" , null
		
		//로직구성먼저!
		//class Scanner 불러오기
		//import
		//정수형 변수 2개 선언
		//입력받은 문자열을 정수로 바꾼후 초기화 
		//정수 + 정수 (연산값) 출력
	} //메인메소드 종료
} //클래스 종료 

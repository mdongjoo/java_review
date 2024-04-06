package oper; //패키지 

public class OperTest02 { //클래스 선언부
	public static void main(String[] args) { //메인 메소드 선언부 
		//삼항연산자
		//조건식 ? 참일 때 값 : 거짓일 때 값
		int num1 = 10 , num2 = 20 , num3 = 20 ;  //정수형 변수에 값을 대입하여 선언 및 초기화 
		String num4 = num1 >= 9 ? num1 + "이 9보다 큽니다" : "크지않습니다."; //삼항연산자 문자열값을 문자열 변수에 대입 
		System.out.println(true ? 10 : 20); //삼항연산자 출력문 
		System.out.println(false ? 10 : 20); //삼항연산자 출력문 
		System.out.println(num4); //출력 
	} //메인 메소드 종료
} //클래스 종료 

package oper; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class OperTest01 { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		//두자리수 정수를 입력받고 십의 자리와 일의 자리를 각각 출력하기
		//정수형 변수 3개 선언
		//출력 메시지
		//입력 받아서 변수에 저장 (nextInt())
		//십의 자리 /
		//일의 자리 %
		//코드 잘못짬
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		System.out.print("두자리수 정수를 입력 :"); //출력
		int result = scan.nextInt(); //정수형 입력받아 선언된 정수형 변수에 값을 대입해 초기화  
		int tens = result /10; //정수값 계산하여 선언된 정수형 변수에 값을 대입해 초기화  
		int units = result %10; //정수값 계산하여  선언된 정수형 변수에 값을 대입해 초기화  
		System.out.println("십의 자리 : "+ tens); //출력
		System.out.println("일의 자리 : "+ units); //출력
		
		scan.close(); //객체 삭제 
		
	}//메인메소드 종료
}//클래스 종료 

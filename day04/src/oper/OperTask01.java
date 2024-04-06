package oper; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class OperTask01 { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부
		//정수 2개를 입력받아서 큰수 출력하기 
		//10보다 20이 더 큽니다 .
		//로직구성
		//Scanner import
		//정수 변수 선언 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		System.out.print("정수 2개 입력해주세요 :"); //출력
		int num1 = scan.nextInt(); //정수값 정수형 변수에 대입
		int num2 = scan.nextInt(); //정수값 정수형 변수에 대입
		System.out.println(num1 > num2 ? num2 + "보다"+num1 + "이 더 " //출력 
				+ "큽니다." : num1 + "보다"+num2 + "이 더 큽니다.");
		scan.close(); //객체 종료 
	} //메인메소드 종료 
} //클래스 종료 

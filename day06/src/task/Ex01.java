package task; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class Ex01 { //클래스 선언부 
//1. 사용자로부터 정수 n을 입력받아 1부터 n까지 합을 구하는 프로그램
//	[출력결과]
//			정수 입력 : 4
//			입력한 숫자는 4입니다
//			1부터 4까지의 합은 10입니다
		//로직 
	// Scanner import close
	// 입력한 숫자 저장할 정수형 변수 선언
	// 합의 숫자를 저장할 정수형 변수 선언
	// 출력문
	// for문
	public static void main(String[] args) { //메인 메소드 선언부 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		System.out.print("정수 입력 : "); //출력
		int num = scan.nextInt(); //정수값 입력받아 정수형 변수에 대입해 선언 및 초기화 
		int sum = 0; //정수형 변수 초기값으로 선언 및 초기화 
		System.out.println("입력한 숫자는 "+ num + "입니다"); //문자열로 출력 
		for(int i = 0 ; i < num ; i ++) { //for문 반복문 num값 만큼 반복 
			sum += i+1; //i+1만큼 sum 에 대입 
		} //for문 종료 
		System.out.println("1부터 " + num + "까지의 합은 "+ sum + "입니다"); //문자열 출력 
		scan.close(); //객체 삭제 
	} //메인 메소드 종료 
} //클래스 종료 

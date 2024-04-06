package oper; //패키지

import java.util.Scanner; //입력 객체 불러오기

public class IfTest02 { //클래스 선언부
	public static void main(String[] args) { //메인메소드 선언부
		System.out.println("start"); //출력
		
		int num = 0 ; //정수형 변수를 초기값으로 선언 및 초기화 
		Scanner scan = new Scanner(System.in); //입력 객체 생성
		System.out.print("입력 :"); //출력
		num = scan.nextInt(); //정수값을 입력받아 정수형 변수에 대입 
		
		//조건식 
		//짝수면 짝수입니다 출력 홀수면 홀수입니다 출력
		if(num%2 == 0) { //조건문 if 짝수값은 참 홀수값은 false
			System.out.println(num + "은 짝수"); //출력
		}else { //거짓값 {}
			System.out.println("홀수"); //출력
		} //else종료
		System.out.println("종료"); //출력
	} //메인메소드 종료
} //클래스 종료

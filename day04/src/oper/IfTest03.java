package oper;//패키지

import java.util.Scanner; //입력 클래스 불러오기

public class IfTest03 { //클래스 선언부
	public static void main(String[] args) { //메인메소드 선언부 
		//if else if else 문 
		//학생의 java 성적을 입력받아서 학점(A+ABC) 계산하기
		//A+ : 100 , A :90~99 B : 70~89 C :그외 
		//입력클래스 import
		//출력메세지 
		//변수 = 입력메소드 nextInt()
		//조건문 
		Scanner scan = new Scanner(System.in); //입력객체 생성
		System.out.print("학생의 java성적을 입력하세요 :");//출력
		int javaScore = scan.nextInt(); //정수값 입력받아 정수형 변수에 대입하며 선언 및 초기화 
		//자바에서는 비교연산자를 연속해서 범위를 지정할 수 없음
		//논리연산자를 이용해 두개의 비교연산을 결합하여 진행 
		if(javaScore == 100) { // if -else 문으로 범위 조건문 
			System.out.println("A+");//출력 
		}else if(javaScore >= 90){
			System.out.println("A");
		}else if(javaScore >=80) {
			System.out.println("B");
		}else { //그외
			System.out.println("C");
		}
		
		scan.close();//객체 종료 
	}//메인메소드 종료
} //클래스 종료 

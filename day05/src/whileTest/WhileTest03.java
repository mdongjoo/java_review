package whileTest; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class WhileTest03 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
	      //1) 입력클래스 import
	      //2) 숫자 저장할 변수
	      //3) do{
	      //4)    숫자 입력 메시지 출력
	      //5)    변수 nextInt() 사용
	      //6)   조건문(if <= 0) {
	      //7)      양수가 아닙니다 출력 }
	      //8) }while(<= 0)
	      //9) 출력

//		while문으로 바꾸기
	      //1) 입력클래스 import
	      //2) 카운트변수(숫자저장할 변수)
		  //3) while(<=0){
		  //4)   숫자 입력 메시지 출력
	      //5)   변수 nextInt() 사용
	      //6)   조건문(if <= 0) {
	      //7)     양수가 아닙니다 출력 }
		  //8) 출력
		Scanner sc = new Scanner(System.in); //입력 객체 생성 
		int number = 0; //정수형 변수에 초기값으로 선언 및 초기화 
		while(number <= 0) { //while 문 조건문 number값이 0보다 작거나 같으면 참 
			System.out.println("숫자 입력 : "); //출력 
			number = sc.nextInt(); //정수값을 입력받아 변수에 대입 
			if(number <= 0) { //if문 number값이 0보다 작거나 같으면 참 
				System.out.println("양수가 아닙니다"); //출력
			} //if문 종료 
		} //while 문 종료 
		System.out.println(number + "양수입니다");//출력 
	} //메인 메소드 종료 
} //클래스 종료 

















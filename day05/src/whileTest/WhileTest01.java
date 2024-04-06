package whileTest; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class WhileTest01 { // 클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		// 안녕하세요 000님 환영합니다 10번 출력
		// 로직구성
		// 1) 카운트 변수 선언
		// 2) while (카운트변수 < 11){
		// 3) 출력문(안녕하세요 000님 환영합니다)
		// 4) ++ 증감연산자
		// }
		
		//로직구성
		// 1) 입력 클래스 import
		// 2) 이름 변수 선언
		// 3) 카운트 변수(반복횟수를 조건식)
		// 4) while문 {
		// 5) 입력받을 메시지
		// 6) 이름 입력 메소드
		// 7) 출력 메시지
		// 8) ++ 증감연산자
		
		Scanner sc = new Scanner(System.in); //입력 객체 생성 
		String name = ""; //문자열 변수에 초기값으로 선언 및 초기화 
		int cnt = 1; //정수형 변수에 1을 대입하여 선언 및 초기화 
		while(cnt < 11) { //while 문 cnt값이 11보다 작으면 참 
			System.out.println("이름을 입력하세요 : "); //출력
			name = sc.nextLine(); //문자열 변수에 엔터를 소모하는 ,띄어쓰기까지 출력하는 문자열을 대입 
			System.out.println("안녕하세요 " + name + "님 환영합니다"); //출력 
			cnt++; //cnt 값을 연산증감자를 이용해 값을 1씩 증가 
		} //while문 종료 
	} //메인 메소드 종료 
} //클래스 종료 












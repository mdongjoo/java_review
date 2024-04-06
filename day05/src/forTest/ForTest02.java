package forTest; //패키지 

public class ForTest02 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//1번 김영선
		//2번 김영선
		//3번 김영선
		//4번 김영선
		//5번 김영선
		//for문 이용해서 출력하기
		
		//로직구성
		//1) for반복문선언 (초기식 : int i = 0;
		//				조건식 : i < 5;
		//				증감식 : i++)
		//2) 이름 출력(i 변수 활용)
		for(int i = 0; i < 5; i++) { //for문 반복문 
			System.out.println(i+1 +"번 김영선"); //문자열 출력 
		} //for문 종료 중괄호 
		
		//10번째 김영선 ~ 1번째 김영선
		//1) 초기식 int i = 10;
		// 조건식 i >= 1;
		// 증감식 i--
		//2) 출력
		for(int i = 10; i >= 1; i--) { //for문 반복문 값을 하나씩 줄이기 
			System.out.println(i + "번째 김영선"); //출력 
		} //for문 종료 중괄호 
		
		//1) 초기식 int i = 0;
		// 조건식 i < 10;
		// 증감식 i++
		//2) 출력
		for(int i = 1; i <= 10; i++) { //for문 반복문 
			System.out.println(11 - i + "번째 김영선"); //출력문 
			System.out.println(i); //출력문 
		} //for문 종료 중괄호 
	} //메인 메소드 종료 
} //클래스 종료 










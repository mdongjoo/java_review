package oper; //패키지 

public class WhileTest01 { //클래스 선언부
	public static void main(String[] args) { //메인 메소드 선언부 
		int cnt = 0 ; //정수형 변수 초기값으로 선언 및 초기화 
		while(cnt < 5) { //while 반복문 cnt<5 동안 
			System.out.println("안녕하세요"); //출력
			cnt ++ ;  //후위 증감자 ++ 사용
		} //while 종료  
	} //메인 메소드 종료 
} //클래스 종료 

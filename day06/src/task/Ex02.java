package task;//패키지 

public class Ex02 { //클래스 선언부 
//	2. 구구단을 2단부터 9단까지 출력하는 프로그램(while문 사용, 단마다 tab키 적용)
	//로직
	//while문 사용 cnt, dan ++ 사용
	//단마다 tab키 사용
	
	public static void main(String[] args) { //메인 메소드 선언부 
		int dan = 2 ; //정수형 변수에 값을 대입해 선언 및 초기화 
		int cnt = 1 ;//정수형 변수에 값을 대입해 선언 및 초기화 
		while(dan < 10) { //while문 dan 값이 10보다 작으면 참 
			System.out.println(dan + " X " + cnt + " = "+ dan * cnt);//출력
			cnt ++ ; //증감 연산자로 1씩 증가 
			if(cnt == 10 ) { //if문 cnt가 10이면 참 
				dan ++ ; //증감 연산자로 1씩 증가 
				cnt = 1 ; //cnt 값 1 대입 
				System.out.println("\t"); //tab
			} //if문 종료 
		} //while 문 종료 
	} //메인 메소드종료 
} //클래스 종료 

package whileTest; //패키지 

public class WhileTest02 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//1부터 100까지의 짝수의 합 출력(while문)
		
		//로직구성
		//1) 변수 선언(카운트, 총합)
		//2) 반복문(while){
//		 	출력 카운트변수
		//3) 조건문(if (카운트 % 2 == 0)){
		//4) 총합 구할 변수 += 카운트 }
		//5) 카우트 변수 증가
		//6) 출력
		
		int cnt = 1, even = 0; //정수형 변수 ,를 이용해 값을 대입하여 선언및 초기화 
		while (cnt <= 100 ) { //while 문 cnt 값이 100보다 작으면 참 
//			System.out.println(cnt);
			if (cnt % 2 == 0) { //if문 조건문 값이 짝수일때 중괄호 안으로 들어감 
				even += cnt; //정수형 변수에 cnt 값을 대입 
			} //if문 종료 
			cnt++; //증감연산자를 이용해 정수값을 1증가 
		} //while 문 종료 
		System.out.println(even);		//출력
	} //메인 메소드 종료 
} //클래스 종료 













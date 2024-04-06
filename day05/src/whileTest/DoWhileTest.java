package whileTest; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class DoWhileTest { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
//		boolean isTrue = false;
//		
//		while(isTrue) {
//			System.out.println("출력");
//		}
//		
//		do {
//			System.out.println("김영선");
//		}while(isTrue);
		
		//사용자로부터 숫자를 입력받아서 해당 숫자가 양수인지 검사
		//입력된 숫자가 양수가 아니면 사용자에게 다시 입력하라는
		//메시지를 출력하고 다시 입력받기
		//입력된 숫자가 양수일 경우만 양수입니다 출력
		
		//1) 입력클래스 import
		//2) 숫자 저장할 변수
		//3) do{
		//4)	 숫자 입력 메시지 출력
		//5)	 변수 nextInt() 사용
		//6)	조건문(if <= 0) {
		//7)		양수가 아닙니다 출력 }
		//8) }while(<= 0)
		//9) 출력
		
		Scanner sc = new Scanner(System.in); //입력 객체 생성 
		int number = 0; //정수형 변수에 초기값으로 선언 및 초기화 
		do {  //do -while문 으로 do중괄호에서 무조건 한번 출력후 while문으로 
			System.out.println("숫자 입력 : "); //출력문 
			number = sc.nextInt(); //정수형 변수에 정수값 입력 
			
			if (number <= 0) { //if문 조건문으로 정수값 0보다 작으면 참 
				System.out.println("양수가 아닙니다. 다시 입력하세요."); //출력 
			} //if문 종료 
		}while(number <= 0); // while문 조건문 정수값이 0보다 작으면 do중괄호로 들어감 
		
		System.out.println(number + "는 양수입니다"); //출력 
	} //메인 메소드 종료
} //클래스 종료 












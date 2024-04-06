package task; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class Ex03 { //클래스 선언부 
//	3. 사용자로부터 두개의 숫자와 연산기호를 입력받아 두 숫자의 사칙연산을 출력하는 프로그램
//	(연산기호 : +, -, *, /)
	//로직 
	//Scanner import close 
	//입력받은 두 숫자와 , 연산기호를 저장할 정수형 변수2개와 문자형 변수 1개를 선언
	//switch case 문 사용
	//출력문
	public static void main(String[] args) { //메인 메서드 선언부 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		int num1 , num2 ; //정수형 변수 선언 
		char c ; //문자형 변수 선언 
		System.out.print("두개의 숫자를 입력하세요: "); //출력 
		num1 = scan.nextInt(); //정수값을 입력받아 변수에 대입 
		num2 = scan.nextInt();//정수값을 입력받아 변수에 대입 
		System.out.print("연산 기호를 입력하세요 :");//출력 
		c = scan.next().charAt(0); //문자열을 입력받아 0번 인덱스 즉 한자리 값만 문자형으로 받아 변수에 대입 
		switch(c) { //switch case문으로 값에 따라 출력하는 방식을 다르게 함 
		case '+' : //case + 를 입력받으면 
			System.out.println(num1 + num2); //출력
			break; //switch문 탈출 
		case '-' ://case -를 입력받으면 
			System.out.println(num1 - num2);
			break;
		case '*' ://case * 를 입력받으면 
			System.out.println(num1 * num2);
			break;
		case '/' ://case / 를 입력받으면 
			System.out.println(num1 / num2);
			break;
		default ://case경우 제외 나머지 경우 
			System.out.println("연산기호가 잘못 입력되었습니다.");//출력 
			break ;
		}//switch case문 종료 
		scan.close(); //객체 삭제 
	} //메인 메소드 종료 
} //클래스 종료 

package home04;

import java.util.Scanner;

public class Ex04 {

//사용자로부터 사칙연산(+, -, *, /) 중 하나를 입력받아 
//	두 개의 정수에 대해 해당 연산을 수행하여 결과를 출력하기
	public static void main(String[] args) {
		//로직 
		//Scanner import close
		//정수형 변수 2개 , 사칙연산 문자형 변수 1개 _
		//switch case 문 사용 
		//출력문 
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.print("사칙연산을 정해주세요( + - * / ):");
		char ch1 = scan.next().charAt(0);
		
		switch(ch1){
			case '+' :
				System.out.println(num1 + num2);
				break ;
			case '-' :
				System.out.println(num1 - num2);
				break ;
			case '*' :
				System.out.println(num1 * num2);
				break ;
			case '/' :
				System.out.println(num1 / num2);
				break ;
			default :
				System.out.println("사칙연산을 잘못골랐습니다. ");
				break ;
		}
		scan.close();
		
	}
}

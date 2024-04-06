package task04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
//	4. 사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz",
//	5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz",
//	그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
//	사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.
	//로직 
	//Scanner import close
	//x의 배수 : % ==0 을 이용 
	//문자열 입력은 입력받고 바로 try catch문 사용
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num =0 ;
		int excnt = 0;
		//try-catch 
		try {
		num = scan.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다");
			excnt++;
		}
		//if문 //공배수 먼저 처리 
		if(num % 3 ==0 && num%5 ==0 && excnt ==0) {
			System.out.println("FizzBuzz");
		}else if(num % 3 ==0&& excnt ==0) {
			System.out.println("Fizz");
		}else if(num % 5 ==0&& excnt ==0) {
			System.out.println("Buzz");
		}else if(excnt ==0){
			System.out.println(num);
		}
		scan.close();
		}
	}



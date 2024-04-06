package ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

//문동주
public class Main {
public static void main(String[] args) throws MyException {
	//정수형 변수 3개 선언
	int num1=0 ;
	int num2=0;
	int num3=0;
	//입력받을 값이 어떤 것인지 메시지를 출력하고 입력 메소드를 사용하여 입력받기
	//scanner import close
	Scanner scan = new Scanner(System.in);
	System.out.print("나누어질 숫자를 입력하세요 :");
	//try catch 문을 예외가 일어날 문장을 넣고 
	try {
		num1 = scan.nextInt();
		System.out.print("나눌 숫자를 입력하세요:");
		num2 = scan.nextInt();
		if(num2 <= 0 ) { 
		throw new MyException();
		}
	System.out.println("나눈 결과 : " + num1/num2);
	
	}catch(MyException e) {
		System.out.println("0또는 음수는 나눌 수 없습니다.");
	}catch(InputMismatchException e) {
		System.out.println("예상치 못한 오류가 발생하였습니다.");
		e.printStackTrace();
	}
	scan.close();
}
}

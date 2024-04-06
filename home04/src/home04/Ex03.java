package home04;

import java.util.Scanner;

public class Ex03 {
//	사용자로부터 연속적으로 정수를 입력받다가 0이 입력되면 입력을 종료하고, 그동안 입력받은 모든 정수의 합을 출력하기
	public static void main(String[] args) {
		//로직 
		//Scanner import 
		//while 
		//합을 저장할 정수형 변수선언
		//출력문
		Scanner scan = new Scanner(System.in);
		int sum = 0 ;
		
		while(true) {
			System.out.print("정수를 입력하세요 :");
			int num = scan.nextInt();
			if(num == 0) {
				System.out.println("합의 값은 :" + sum);
				break ;
			}else {
				sum += num ;
			}
		}
	}
}

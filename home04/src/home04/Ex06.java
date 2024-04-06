package home04;

import java.util.Scanner;

public class Ex06 {
//	사용자로부터 세 개의 숫자를 입력받아 세 수 중 중간값을 출력하기
	public static void main(String[] args) {
		//로직
		//Scanner import close
		//int 형 변수 3개 선언
		//if
		//출력 
		Scanner scan = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입력하세요 ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1 > num2 ) {
			if(num2 > num3) {
				System.out.println(num2);
			}else if(num1 > num3){
				System.out.println(num3);
			}else {
				System.out.println(num1);
			}
		}else if(num1 > num3){
			System.out.println(num1);
		}else if(num2 > num3) {
			System.out.println(num3);
		}else {
			System.out.println(num2);
		}
	}
}

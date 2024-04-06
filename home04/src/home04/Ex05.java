package home04;

import java.util.Scanner;

public class Ex05 {
//	사용자로부터 두 개의 문자를 입력받아 두 문자 중 아스키코드 값이 더 큰 문자를 출력하기
	public static void main(String[] args) {
		//로직
		//Scanner import close
		//int형 2개 변수 선언
		//아스키코드
		//if 비교
		//출력
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 문자를 입력하세요:");
		//아스키코드 번호로 입력받기
		int ch1 = (int)(scan.next().charAt(0));
		int ch2 = (int)(scan.next().charAt(0));
		if(ch1 > ch2) {
			System.out.println((char)ch1);
		}else {
			System.out.println((char)ch2);			
		}
		
	}
}

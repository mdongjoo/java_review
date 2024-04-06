package home04;

import java.util.Scanner;

public class Ex03_1 {
	//사용자로부터 과목의 점수를 입력받아 해당 점수가 합격인지
//	불합격인지를 판별하여 출력하기(60점 이상이면 합격, 미만이면 불합격)
	public static void main(String[] args) {
		//로직
		//Scanner import close
		//과목 점수를 받을 정수형 변수선언
		//if
		//출력문
		Scanner scan = new Scanner(System.in);
		int score = 0 ;
		System.out.print("과목의 점수를 입력하세요(0~100) :");
		score = scan.nextInt();
		if(score >= 60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		scan.close();
	}
}

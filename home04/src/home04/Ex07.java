package home04;

import java.util.Scanner;

public class Ex07 {

//사용자로부터 1에서 7까지의 숫자를 입력받아 해당하는 요일을 출력하기 
//(1이면 "월요일", 2이면 "화요일", ..., 7이면 "일요일")
	public static void main(String[] args) {
		//로직
		//Scanner import close 
		//정수형 변수 1개
		//Switch case 
		Scanner scan = new Scanner(System.in);
		System.out.print("1-7사이 숫자를 입력하세요:");
		int score = scan.nextInt();
		switch(score){
			case 1 :
				System.out.println("월요일");
				break;
			case 2 :
				System.out.println("화요일");
				break;
			case 3 :
				System.out.println("수요일");
				break;
			case 4 :
				System.out.println("목요일");
				break;
			case 5 :
				System.out.println("금요일");
				break;
			case 6 :
				System.out.println("토요일");
				break;
			case 7 :
				System.out.println("일요일");
				break;
			default :
				System.out.println("값을 잘못 입력하셨습니다.");
				break;
		}
		scan.close();
	}
}

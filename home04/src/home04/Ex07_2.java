package home04;

import java.util.Scanner;

public class Ex07_2 {
	//사용자로부터 1에서 7까지의 숫자를 입력받아 해당하는 요일을 출력하기 
	//(1이면 "월요일", 2이면 "화요일", ..., 7이면 "일요일")
	//배열로 작성해보기
	public static void main(String[] args) {
		//로직
				//Scanner import close 
				//정수형 변수 1개
				//Switch case 
		Scanner scan = new Scanner(System.in);
		String[] days = {"월","화","수","목","금","토","일"};
		
		while(true) {
		System.out.print("1-7사이 숫자를 입력하세요:");
		int day = scan.nextInt();
		if(day >=1 && day <=7) {
			System.out.println((days[day-1])+"요일 입니다");
		}else if(day == 0){
			break;
		}else
			System.out.println("값이 잘못입력되었습니다. ");
		}
		scan.close();
		}
	}


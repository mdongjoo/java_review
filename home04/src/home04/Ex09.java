package home04;

import java.util.Scanner;

public class Ex09 {
//	사용자로부터 과일 이름을 입력받아 해당하는 과일의 가격을 출력하기
//	(사과: 1000원, 바나나: 1500원, 포도: 2000원, 기타: "가격 정보 없음")
	public static void main(String[] args) {
		//로직 
		//Scanner import close
		//String 과일 변수 1개 
		//Switch case 문
		Scanner scan = new Scanner(System.in);
		System.out.print("과일 이름을 입력하세요 :");
		String fruit = "";
		fruit = scan.nextLine();
		switch(fruit) {
			case "사과" : 
				System.out.println("사과 : 1000원");
				break ;
			case "바나나" : 
				System.out.println("바나나 : 1500원");
				break ;
			case "포도" : 
				System.out.println("포도 : 2000원");
				break ;
			default : 
				System.out.println("기타 : \"가격 정보 없음\"");
				break ;
		}
		scan.close();
	}
}

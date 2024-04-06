package input; //패키지

import java.util.Scanner; //입력 클래스 불러오기 

public class InputTest04 { //클래스 선언부
	public static void main(String[] args) { //메인메소드 선언부 
		//좋아하는 숫자 num => nextInt()
		//좋아하는 동물 animal => nextLine()
		int num = 0 ; //정수형 변수 선언 및 초기화
		String animal = ""; //문자열 변수 선언 및 초기값으로 초기화 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		System.out.println("좋아하는 숫자를 입력하세요 :"); //출력
		num = scan.nextInt(); //정수형 변수에 정수형 입력받아 대입 
		//버퍼 저장공간 엔터 소모
		scan.nextLine(); //엔터를 소모하는 띄어쓰기포함한 문자열을 입력받는다
		System.out.println("좋아하는 동물를 입력하세요 :"); //출력
		animal = scan.nextLine(); //문자열을 입력받아 문자열 변수에 대입한다 
		System.out.println("좋아하는 숫자는 " + num + ",좋아하는 동물은 " + animal + "입니다." ); //문자열로 출력
	} //메인 메소드 종료
} //클래스 종료 

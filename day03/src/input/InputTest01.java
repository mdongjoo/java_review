package input; //패키지명

import java.util.Scanner; //클래스 불러오기 

public class InputTest01 { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		//입력메소드를 사용하기 위해서는 
		//Scanner 입력 클래스를 불러와야한다
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		//Scanner 랑 똑같이 생긴 애를 sc라는 변수에 저장해서 쓴다
		System.out.print("숫자 입력 : "); //출력문 
		String data = scan.next(); //문자열을 입력받아 문자열 변수에 대입 
		System.out.println(data); //출력문 
		System.out.println("출력 끝"); //출력문 
		
		
		scan.close(); //입력 객체 삭제
	} //메인메소드 종료
} //클래스 종료 

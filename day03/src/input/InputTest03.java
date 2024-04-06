package input; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class InputTest03 { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		//입력클래스 , import 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		System.out.print("입력 :"); //출력
//		System.out.println(scan.next());
//		System.out.println(scan.next());
//		System.out.println(scan.next());
		System.out.println(scan.nextLine()); //입력 3번 nextLine 엔터를 소모한다 
		System.out.println(scan.nextLine()); //띄어쓰기를 포함해서 입력받는다 
		System.out.println(scan.nextLine()); //터를 임시저장공간에서 지워준다(소모한다)
		
	} //메인 메소드 종료
} //클래스 종료 

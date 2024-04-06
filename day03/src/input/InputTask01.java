package input; //패키지명 

import java.util.Scanner; //입력 스캐너 불러오기

public class InputTask01 { //클래스 선언부
	public static void main(String[] args) { //메인메소드 선언부
		//이름을 입력하세요 : 000
		//000님 안녕하세요 출력
		Scanner scan = new Scanner(System.in); //스캐너 객체를 Heap메모리에 생성 
		System.out.print("이름을 입력하세요 :"); //출력문 
		//String name = scan.next();
//		System.out.println(scan.next()+ "님 안녕하세요");
		System.out.println(scan.nextLine()); //출력문에 입력받기
		scan.close(); //객체 지우기
	} //메인메소드 종료
} //클래스 종료 

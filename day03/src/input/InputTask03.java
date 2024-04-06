package input; //패키지명 

import java.util.Scanner; //스캐너 클래스 불러오기 

public class InputTask03 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부
		//이름과 나이를 입력받아서 000님의 나이는 0살입니다 출력하기 
		//이름 : 000
		//나이 : - 
		//000님의 나이는 0살입니다
		
		//로직 
		//String 변수 1개 + int 변수 1개 
		//Scanner 불러오기 + import
		//출력
		Scanner scan = new Scanner(System.in); //스캐너 객체 생성 
		System.out.print("이름 :"); //출력문 
		String name = scan.nextLine(); //문자열을 입력받아 문자열 변수에 대입 
		System.out.print("나이 :"); //출력문 
		int age = Integer.parseInt(scan.nextLine()); //문자열로 입력받아 정수형으로 변경해준 값을 정수형 변수에 대입 
		System.out.println(name +"님의 내년 나이는 "+ (age+1) + "살입니다"); //출력문 문자열로 출력
		
		scan.close(); //객체 삭제 
	} //메인메소드 종료
} //클래스 종료 

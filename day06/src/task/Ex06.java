package task; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class Ex06 { //클래스 선언부 
//	6. 사용자로부터 입력받은 숫자가 1부터 5까지의 수인 경우에만 해당 숫자에 해당하는 영어 단어를 출력하기
//	[올바른 값 입력시 출력] 
//			1부터 5까지 숫자 입력 : 1
//			1은 영어로 one 입니다
//			[잘못된 값 입력시 출력] 
//			1부터 5까지 숫자 입력 : 100
//			잘못된 입력입니다
	//로직
	//Scanner import close
	//정수형 변수 1개 선언
	//switch-case문 사용
	//default 에 잘못된 입력시 나올 문구 출력
	public static void main(String[] args) { //메인 메소드 선언부 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		System.out.print("1부터 5까지 숫자 입력 :"); //출력 
		int num = scan.nextInt();// 정수형 변수에 정수값 입력받아 초기화 
		switch(num) { //switch case문 num의 값에 따라 case가 나뉨 
			case 1 : //1이 대입되었을때 
				System.out.println(num + "은 영어로 One입니다");//출력 
				break; //swhitch문 탈출 
			case 2 :
				System.out.println(num + "은 영어로 Two입니다");
				break;
			case 3 :
				System.out.println(num + "은 영어로 Three입니다");
				break;
			case 4 :
				System.out.println(num + "은 영어로 Four입니다");
				break;
			case 5 :
				System.out.println(num + "은 영어로 Five입니다");
				break;
			default : //case 값 이외 경우 
				System.out.println("잘못된 입력입니다.");
				break;
		}// switch case문 종료 
		scan.close(); //객체 삭제 
	}//메인 메소드 종료 
} //클래스 종료 

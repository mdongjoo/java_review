package variable; //패키지명 

public class Variable02 { //클래스 선언부
	public static void main(String[] args) { //메인메소드 선언부
		int number = 1;  //정수형 변수 선언 및 초기화 
		//정수형 number라는 변수를 선언하고 1이라는 정수값으로 초기화(대입)
		System.out.println(number); //변수 출력 
		System.out.println(number + 10); 
		System.out.println(number + 20);
		System.out.println(number + 40);
		
		int userAge = 25 ;  //정수형 변수 선언 및 초기화 
		String userName = "문동주"; //문자열 변수 선언 및 초기화 
		double date = 3.11; //실수형 변수 선언 및 초기화 
		boolean isTrue = true ; //논리형 변수 선언 및 초기화 
		char gender = 'W'; //문자형 변수 선언 및 초기화 
		
		System.out.println(userName); //변수들 출력하기 
		System.out.println(userAge);
		System.out.println(date);
		System.out.println(isTrue);
		System.out.println(gender);
	} //메인메소드 종료 }
} //클래스 종료}

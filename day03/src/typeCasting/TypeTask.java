package typeCasting; //패키지 

public class TypeTask { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		//1. 올해 년도, 월  일 을 정수형 타입의변수로 만들고
		// 올해는 0000년 , 0 월 0일 입니다. 형태로 출력하기
		int year = 2024 ; //정수형 변수에 값을 대입하여 선언 초기화 
		int month = 3 ; //정수형 변수에 값을 대입하여 선언 초기화 
		int day = 12 ; //정수형 변수에 값을 대입하여 선언 초기화 
		System.out.println("올해는 " + year + "년 , "+ month + "월 "+ day + "일 입니다."); //출력
		//2. 올해 년도를 문자열로 만든 변수 year2로 선언하고
		// 24라는 값만 출력하기 
		String year2 = year + ""; //"" + @ 문자열 값을 문자열 변수에 대입하며 선언 및 초기화 
		System.out.print(year2.charAt(2)); //인덱스 2번 값을 문자형으로 출력
		System.out.println(year2.charAt(3)); //인덱스 3번값을 문자형으로 출력 
		//3. 1번에서 만든 변수들중 월 일을 문자열로 바꿔서 
		// result 변수에 저장하고 실수(3.12)로 변환하여 출력하기
		String month2 = month + ""; //문자열 값을 문자열 변수에 대입하여 선언 및 초기화 
		String day2 = day + ""; //문자열 값을 문자열 변수에 대입하여 선언 및 초기화 
		String result = month + "."+ day2;  //문자열 값을 문자열 변수에 대입하여 선언 및 초기화 
		System.out.println(Double.parseDouble(result)); //문자열 값을 실수형으로 강제 형변환하여 출력 
	}//메인메소드 종료
} //클래스 종료 

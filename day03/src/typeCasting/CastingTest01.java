package typeCasting; //패키지

public class CastingTest01 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//int long double float boolean char -> 기본자료형
		//기본자료형 , 원시자료형 , primitive type
		
		//String , class , .. 
		//클래스 자료형, 참조자료형 , Reference Type
		
		//다른 자료형의 값을 문자열 자료형 만들기
		//+ ""
		//기본 자료형 : 10 , 10L, 5.3. 5.3f, true, 'c'
		String str1 = 10 + ""; //문자열 변수 선언 초기화  "" + @ 는 문자열로 인식 
		String str2 = 5.3 + ""; //문자열 변수 선언 초기화 
		String str3 = true + ""; //문자열 변수 선언 초기화 
 		String str4 = 'a' + "";//문자열 변수 선언 초기화 
		System.out.println(str1 + str2 + str3 + str4); //문자열 + 문자열 = 연결되어 출력 
		
		//문자열을 다른 자료형으로 변환
		int number1 = Integer.parseInt(str1) ;  //문자열을 강제로 정수값으로 변경하여 정수형 변수에 대입 
		System.out.println(number1); //출력
		double number2 = Double.parseDouble(str2); //문자열을 강제로 실수값으로 변경하여 실수형 변수에 대입 
		boolean number3 = Boolean.parseBoolean(str3); //문자열을 강제로 논리값으로 변경하여 논리형 변수에 대입 
		System.out.println(number1 + number2); //출력 
		char number4 = str4.charAt(0); //charAt을 이용해 문자열값에서 문자형값을 추출하여 문자형 변수에 대입 
		System.out.println(number4); //출력
		char ch2 = "hello".charAt(0); //0번 인덱스의 문자열 값을 문자형으로 추출하여 문자형 변수에 대입 
		//index : 문자열을 구성하는 모든 문자들에 부여된 고유번호
		//index의 시작번호는 0부터 시작한다
		System.out.println(ch2);//출력
		
		
		
	} //메인메소드 종료
} //클래스 종료 

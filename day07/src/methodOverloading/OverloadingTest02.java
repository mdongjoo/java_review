package methodOverloading; //패키지 

public class OverloadingTest02 { //클래스 선언부 
	//정수 1개 출력하는 메소드 (printNum()) //오버로딩 
	void printNum(int num) { //반환값 없는 메소드 매개변수 1개  //정수형 값 매개변수 
		System.out.println(num);
	}
	//실수 1개 출력하는 메소드 (printNum())
	void printNum(double num) { //반환값 없는 메소드 실수형 매개변수 1개 
		System.out.println(num);
	}
	//문자열 1개 출력하는 메소드 (printNum())
	void printNum(String num) { //반환값 없는 메소드 문자열 매개변수 1개 
		System.out.println(num);
	}
	//문자열배열 1개 출력하는 메소드 (printNum())
	void printNum(String[] num) { //반환값 없는 메소드 문자열 배열 매개변수 1개 
//		System.out.println(num);
		for(String text : num) {
			System.out.print(text);
		}
	}
	public static void main(String[] args) {//메인 메소드 선언부 
		OverloadingTest02 ot = new OverloadingTest02(); //객체 생성 
		ot.printNum(8); //객체 메소드 호출 정수
		ot.printNum(8.8);//객체 메소드 호출  실수 
		ot.printNum("안녕");//객체 메소드 호출  문자열 
		String[] str1 = {"java","dbms","jdbc"}; //문자열 배열 변수에 문자열 대입 
		ot.printNum(str1); //객체 메소드 호출 문자열 배열  
		
	}//메인 메소드 종료
} //클래스 종료 

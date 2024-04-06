package methodOverloading; //패키지 

public class OverloadingTest01 { //클래스 선언부 
	//overloading
	void printNum(int num1, int num2) { //반환값 없는 메소드 , 매개변수 2개 짜리 메소드 
		System.out.println(num1 + num2); //출력
	} //메소드 종료 
	void printNum(double num1, double num2) {//반환값 없는 메소드 , 매개변수 2개 짜리 메소드 
		System.out.println(num1 + num2); //출력
	}//메소드 종료 
	
	public static void main(String[] args) { //메인 메소드 선언부 
		//메소드 오버로딩 : 매개변수의 타입, 개수 , 순서가 다르면 같은 이름의 메소드로 선언할 수 있다
		//두개를 더해서 출력하는 메소드
		OverloadingTest01 ot = new OverloadingTest01(); //객체 생성 
		ot.printNum(10,20); //객체의 메소드 호출 
	} //메인 메소드 종료 
} //클래스 종료 

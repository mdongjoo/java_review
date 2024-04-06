package constructorTest; //패키지 

class A { //클래스 선언부 
	//메소드
	void method() { //A의 멤버메소드 
		System.out.println(this); //객체 주소값 출력 
	} //메소드 종료 
} //A클래스 종료 

public class ClassTest { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		A a = new A(); //A클래스 객체 생성
		a.method(); //객체 메소드 호출 
		A a1 = new A(); //A클래스 객체 생성 
		a1.method(); //객체 메소드 호출 
	} //메인 메소드 종료 
} //클래스 종료 

package constructorTest; //패키지 

class B{ //클래스 선언
	//필드
	int num;
	//메소드
	void printNum(int num) {//반환값 없고 매개변수 정수형 1개 
		System.out.println("매개변수num : " + num);
		System.out.println("필드num : " + this.num);
		System.out.println("참조값 : "+ this);
	} //메소드 종료 
	
	
	public B() { //기본 생성자 

	}
	//생성자 오버로딩
	public B(int num) { //매개변수 1개 정수형인 생성자 오버로딩 
		this.num = num ; //객체의 필드값에 대입  매개변수값으로  
	}//생성자 종료 
} //클래스 종료 

public class ClassTest2 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//인스턴스화
		B b1 = new B(); //객체 생성 
		System.out.println(b1); //객체 주소값 출력
		b1.printNum(10); //객체 메소드 호출 
		B b2 = new B(); //객체 생성 
		b2.num = 100; //객체 필드 에 값을 대입 
		b2.printNum(5); //객체 메소드 호출 
	} //메인 메소드 종료 
}//클래스 종료 

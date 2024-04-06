package inheritanceTest3; //패키지 

public class Child extends Parents{ //parents클래스를 상속받은 Child 클래스 선언부 
	//필드 정수형 변수 선언 
	int number;
	//메소드
	void printInt(int num) { //반환값없고 매개변수 정수형을 받는 메소드 
		System.out.println(num);//출력
	} //메소드 종료 
	//기본 생성자
	public Child() { 
		super();//부모 기본 생성자 호출 
		System.out.println("Child 생성자 호출 "); //출력 
	}//메소드 종료 
	public Child(int number) { //매개변수 정수형 1개인 생성자 
		super(); //부모 기본 생성자 호출 
		this.number = number; //객체의 멤버필드에 매개변수로 부터 받은 값 대입 
	}//메소드 종료 
	
}//클래스 종료 

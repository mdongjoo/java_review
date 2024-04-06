package interMethod;

public interface MyInterface {
	//상수 , 추상메소드 
	void abstractMethod();
	//default 메소드 키워드를 붙여야만 구현가능
	default void defaultMethod() {
		System.out.println("디폴트 메소드 호출");
	}
	//static 메소드
	static void staticMethod() {
		System.out.println("스태틱 메소드 호출");
	}
}

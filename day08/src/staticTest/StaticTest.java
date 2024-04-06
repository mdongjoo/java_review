package staticTest; //패키지 
public class StaticTest { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		StaticTest st = new StaticTest(); //객체 생성 
//		System.out.println(st);
		st.iMethod1(); //객체 메소드 호출 
		st.sMethod2();//객체 메소드 호출 
	}//메인 메소드 종료 
	void iMethod1() {//반환값없고 매개변수 없는 메소드 
		System.out.println("인스턴스 메소드1 실행했다 ");//출력
	}//메소드 종료 
	void iMethod2() {//반환값없고 매개변수 없는 메소드 
		System.out.println("인스턴스 메소드2 실행");//출력
	}//메소드 종료 
	static void sMethod1() { //static 메소드 정적 메소드로 method메모리에 미리 올려두어 실행과동시에 사용가능한 메소드 
//		iMethod2(); 인스턴스 메소드이기때문에 실행 불가 
		System.out.println("스태틱 메소드2 실행");//출력
	}//메소드 종료 
	static void sMethod2() { //static 메소드 정적 메소드로 method메모리에 미리 올려두어 실행과동시에 사용가능한 메소드 
		System.out.println("스태틱 메소드2 실행");//출력
	}//메소드 종료 
	
	
}//클래스 종료 

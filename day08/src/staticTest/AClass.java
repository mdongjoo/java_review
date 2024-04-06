package staticTest; //패키지 

public class AClass { //클래스 선언부 
	//필드 //Static 키워드로 MEthod메모리에 올려두어 실행과 동시에 사용 가능한 변수로 만들수있다 
	int iVar;
	static int sVar;
	//메소드
	void iMethod1() { //반환값없고 매개변수 없는 메소드 
		iVar = 10; //필드변수값을 대입해 초기화 
		sVar = 20; //필드변수값을 대입해 초기화 
		System.out.println(iVar);//출력
		System.out.println(sVar);//출력 
		iMethod2();//메소드 호출 
		sMethod1();//메소드 호출 
	}//메소드 종료 
	void iMethod2() {  //반환값없고 매개변수 없는 메소드 
		System.out.println("인스턴스 메소드2 실행");//출력
	}//메소드 종료 
	//클래스메소드(스테틱메소드)는 static이 붙은 멤버만 사용가능하다
	static void sMethod1() { //static 메소드 정적 메소드로 method메모리에 미리 올려두어 실행과동시에 사용가능한 메소드 
//		iVar = 100;
		sVar = 200;
		System.out.println(sVar);
//		iMethod1();
		sMethod2();
	}//메소드 종료 
	static void sMethod2() { //static 메소드 정적 메소드로 method메모리에 미리 올려두어 실행과동시에 사용가능한 메소드 
		System.out.println("스태틱 메소드2 실행");//출력
	} //메소드 종료 
} //클래스 종료 

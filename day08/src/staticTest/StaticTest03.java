package staticTest;//패키지

class B{ //클래스 선언부 
	//필드
	int iVar;	//인스턴스변수
	static int sVar; //스태틱변수 static정적 멤버를 호출할때에는 메소드명을 이용해 호출 
} //클래스 종료 


public class StaticTest03 {//클래스 선언부 
	public static void main(String[] args) {//메인 메소드 선언부 
		B b1 = new B(); //객체 생성
		B b2 = new B(); //객체 생성 
		
		b1.iVar = 10 ; //객체 필드에 값을 대입해 초기화 
		b2.iVar = 20;//객체 필드에 값을 대입해 초기화 
		System.out.println(b1.iVar);//출력
		System.out.println(b2.iVar); //출력 
		
		b1.sVar = 30;//스태틱변수 static정적 멤버를 호출할때에는 메소드명을 이용해 호출 
		b2.sVar = 40; //스태틱변수 static정적 멤버를 호출할때에는 메소드명을 이용해 호출 
		System.out.println(b1.sVar); //40
		System.out.println(b2.sVar); //40
		//클래스변수는 하나의 저장공간이다.
		//즉 하나의 클래스로 만든 모든 객체가 공유하는 저장공간이다 
		//그러므로, 클래스명으로 접근하는 것을 권장하고 있음 
		System.out.println(B.sVar); //스태틱변수 static정적 멤버를 호출할때에는 메소드명을 이용해 호출 
	}//메인 메소드 종료 
} //클래스 종료 

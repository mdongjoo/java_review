package staticTest; //패키지 

public class StaticTest02 {//클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//다른 클래스에서 istance멤버를 사용하는 경우
		AClass a = new AClass();//객체 생성 
//		System.out.println(a.iVar);
		a.iVar = 5; //객체 필드에 값을 대입해 초기화 
//		a.iMethod1();
		
		//다른 클래스에서 static멤버를 사용하는 경우 객체를 이용하는 것은 권장하지 않는다
		a.sVar = 15;//객체 필드에 값을 대입해 초기화 
		System.out.println(a.sVar);//출력
		a.sMethod1(); //객체 메소드 호출 
		
		//클래스 명을 이용하여 static 멤버에 접근하는 것을 권장한다.
		AClass.sMethod1(); //static정적 멤버를 호출할때에는 메소드명을 이용해 호출 
		AClass.sVar = 250 ;//static정적 멤버를 호출할때에는 메소드명을 이용해 호출 
		System.out.println(AClass.sVar);//static정적 멤버를 호출할때에는 메소드명을 이용해 호출 
	}//메인 메소드 종료 
} //클래스 종료 

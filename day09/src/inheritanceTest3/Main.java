package inheritanceTest3; //패키지

public class Main { //클래스 선언부 
	public static void main(String[] args) { //메인 메서드 선언부 
		Parents p = new Parents(); //객체 생성 
		System.out.println(p); //객체 주소값 출력 
		Child c = new Child();//객체 생성
		System.out.println(c);//객체 주소값 출력 
//		Parents c = new Child();
	}//메인 메서드 종료
} //클래스 종료 

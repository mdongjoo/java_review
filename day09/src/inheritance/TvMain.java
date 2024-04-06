package inheritance;//패키지 

public class TvMain { //클래스 선언부 
	public static void main(String[] args) { //메인메서드 선언부 
		//Tv객체
		Tv tv = new Tv();//객체 생성
		//Tv2객체
		Tv2 tv2 = new Tv2(); //객체 생성 
		//SmartTv객체
		SmartTv smartTv = new SmartTv(); //객체 생성 
		
		System.out.println(tv);//출력 
		System.out.println(tv2);//출력 
		System.out.println(smartTv);//출력 
		
		tv.ch = 10 ;//객체내 멤버필드에 값 대입 
		tv.chUp();//객체 내 멤버메서드호출 
//		System.out.println(tv.ch);
	}//메인 메서드 종료
} //클래스 종료 

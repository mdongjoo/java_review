package tvTest; //패키지 


public class TvMain { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//Tv객체
		Tv samsungTv = new Tv(); //객체 생성 
		samsungTv.ch = 20; //객체 필드 값에 값 대입 
		samsungTv.color = "검정색";//객체 필드 값에 값 대입 
		samsungTv.price = 2000;//객체 필드 값에 값 대입 
		samsungTv.chUp(); //객체 메소드 호출 
		samsungTv.chUp(); //객체 메소드 호출 
		samsungTv.powerOnOff(); //객체 메소드 호출 
		samsungTv.powerOnOff(); //객체 메소드 호출 
	}//메인 메소드 종료 
} //클래스 종료 

package tvTest; //패키지 

public class Tv { //클래스 선언부 
	// 클래스 변수 정수형 3개 논리형 1개 문자열 1개  
	int ch;
	int vol;
	boolean power=true;
	int price;
	String color;
	
	//메소드
	void powerOnOff() {//반환값 메소드 선언 
		if(power) { //if문 power값이 true 값이면 참 
			System.out.println("tv전원을 킵니다");
		}else {
			System.out.println("전원을 끕니다");
		}//if종료 
	}//메소드 종료 
	void chUp() {//반환값 메소드 선언 
		if(power) {//if문 power값이 true 값이면 참 
			System.out.println("현재 채널: "+ ch);//출력
			ch++; //증감 연산자 1씩 증가 
			System.out.println("채널을 1올립니다. 현재 채널:"+ch);//출력 
		}else { //참이 아니라면 
			System.out.println("tv전원을 먼저 켜야합니다."); //출력 
		} //if문 종료 
	} //메소드 종료 
} //클래스 종료 

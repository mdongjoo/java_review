package inheritance;//패키지 

public class SmartTv { //클래스 선언부
	//스마트 Tv SmartTv
	//필드 정수형 2개 논리형 1개 선언 
	int ch;
	int vol;
	boolean power;
//메소드
//채널Up,채널Down 
void chUp() { //반환값 없고 매개변수 없는 메소드 
	System.out.println("현재 채널: " + ch);//출력
	System.out.println("채널을 올립니다. : " + ++ch);//출력 전위증감자를 이용해 값을 더한후 ch값 출력
}//메소드 종료 
void chDown() {//반환값 없고 매개변수 없는 메소드 
	System.out.println("현재 채널: " + ch); //출력
	System.out.println("채널을 올립니다. : " + ++ch);//출력 전위증감자를 이용해 값을 더한후 ch값 출력
}//메소드 종료 
		
//볼륨Up ,볼륨 Down
void volUp() {//반환값 없고 매개변수 없는 메소드 
	System.out.println("현재 채널: " + vol);//출력
	System.out.println("채널을 올립니다. : " + ++vol);//출력 전위증감자를 이용해 값을 더한후 vol값 출력
}//메소드 종료 
void volDown() {//반환값 없고 매개변수 없는 메소드 
	System.out.println("현재 채널: " + vol);//출력
	System.out.println("채널을 올립니다. : " + ++vol);//출력 전위증감자를 이용해 값을 더한후 vol값 출력
}//메소드 종료 
//전원 OnOff
void powerOnOff() {//반환값 없고 매개변수 없는 메소드
	if(!power) {//if문 power논리형의 반대값이 true면 참 
		System.out.println("Tv를 켰습니다");//출력
	}else {//아닐시 else
		System.out.println("Tv를 껐습니다.");//출력
	}//if문 종료 
}//메소드 종료 
//netflix
void netflix() {//반환값 없고 매개변수 없는 메소드
	System.out.println("넷플릭스 모드를 켯습니다.");//출력
}//메소드 종료 
}//클래스 종료 

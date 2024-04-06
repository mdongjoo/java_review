package task;//패키지 

public class BasicTv { //클래스 선언부 
	//필드 문자열 필드 1개 정수형 필드 3개 논리형 필드 1개 선언 
	String color;
	int inch;
	int price;
	boolean power ; //true : on , false :off
	int channel = 1;
	//매개변수 3개 받는 생성자(색 , 인치  가격)
	public BasicTv(String color, int inch, int price) { //생성자 매개변수 3개 짜리 
//		super();
		this.color = color;//객체의 필드에 매개변수를 통한 초기화 
		this.inch = inch;//객체의 필드에 매개변수를 통한 초기화 
		this.price = price;//객체의 필드에 매개변수를 통한 초기화 
	}//생성자 종료 
	//매개변수 4개 받는 생성자 (색, 인치 , 가격, 채널)
	public BasicTv(String color, int inch, int price, int channel) {
//		super();
		this.color = color;//객체의 필드에 매개변수를 통한 초기화 
		this.inch = inch;//객체의 필드에 매개변수를 통한 초기화 
		this.price = price;//객체의 필드에 매개변수를 통한 초기화 
		this.channel = channel;//객체의 필드에 매개변수를 통한 초기화 
	}//생성자 종료 
	//메소드
	//전원 켜는 메소드 powerOnOff() 매개변수 x 리턴값x
	void powerOnOff() {
		if(!this.power) {//if문 객체의 논리값이 false일떄 참 
			this.power = true; 
			System.out.println("Tv전원을 켰습니다.");
		}else{
			this.power = false;
			System.out.println("Tv전원을 껐습니다.");
		}//if문 종료 
	}//메소드 종료 
	//채널 올리는 메소드 channelUp() 매개변수 x 리턴값o
	int channelUp() { 
		if(this.power) {//if문 객체의 논리값이 false일떄 참 
			System.out.println("현재 채널 출력 :"+ this.channel++);//출력 후 채널값 증감 연산자를 통해 1증가 
			System.out.println("올린 채널 출력: "+ this.channel);//출력 
			
		}else { //true일때 
			System.out.println("먼저 tv전원을 켜주세요");
		}//if문 종료 
		return this.channel;//반환값 정수형 객체의 channel값 
	}
	//채널 내리는 메소드 channelDown() 매개변수x 리턴값o
	int channelDown() { 
		if(this.power) {//if문 조건이 참일때 
			System.out.println("현재 채널 출력 :"+ this.channel--);//출력 후 채널값 증감 연산자를 통해 1감소  
			System.out.println("내린 채널 출력: "+ this.channel);//출력 
			
		}else {//else 조건이 거짓일때
			System.out.println("먼저 tv전원을 켜주세요");//출력 
		}
		return this.channel;//반환값 정수형 객체의 channel값 
	}//메소드 종료  
}//클래스 종료 

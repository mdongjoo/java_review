package task;//패키지 

import java.util.Scanner;//입력 클래스 불러오기 

public class TvTask { //클래스 선언부 
	public static void main(String[] args) {//메인 메소드 선언부 
		String msg = "1. 전원 버튼\n" //문자열 변수에 값을 대입 
		 + "2. 채널 올리기 \n" + "3.채널 내리기\n" +"0. 프로그램 종료\n"+ "번호 입력: ";
		 
		//while 문을 통해서 프로그램을 무한 반복한다
		//사용자에게 옵션메뉴를 출력하고 번호를 입력받는다
		//선택한 옵션에 따라 수행한다
		//1번선택시 : Tv전원을 on ,,off한다 => 켜졌을 경우 Tv전원이 켜졌습니다 출력
		//꺼져있을 경우 꺼졌읍니다 출력
		//2번선택시 : tv전ㅎ원이 켜져있는지 확인후 현재 체널을 출력하고 올린 채널 출력
		// 		꺼져있을경우 tv전원을 먼저 켜주세요 출력 
		//3번선택시 tv전원이 켜져있을 경우 현재 채널을 출력하고 내린 채널 출력
		// 	꺼져있ㅇ르 경우 ㄹtv전원을 먼저 켜주세요 출력
		// 그외 선택시 : 다시 번호를 입력하세요
		//0번선택시 : 프로그램 종료한다
		BasicTv tv = new BasicTv("white",5,500000); //매개변수 3개짜리 생성자를 통해 객체 생성 
		Scanner scan = new Scanner(System.in);//입력 객체 생성 
		
		
		while(true) { //while (true)무한 반복문 
			System.out.println(msg); //출력 
			int choice =scan.nextInt(); //정수형 변수에 정수값을 입력받아 대입 
			if(choice==0) { //if문 조건문 choice가 0일때 참 
				System.out.println("프로그램을 종료합니다."); //출력
				System.exit(0); //시스템 자체를 종료 
				//break;
			}//if문 종료 
			switch(choice){ //switch case문 choice값에 따른 값 변경 
			case 1 :// 변수값이 1이 입력되었을때 
				tv.powerOnOff(); //객체 메소드 호출 
				break; //switch case탈출 
			case 2 : //변수값이 2가 입력되었을 떄
				if(tv.power) { //if문 tv.power가 참일때
				System.out.println(tv.channel); //출력 
				System.out.println("채널 변경 :" + tv.channelUp());//출력 
				} //if문 종료 
				break; //switch case탈출 
			case 3 ://변수값이 3가 입력되었을 떄
				tv.channelDown();//객체 메소드 호출 
				break; //switch case탈출 
			default : //그외 경우 
				System.out.println("다시 번호를 입력하세요");//출력
				break;//switch case탈출 
			} //switch case종료 
			
			
		}//while문 종료 
		
	}//메인 메소드 종료 
}//클래스 종료 

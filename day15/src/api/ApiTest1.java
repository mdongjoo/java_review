package api;

import java.util.Random;

public class ApiTest1 {
	public static void main(String[] args) {
		
		//내부 API 
		//Random 클래스 
		Random random = new Random();
		
		//nextInt(n) : n미만의 랜덤 정수를 반환하는 메소드 
		int num = random.nextInt(10);
		System.out.println(num); //-1403446258
		
		//Math 클래스 
		//ceil() 올림
		System.out.println(Math.ceil(9.3));
		//floor() 내림
		System.out.println(Math.floor(19.3));
		//round() 소수점 첫째자리에서 반올림 해주는 메소드 
		System.out.println(Math.round(19.3));
	}
}

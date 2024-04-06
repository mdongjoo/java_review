package forTest; //패키지 

public class TwoForTest02 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//2단~9단까지 구구단 출력하기
		
		for(int dan = 2; dan < 10; dan++) { //2중 for문 
//			System.out.println(dan);
			for(int num = 1; num < 10; num++) { //안쪽 for문 
//				System.out.println("dan : " + dan + ", num : " + num);
				System.out.println(dan + "x" + num + "=" + dan*num); //출력 
			} //안쪽 for문 종료 
			System.out.println(); //줄바꿈 용도 출력문 
		} //바깥 for문 종료 
	} //메인 메소드 종료 
} //클래스 종료 

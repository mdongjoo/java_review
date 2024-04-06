package forTest; //패키지 

public class TwoForTest01 { // 클래스 선언
	public static void main(String[] args) { //메인 메소드 선언부 
		for(int i = 0; i < 3; i++) { //for문 반복문 
//			System.out.println(i);
			for(int j = 1; j < 3; j++) {  //이중for문 
				System.out.println("i = " + i + ", j = " + j); //출력 
			} //안쪽 for문 중괄호 종료 
		} // 바깥 for문 중괄호 종료 
	} //메인 메소드 종료 
} //클래스 종료 

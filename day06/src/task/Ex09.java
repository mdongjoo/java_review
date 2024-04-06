package task; //패키지 

import java.util.Scanner; // 입력 클래스 불러오기 

public class Ex09 { //클래스 선언부 
//	9. 아래 출력결과와 동일하게 만들기
//	1) 역 직각삼각형 별찍기
	//로직 
	//이중for문 이용
	public static void main(String[] args) { //메인 메소드 선언부 
		for(int i = 0 ; i < 5 ; i ++) { //2중 for문 
			for(int j = 0 ; j < 5-i ;j ++) { //안쪽for문 
				System.out.print("*"); //출력 
			} //안쪽for문 종료 
			System.out.println(); // 줄바꿈 
		} //for문 종료 
		
		
		
//		2)  마름모 모양으로 별찍기
		//로직
		//1 2로 나눈후 이중for문 생성
		// 1의 반대 형태로 2를 만들기
		
//	     *
//	    ***
//	   *****
//	  *******
//	 ********* -1만들고
		System.out.println("마름모 모양으로 별찍기"); //출력 
		//1만들기 
		for(int i = 0 ; i <5 ;i ++) { //2중for문 
			for(int j =4 ;j >i-1 ;j--) {//안쪽for문 
				System.out.print(" ");
			}
			for(int j = 1 ; j <= 2*i+1 ; j ++) {
				System.out.print("*");//출력 
			}
			System.out.println();//줄바꿈 용도 for문 
		} //for문 종료 
	//2만들기	
//	  *******
//	   *****
//	    ***
//	     * -2만들기 
		for(int i = 4 ; i >0 ;i --) { //2중 for문 
			for(int j =0 ;j <= 5-i ;j++) {//안쪽for문 중 1개 
				System.out.print(" ");
			}
			for(int j = 0 ; j < 2*i-1 ; j ++) {//안쪽 for문 중 1개 
				System.out.print("*");
			}
			System.out.println();
		}//for문 종료 
		

		
//		3) 사용자가 입력한 숫자만큼 행을 만들고 각 숫자가 증가하도록 모양 찍기
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		System.out.println("3번 문제");//출력 
		//로직
		//Scanner import close
		//이중 for문
		Scanner scan = new Scanner(System.in);//입력 객체 생성 
		System.out.print("숫자를 입력하세요 :");//출력
		int num = scan.nextInt(); //정수형 변수에 정수값입력받아 초기화
		int cnt = 1 ; //정수형 변수에 1을 대입해 선언및 초기화 
		for(int i = 0 ;i < num ;i ++) { //2중for문 
			for(int j =0 ;j < i+1 ;j ++) {
				System.out.print(cnt + " ");//출력
				cnt++ ; //증감연산자 1씩 증가 
			} //안쪽 for문 종료 
			System.out.println(); //줄바꿈 
		} //바깥 for문 종료 
		scan.close(); //객체 삭제 
	} //메인 메소드 종료 
}//클래스 종료 

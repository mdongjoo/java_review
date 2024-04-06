package forTest; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class ForTest04 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//3단 구구단 3x1 =3
		//...
		//3x9 =27
		int dan = 3, num = 1; //정수형 변수 값을 대입하여 선언및 초기화 
		System.out.println(dan + " x " + num + " = " + (dan * num)); //출력 
		System.out.println(dan + " x " + (num + 1) + " = " + (dan * (num + 1))); //출력
		System.out.println(dan + " x " + (num + 2) + " = " + (dan * (num + 2))); //출력
		System.out.println(dan + " x " + (num + 3) + " = " + (dan * (num + 3))); //출력
		System.out.println(dan + " x " + (num + 4) + " = " + (dan * (num + 4))); //출력
		
		//사용자가 입력한 숫자의 단이 출력되도록 하기
		//입력클래스 import
		//dan 변수 nextInt()
		Scanner sc = new Scanner(System.in); //입력 객체 생성 
		System.out.println("출력하고 싶은 단을 입력하세요:"); //출력
		dan = sc.nextInt(); //정수형 변수에 정수형 값 입력받아 대입 
		for(int i = 1; i < 10; i++) { //for문 반복문 
			System.out.printf("%d x %d = %d", dan, i, dan*i); //출력
			System.out.println(); //출력
		} //for문 반복 종료 중괄호 
		
	} //메인 메소드 종료 
} //클래스 종료 










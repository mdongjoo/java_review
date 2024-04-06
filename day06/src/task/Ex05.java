package task; //패키지 

import java.util.Scanner; //입력 클래스 불러오기 

public class Ex05 { //클래스 선언부 
//	5. 사용자로부터 정수(5자리)를 입력받아 역순으로 출력하는 프로그램
	//로직 
	//Scanner import close
	//5자리 정수를 입력받을 정수형 배열 선언
	//for문
	public static void main(String[] args) { //메인 메소드 선언부 
		Scanner scan = new Scanner(System.in); //입력 객체 생성 
		int[] intAry = new int[5]; //정수형 배열에 5칸 짜리 저장공간의 참조값을 대입 
		System.out.print("5자리 정수를 입력하세요: "); //출력 
		for(int i = 0 ; i <intAry.length ;i++) { //for문 정수형 배열의 길이만큼 반복 
		intAry[i] = scan.nextInt(); //i번째 인덱스에 배열에 정수값 대입 
		} //for문 종료 
		for(int i = intAry.length ;i >0 ; i--) { //for문 배열의 길이만큼 반복 
			System.out.print(intAry[i-1]); //출력 
		}//for 문 종료 
		scan.close(); //객체 삭제 
	} //메인 메소드 종료 
} //클래스 종료 

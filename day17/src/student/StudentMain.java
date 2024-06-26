package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {
	//컬렉션 프레임워크 이용(점수 저장)
	//학생 점수는 중복이 허용되어야하므로 set x 학생의 이름을 따로 받지않을 것이기에 map x
	//ArrayList를 이용
	//1. 사용자로부터 학생 수와 학생 점수 입력받기
		//학생수, 학생 점수의 총합을 저장할 정수형 변수 2개를 선언 
		//Scanner import close
	//2. 입력받은 점수를 이용해서 평균점수 계산하기
	//3. 입력받은 점수 중 최고점수 계산하기
		//Collections.sort 오름차순 시킨 메소드의 끝 요소를 가지고오기 
	//4. 계산된 평균점수와 최고점수 출력하기
	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList<Integer> list = new ArrayList<>();
		//입력 메소드 추가
		Scanner scan = new Scanner(System.in);
		int studentNumber=0;
		int sum=0;
		System.out.println("학생수를 입력하세요:");
		studentNumber = scan.nextInt();
		for(int i =0 ; i < studentNumber ; i++) {
			System.out.println("학생 점수를 입력하세요:");
			list.add(scan.nextInt());
			sum += list.get(i);
		}
//		입력받은 점수를 이용해서 평균점수 계산하기
		System.out.println("평균 점수는 : "+sum/studentNumber );
		//3. 입력받은 점수 중 최고점수 계산하기
		Collections.sort(list);
		System.out.println("최고 점수는 : "+list.get(studentNumber-1));
		//4. 계산된 평균점수와 최고점수 출력하기
		System.out.println("평균 점수는 : "+sum/studentNumber + "  최고 점수는 : "+list.get(studentNumber-1));
		scan.close();
		
	}
	
	
}

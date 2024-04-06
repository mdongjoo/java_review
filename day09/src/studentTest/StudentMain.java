package studentTest; //패키지 

public class StudentMain { //클래스 선언부 
	public static void main(String[] args) { //메인 메서드 선언부 
		Student s = new Student("문동주", "전자공학", 20, 4); //매개변수 4개받는 생성자를 통해 객체 생성 
		s.printStudent(); //객체 메서드 호출 
//		System.out.println(s.avgScore(78, 95));
		System.out.println(s.gradeScore(s.avgScore(78, 95))); //출력
		System.out.println(s.score); //출력 
		
		//학생 3명의 점수를 각각 평균 계산해서 학점으로 배열로 넣을 것
		Student s1 = new Student("문", "전자공학", 20, 4);//매개변수 4개받는 생성자를 통해 객체 생성 
		Student s2= new Student("동", "컴퓨터공학", 21, 3);//매개변수 4개받는 생성자를 통해 객체 생성 
		Student s3 = new Student("주", "디자인공학", 22, 2);//매개변수 4개받는 생성자를 통해 객체 생성 
		char[] scoreChar = {s1.gradeScore(s1.avgScore(80, 40)), //문자형 배열에 값을 대입하면서 선언 및 초기화 
				s2.gradeScore(s2.avgScore(90, 60)),s3.gradeScore(s3.avgScore(30, 70))};
//		System.out.println(s1.gradeScore(s1.avgScore(80, 40)));
//		System.out.println(s2.gradeScore(s2.avgScore(90, 60)));
//		System.out.println(s3.gradeScore(s3.avgScore(30, 70)));
		//단순 출력은 for-each 문 
//		for(int i = 0 ; i< 3 ;i++) {
//		System.out.println(scoreChar[i]);
//		}
		//for each문 빠른 for문 
		for(char ch : scoreChar) { //단순 배열 반복은 for-each문 
			System.out.println(ch);
		}//for문 종료 
		
	} //메인 메서드 종료 
}//클래스 종료 

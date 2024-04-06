package task05;

public class Ex05 {
//	5. 학생 점수 관리 프로그램
//	사용자로부터 5명의 학생이름과 점수를 입력받고, 학생의 점수를 wrapper 클래스의 객체로 저장한다
//	최고 점수를 가진 학생의 이름과 점수를 출력한다. -> static 메서드로 만들기 Main에서 
//	평균점수를 계산하여 출력한다.
	//로직 
	public static void main(String[] args) {
		Student s1 = new Student("학생1", 80.8);
		Student s2 = new Student("학생2", 39.8);
		Student s3 = new Student("학생3", 42.8);
		Student s4 = new Student("학생4", 19.8);
		Student s5 = new Student("학생5", 100.0);
		Student[] student = {s1,s2,s3,s4,s5};
		
		maxScore(student);
		calculaterAvgScore(student);
		
	}
//	최고 점수를 가진 학생의 이름과 점수를 출력하는 메소드 .
	//로직 입력받은 객체 5개의 student타입의 배열을 매개변수로 받기 
	public static void maxScore(Student[] students) {
		Student student = students[0] ; //최고 점수를 가지는 학생을 저장할 객체 
		for(int i =0 ; i< students.length ; i ++) {
			if(student.score < students[i].score) {
				student = students[i];
			}
		}
		System.out.println("최고 점수를 가진 학생의 이름은 "+ student.name+ "이고, 점수는 "+ student.score+"점 입니다.");
	}
//	평균점수를 계산하여 출력한다.
	//전체 도합점수를 저장할 변수에 for문을 이용해 더해주고 students의 길이만큼 나누어준다. 
	public static void calculaterAvgScore(Student[] students) {
			Double score = 0.0;
		for(int i =0 ; i< students.length ; i ++) {
			score += students[i].score;
		}
		System.out.println("평균점수는 :"+score/students.length);
	}
}

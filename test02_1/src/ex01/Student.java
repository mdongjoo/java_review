package ex01;
//문동주
public class Student {
	//필드
	int studentNumber; //학생번호
	String studentName; //학생이름
	int[] grades; //성적 배열
	
	//생성자
	//매개변수 2개 있는 생성자 studentName , grades 초기화  
	public Student(String studentName, int[] grades) {
		super();
		this.studentName = studentName;
		this.grades = grades;
		this.studentNumber =0;//초기화 
	}
	//메소드 
	//성적 정보 보기 메소드 리턴타입 x 매개변수 x showGradeInfo()
	//for문 이용해 출력문 사용 
	void showGradeInfo() {
		System.out.println("=== 성적 정보 ===");
		System.out.println("Student{studentName='"+this.studentName + "', studentNumber="+this.studentNumber + ", grades=["+this.grades[0]+", "+this.grades[1]+", "+this.grades[2]+"] }");
		
		System.out.println("===============");
	}
	//평균 성적 계상 메소드 리턴타입 double 매개변수 x 
	double scoreAvg() {
		//성적을 합할 변수 정수형으로 선언하고 for문 이용해 sum에 저장하고 
		//국어 성적 영어성적 수학성적 3과목으로 나누어준다 
		//for each문 사용 
		int sum =0 ;
		for(int score : grades) {
			sum += score;
		}
		return sum/3;
		
	}
	//toString 오버라이딩 학생이름 학생 점수를 반환하는 메소드 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.studentName + this.grades;
	}
	
	
	
}

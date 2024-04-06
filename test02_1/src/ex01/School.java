package ex01;
//문동주
public class School {
//필드
	Student[] students ;//학생 배열
	int studentCount; //학생수 
//생성자 
	//기본 생성자 (매개변수 없는 생성자 , 단 초기값은 반드시 지정한다)
	public School() {
		super();
		this.students = new Student[30]; //최대 30명까지
		this.studentCount =0;
	}
//메소드 
	//학생 등록 메소드 registerStudent 
	//매개변수 Student 타입 student , 리턴값 boolean 타입 
	//최대 30명까지 학생을 받을 수 있다 new 연산자 
	//학생 번호 부여하고 배열에 객체를 넣고 cnt값을 ++해준다 
	boolean registerStudent(Student student) {
		Student s1 = student ; // 매개로 들어온 객체를 넣어주기 
		if(studentCount > 29) {//최대 30명까지 학생을 받을 수 있다 
			return false;
		}
		//학생 번호 부여하고 배열에 객체를 넣고 cnt값을 ++해준다 
		s1.studentNumber = studentCount ;
		students[studentCount] = s1;
		this.studentCount ++;
		System.out.println("학생을 등록했습니다 .");
		return true;
	}
	//학생 목록 보기 메소드 showStudentList
	//매개변수 x 리턴값 x 
	//for문이용해 출력
	void showStudentList() {
		System.out.println("=== 학생 목록 ===");
		for(int i = 0 ;i <studentCount ; i++) {
		System.out.println("Student{studentName='"+this.students[i].studentName + "', studentNumber="+this.students[i].studentNumber + ", grades=["+this.students[i].grades[0]+", "+this.students[i].grades[1]+", "+this.students[i].grades[2]+"] }");
		}
		System.out.println("=================");
	}
	//성적 평균 보기 메소드 showScoreAvg
	//매개변수 x 리턴값 x
	//for문 이용해 출력 
	void showScoreAvg() {
		System.out.println("=== 성적 평균 ===");
		for(int i = 0 ;i <studentCount ; i++) {
		System.out.println("학생이름 :"+this.students[i].studentName+", 평균 성적 :"+this.students[i].scoreAvg() );
		}
		System.out.println("=================");
	}
}

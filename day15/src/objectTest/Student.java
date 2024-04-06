package objectTest;

public class Student {
	//필드 
	int math;
	int kor;
	int eng;
	String grade;
	String name;
	
	//생성자
	public Student(int math, int kor, int eng, String grade, String name) {
		super();
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		this.grade = grade;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: " +this.name +" 수학 : " +this.math +" 국어 : " + this.kor +" 영어 : " + this.eng +" 학점 : " + this.grade;
	}
	
	
	
	
}

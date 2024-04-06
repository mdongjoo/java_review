package ex01;
//문동주
public class Main {
	public static void main(String[] args) {
		//필드 
//학급 생성 
		//School 클래스의 객체 생성
		School school = new School();
		System.out.println(school);
//점수 배열 생성
		int[] arr1 = {70,80,90};
		int[] arr2 = {40,40,30};
		int[] arr3 = {90,10,90};
//학생 생성
		//Student 클래스의 객체 3개 생성
		Student s1 = new Student("뽀로로", arr1);
		System.out.println("Student{studentName='"+s1.studentName + "', studentNumber="+s1.studentNumber + ", grades=["+s1.grades[0]+", "+s1.grades[1]+", "+s1.grades[2]+"] }");
		Student s2 = new Student("루피", arr2);
		Student s3 = new Student("짱구", arr3);
//학생 등록
		school.registerStudent(s1);
		school.registerStudent(s2);
		school.registerStudent(s3);
//학생 목록
		school.showStudentList();
//학생 성적 평귝보기 메소드 호출
		school.showScoreAvg();
		
	}
		
	}

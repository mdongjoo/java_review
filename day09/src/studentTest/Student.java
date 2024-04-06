package studentTest;//패키지

public class Student { //클래스 선언부 
	//학생 클래스 
	//필드 : 이름 전공 나이 학년 학점 => 힙 메모리에 생성(객체 생성)
	String name; //문자열 이름
	String major; //문자열 전공 
	int age;	//정수형 나이
	int grade;  //정수형 학년
	char score; //학점 
	
	//생성자 
	//기본생성자
	public Student() { //객체 생성시 인수를 넣지 않을 때 호출 
		
	}//생성자 종료 
	
	//이름 전공 나이 입력받는 생성자
	//생성자 오버로딩
	public Student(String name, String major, int age) { //문자열 문자열 정수형의 인수가 전달될때 호출 
//		this();   // 자기자신의 생성자 , 생성자 내에서만 호출가능 , 맨위에 작성해야한다. 
		//this : 객체 자기자신
		this.name = name; //해당 객체의 name 이라는 필드에 매개변수로 전달된 값을 대입
		this.major = major;//해당 객체의 major이라는 필드에 매개변수로 전달된 값을 대입
		this.age = age;//해당 객체의 major 이라는 필드에 매개변수로 전달된 값을 대입
	}//생성자 종료 
	//이름 전공 나이 학년을 입력받는 생성자
	//생성자 오버로딩 
	public Student(String name, String major, int age, int grade) { //문자열 ,문자열, 정수형, 정수형 인수가 전달될 때 호출 
		this(name,major,age); //name , major , age 매개변수를 가진 자기자신의 생성자를 호출 
		this.grade = grade;	//해당 객체의 grade 필드에 매개변수로 전달된 값을 대입 
	}//생성자 종료 
	
	
	
	//메소드 
	//학생의 이름과 학년, 전공을 출력하는 메소드 printStudent
	void printStudent() {//매개변수없고 반환값 없는 메소드 
		System.out.println(this.name +"의 학년은 "+ this.grade +"이고 , 전공은 "+ this.major + "이다.");
	}//메소드 종료 
	//학생의 전공 과목의 성적 2개를 입력받아 전공과목의 평균을 구하는 메소드 
	//avgScore
	double avgScore(int num1 , int num2) {//매개변수 정수형 변수 2개받는 반환값 실수형인 메소드 
		double avg = (num1 + num2)/2.0 ; //실수형 변수 선언 및 값 대입 
		System.out.println("학생의 전공 과목 평균은 :" + avg + "입니다."); //문자열로 출력 
		return avg;//avg값 실수형으로 반환 
	} //메소드 종료 
	//학생의 평균이 90점 이상이면 A , 70점 이상이면 B , 60점 이상이면 C 그외는 F 학점으로 반환하는 메소드
	//gradeScore
	//학점은 여기서 구해져야만 값을 넣어둘수 있다 
	char gradeScore(double avg) { //반환값 문자  , 매개변수 실수형 변수 받는 메소드 
		char grade = ' '; //문자형 변수에 초기값으로 선언 및 초기화 
		if(avg >= 90) { //if문 avg가 90보다 클때 참 
			grade = 'A'; // 변수에 값 대입 
		}else if(avg >=70) { //70보다 클때 참
			grade = 'B';// 변수에 값 대입 
		}else if(avg >=60) {//60보다 클때 참 
			grade = 'C';// 변수에 값 대입 
		}else { //그외에 
			grade = 'F';// 변수에 값 대입 
		}//if문 종료 
		this.score = grade; //grade값을 객체 멤버변수 score에 대입 
		
		return grade; //grade값 리턴
	}//메소드 종료 
	
	
}//클래스 종료 

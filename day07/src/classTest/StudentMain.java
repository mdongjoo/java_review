package classTest; //패키지 

public class StudentMain { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		Student s1 = new Student(); //클래스 객체 생성 
		Student s2 = new Student();  //클래스 객체 생성 
		System.out.println(s1); //출력 
		
		s1.name = "문동주"; //객체의 필드에 문자열을 대입하여 초기화 
		s1.math = 90; //객체의 필드에 정수값을 대입하여 초기화 
		s1.eng = 0; //객체의 필드에 정수값을 대입하여 초기화 
		s1.kor = 100;//객체의 필드에 정수값을 대입하여 초기화 
		
		System.out.println(s1.name);//출력 
		System.out.println(s1.math);		
		System.out.println(s1.getTotal());		
		System.out.println(s1.getAvg());		
		System.out.println(s2.name);
		System.out.println(s2.math);		
	}//메인 메소드 종료 
} //클래스 종료 

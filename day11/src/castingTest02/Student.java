package castingTest02;

public class Student extends Person{
	//필드
	String schoolName;
	//생성자 
	public Student(String name, int age, String job, String schoolName) {
		super(name, age, job);
		this.schoolName = schoolName;
	}
	//메소드
	//메소드 오버라이딩 
	@Override
	void eat() {
		System.out.println(this.name + "은 /는 " + this.schoolName + "에서 밥을 먹는다. ");
	}
	
	void walk() {
		System.out.println(this.name + "은/는 " + this.schoolName + "으로 등교한다. ");
	}
	
}

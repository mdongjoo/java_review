package castingTest02;

public class CastingTest {
	public static void main(String[] args) {
		//객체화 작업(인스턴스화) 
		Person p1 = new Person("짱구", 5, "유치원생");
		Person p2 = new Student("철수", 20, "대학생", "서울대학교");
		Person p3 = new Employee("유리", 40, "개발자", "코리아 회사 ");
		
		//오버라이딩 된 메소드로 호출됨을 확인 
		
		printWalk(p1);
		printWalk(p2);
		printWalk(p3);
		
		
	}
	//매개변수 부모클래스 타입의 매개변수 (들어오면서 자동 업캐스팅 )
	static void printWalk(Person person) {
		person.eat();
		if(person instanceof Student) {
			 ((Student)person).walk(); 
		}else if(person instanceof Employee) {
			((Employee)person).walk();
		}else {
			System.out.println("걷기 싫어 ");
		}
	}
}

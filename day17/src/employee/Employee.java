package employee;

//HashMap의 Key는 사원의 ID(String)
//Value는 이름, 나이, 부서로 설정
//조건1. 새로운 사원정보를 추가
//001, 짱구, 5, "영업부"
//002, 철수, 5, "개발부"
//003, 유리, 5, "사업부"
//조건2. 특정 ID의 사원 정보를 조회
//조건3. 모든 사원의 정보를 출력
//entrySet 메소드사용
//조건4. 특정 ID의 사원 정보를 삭제
//조건5. 모든 사원 정보를 삭제
//clear 메소드 사용
public class Employee {
//Value는 이름, 나이, 부서로 설정
	//필드 
	private String name; 	//이름 
	private int age;		//나이 
	private String part; 	//부서 
	//생성자 
	public Employee(String name, int age, String part) {
		super();
		this.name = name;
		this.age = age;
		this.part = part;
	}
	
	//toString 재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+ this.name +","+ this.age +","+ this.part+"]";
	}

	//getter setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	
}

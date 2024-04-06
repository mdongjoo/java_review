package thingTask;

public class Things {
	//필드
	private String name;
	//생성자 기본 생성자 
	public Things() {
		super();
	}
	
	//메소드 printInfo() : 이름을 출력
	void printInfo() {
		System.out.println("이름 : " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

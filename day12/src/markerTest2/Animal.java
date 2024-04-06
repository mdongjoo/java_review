package markerTest2;

public class Animal {
	//필드 
	private String name;
	//생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	//메서드
	public String getName() {
		return name;
	}
	
	public void eat() {
		System.out.println(this.name + "이(가) 먹는중입니다. ");
	}	
}

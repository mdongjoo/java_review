package castingTest03;

public class Cat extends Animal{


	//메소드 오버라이딩 
	@Override
	void crying() {
		System.out.println("냐옹");
	}
	//생성자 
	public Cat(String name) {
		super(name);
	}
	
}

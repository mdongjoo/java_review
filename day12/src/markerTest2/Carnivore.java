package markerTest2;

//육식동물
public class Carnivore extends Animal{
	//생성자
	public Carnivore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//메소드
	public void hunt() {
		System.out.println(getName() + "이(가) 사냥중입니다."); 
		
	}

}

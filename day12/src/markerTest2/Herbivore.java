package markerTest2;

public class Herbivore extends Animal {
	//생성자
	public Herbivore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void graze() {
		System.out.println(getName() +  "이(가) 초원에서 풀을 뜯습니다. ");
	}

}

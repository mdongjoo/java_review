package accessTask;
//Cat클래스
		//Animal 클래스를 상속받는 클래스
		//필드 : private 색상(color)
		//생성자 : 매개변수 없는 기본 생성자 
		//메소드 : play(매개변수 x, 리턴값x) => 00색 고양이 00가 놀고있습니다 출력 
		//scratch (매개변수x, 리턴값x) => 00이가 스크래치를 긁습니다 출력 
public class Cat extends Animal{
	//필드
	private String color;
	//생성자 : 매개변수 없는 기본 생성자 
	public Cat() {
		
	}
	//getter /setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//메소드
	void play() {
		System.out.println(this.color + "색 고양이 "+ this.name +"이/가 놀고있습니다.");
	}
	void scratch() {
		System.out.println(this.name + " 이/가 스크래치를 긁습니다.");
	}
}

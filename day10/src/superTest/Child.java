package superTest;

public class Child extends Parents{
	//필드
	int chVal;
	//메소드
	void chMethod1() {
		super.pMethod1();
		System.out.println("자식 클래스 메소드 호출");
	}
	
	//생성자
	//매개변수 1개 있는 생성자 => 상속관계에서 부모클래스에 기본생성자가 없는 경우 오류가 발생한다
	public Child(int val, int chVal) {
		super(val);
		this.chVal = chVal;
		System.out.println("자식 생성자 호출");
	}
	
	
	

}

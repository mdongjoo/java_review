package accessTask;
//Animal 클래스
		//필드 : protected name
		//생성자 : 매개변수 1개
		//메소드 ; eat() => 00이가 먹이를 먹습니다 출력
public class Animal {
	//필드
	protected String name ;
	//생성자
	public Animal() {
		
	}
	//메소드 
	void eat() {
		System.out.println( this.name + " 이/가 먹이를 먹습니다. ");
	}
	

}

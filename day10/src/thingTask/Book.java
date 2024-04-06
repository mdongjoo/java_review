package thingTask;
//Things 클래스를 상속받는 Book클래스
	//필드  저자(String author)
	//생성자 매개변수 2개 
	//메소드 오버라이딩 
	//이름 : 
	//저자 : 출력 
public class Book extends Things{
	//필드
	private String author;
	//생성자
	public Book() {
		super(); 
	}
	//메소드
	@Override
	void printInfo() {
		System.out.println("책 이름 : " + this.getName());
		System.out.println("저자 : "+ this.author);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

}

package thingTask;

//main 메소드
//부모클래스 객체thing 
//자식 클래스 객체 book 
//각 객체마다 메소드 호출 
public class Main {
	public static void main(String[] args) {
		Things thing = new Things();
		thing.setName("물건");

		Book book  = new Book();
		book.setName("이기적 유전자");
		book.setAuthor("리처드 도킨스");
		
		thing.printInfo();
		book.printInfo();
		
	}
}

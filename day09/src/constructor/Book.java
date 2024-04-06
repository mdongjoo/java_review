package constructor; //패키지 

public class Book { //클래스 선언부 
	//필드 : 책제목 , 책저자 , 가격, 출판년도 
	String title;//문자열 필드 2개 선언 
	String author;
	int price;//정수형 필드 2개 선언 
	int year;
	
	//생성자 alt shift s + o
	public Book() { //기본 생성자 
		
	}//생성자 종료 

	public Book(String title, String author, int price, int year) {//매개변수 4개 받는 생성자 
		super(); //부모 생성자 호출 이나 지금 굳이 필요로 하지않음 
		this.title = title; //객체의 필드에 매개변수에서 받은 값을 대입
		this.author = author;//객체의 필드에 매개변수에서 받은 값을 대입
		this.price = price;//객체의 필드에 매개변수에서 받은 값을 대입
		this.year = year;//객체의 필드에 매개변수에서 받은 값을 대입
	}//생성자 종료 
	//메소드
	void printBook() { //반환값 없고 매개변수 없는 메서드 
		System.out.println("책 이름 :"+ this.title + ", 책 저자 : "+ this.author);//출력 
	}//메서드 종료 
	
} //클래스 종료 

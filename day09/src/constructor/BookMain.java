package constructor; //패키지 

public class BookMain { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//Book 클래스의 객체 
		Book book1 = new Book(); //객체 선언 
		book1.title = "자바의 신 ";//객체의 필드에 문자열 대입 
		book1.author = "자바";//객체의 필드에 문자열 대입 
		book1.price = 20000; //객체의 필드에 정수값 대입
		book1.printBook(); //객체 메소드 호출 
		
		Book book2 = new Book("자바 프로그래밍", "개발자", 30000, 2024); //매개변수 4개짜리 생성자로 멤버필드 초기화하며 객체 생성 
		book2.printBook(); //객체 메소드 호출 
		
//		//객체 마다의 가격 배열
//		int[] prices = {book1.price, book2.price};
		BookMain bm = new BookMain(); //객체 선언 
//		System.out.println(bm.totalPrice(prices) + "원");
		System.out.println(bm.totalPrice2(book1, book2)); //출력
	}//메인 메소드 종료 
	//객체마다의 가격의 총합을 구하는 메소드 
//	int totalPrice(int[] prices) {
//		//매개변수o 리턴값o 
//		//총합 저장할 변수
//		int total = 0;
//		//반복문(for~each) 
//		for(int price : prices ) {
//			total += price;
//		}
//		//총합 변수 += for~each 문 변수
//		//return 총합변수
//		
//		return total;
//	}
	//객체 마다의 가격의 총합을 구하는 메소드
	int totalPrice2(Book... books) { // 정수형 반환값 매개변수 클래스를 받는 메소드 ... : 정해지지않은 갯수의 여러 클래스 객체를 대입받겠다는 뜻
		//총 가격을 구할 변수 선언
		int total = 0 ; //정수형 변수 초기값으로 선언 및 초기화 
		//반복문(for -each)
		for(Book book : books) { //for -each문 단순 반복문
			total += book.price; //total에 객체의price값을 더해 대입받는다.
		} //for문 종료 
		return total; //리턴값 정수형 
	}//메소드 종료
}//클래스 종료 

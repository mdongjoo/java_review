package markerTest;

public class MarkerInterMain {
	public static void main(String[] args) {
		SomeClass sc1 = new SomeClass("데이터");
		
		if(sc1 instanceof MarkerInterface) {
			System.out.println("sc1 은 MakerInterface를 구현한 클래스입니다 .");
		}else {
			System.out.println("sc1 은 MakerInterface를 구현하지 않은 클래스입니다 .");
		}
	}
}

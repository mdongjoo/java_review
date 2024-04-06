package ambiguity;

public interface Inter1 {
	default void printText() {
		System.out.println("Inter1 interface printText 호출");
	}
	
}

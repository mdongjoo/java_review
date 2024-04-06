package ambiguity;

public interface Inter3 {
	default void printText() {
		System.out.println("\"Inter3 interface printText 호출\"");
	}
}

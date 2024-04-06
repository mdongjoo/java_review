package ambiguity;

public interface Inter2 {
	default void printText() {
		System.out.println("\"Inter2 interface printText 호출\"");
	}
}

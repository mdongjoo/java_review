package objectTest;

public class ToStringTest {
	public static void main(String[] args) {
		Student st1 = new Student(70, 100, 35, "B", "문동주");
		System.out.println(st1);
		System.out.println(st1.toString());
		
		Student st2 = new Student(100, 100, 100, "A", "짱구");
		System.out.println(st2);
	}
}

package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		User user1 = new User(1, "짱구");
		User user2 = new User(1, "짱구");
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
		
		//유저 번호가 같다면 같은 유저로 판단한다 
		NewUser nu1 = new NewUser(1,"짱구");
		NewUser nu2 = new NewUser(1,"철수");
		System.out.println(nu1);
		System.out.println(nu2);
		System.out.println(nu1 == nu2);
		System.out.println(nu1.equals(nu2)); //equals 오버라이딩 
		
	}
}

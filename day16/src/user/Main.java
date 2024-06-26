package user;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList<UserVO> list = new ArrayList<>();
		System.out.println(list);
		//User 객체 3개 생성
		UserVO user1 = new UserVO("aaa", "111", "뽀로로", 20);
		UserVO user2 = new UserVO("sss", "222", "짱구", 20);
		UserVO user3 = new UserVO("ddd", "333", "유리", 20);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		//UserService 생성
		UserService us = new UserService(list);
		System.out.println("=========================");

		System.out.println(us.duplicateId(user1));
		System.out.println(us.duplicateId(user2));
		System.out.println(us.duplicateId(user3));
		System.out.println("=========================");
		//회원가입 
		System.out.println(us.join(user1));
		System.out.println(us.join(user2));
		System.out.println(us.join(user3));
		System.out.println("=========================");
		System.out.println(us.duplicateId(user1));
		

		//id가 중복되는지 확인 
		//회원가입 
		System.out.println(user1.getUserId());
//		System.out.println(us.duplicateId("aaa"));
		us.login("aaa", "111");
		us.login("2aa", "111");
		
		
	
		
	}
}

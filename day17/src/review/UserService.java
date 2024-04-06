package review;

import java.util.ArrayList;

public class UserService {
//  UserService 클래스를 선언한다.
//  - 회원정보를 저장할 List를 private으로 선언한다.
	//필드
	private ArrayList<UserVO> list = new ArrayList<>();
	
//  - 아이디 중복검사 메소드 정의
	//매개변수 id
	public boolean checkId(String id) {
		//모든 회원정보를 하나씩 가져와 변수에 담는다
		//for -each 문 
		//변수에 담긴 id값과 매개변수로 전달한 id와 비교한다(equals)
		for(UserVO user : list) {
			if(user.getUserId().equals(id)) {
				return false;
			}
		}
		return true;
	} 
//  - 회원가입 메소드 정의
	//매개변수 UserVO
	//반환 타입 x 
	public void join(UserVO user) {
		list.add(user);
	}
	
//  - 로그인 메소드 정의
	//매개변수o 리턴타입 o
	//for-each문 list 를 변수에 하나씩 복사 
	//조건 if문 id pw 둘다 동일시 로그인 성공
	//return 변수 ;
	//return null;
	public UserVO login(String id , String pw) {
		for(UserVO user : list ) {
			if(user.getUserId().equals(id) && user.getUserPassword().equals(pw)) {
				return user;
			}
		}
		return null;
	}
}


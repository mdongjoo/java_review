package user;

import java.util.ArrayList;

public class UserService{
//	UserService 클래스 
//	회원정보를 저장할 list를 private 로 선언한다
	//필드 
	private ArrayList<UserVO> list; 
//생성자 
	public UserService(ArrayList<UserVO> list) {
	super();
	this.list = list;
}
//getter 
	public ArrayList<UserVO> getList() {
		return this.list;
	}
	
	
//	메소드 
	//아이디 중복 검사 메소드 
//	파라미터로 들어온 contains 로 중복 확인 반환값 boolean 
	boolean duplicateId(UserVO user) {
		for(UserVO u1 : list) {
			if(u1.getUserId().equals(user.getUserId())) {
				System.out.println("중복되는 아이디가 있습니다.");
				return false;
			}
		}
		System.out.println("사용할 수 있는 아이디입니다.");
		return true;
	}
	//회원가입 메소드
	//아이디 중복 검사를 통해 중복되지 않는다면 , 비밀번호와 이름 나이를 대입해 넣어준다 add 
//	//성공하면 boolean true값 반환
	boolean join(UserVO user) {
		if(!duplicateId(user)) {
			return false;
		}
		list.add(user);
		System.out.println("회원 가입 되었습니다");
		return true;
		
		
	}
	//로그인 메소드 
	//contain 을 이용해 id 와 pw가 동시에 같으면 로그인 되었습니다 출력
	//실패 성공을 boolean 반환 타입
	boolean login(String id,String pw) {
		for (UserVO user : list) {
            if (user.getUserId().equals(id) && user.getUserPassword().equals(pw)) {
                System.out.println("로그인에 성공했습니다.");
                return true;
            }
        }
        System.out.println("로그인에 실패했습니다.");
        return false;
    }
}

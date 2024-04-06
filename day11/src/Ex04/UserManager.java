package Ex04;

import java.util.Scanner;

public class UserManager extends User {
//	UserManager 클래스
//	회원가입 및 로그인 기능을 관리
//	로그인 시에는 입력된 아이디와 비밀번호를 확인하여 로그인 여부를 반환
//	단, 최대 5명의 사용자만 저장가능, 그 이상 추가될 경우 더이상 회원가입이 불가능합니다라는 메시지 출력할 것
//	모든 필드의 접근 제한자는 private으로 설정할것
//
//	** 클래스와 메소드, 필드를 어떻게 구현할지 로직구성 필수!!
	//필드
	private User[] user = new User[5]; 
	private int cnt;
	//메서드 로그인 기능 회원가입 기능 
	//회원가입 메서드 
	//중복확인 
	void joinMembership(Scanner scan) {
		if(cnt <5) {
		System.out.print("회원가입을 위한 아이디를 입력하세요 : ");
		//java.lang.NullPointerException 오류 
		if (user[cnt] == null) {
            user[cnt] = new User();
        }
		//아이디를 저장 
		user[cnt].setId(scan.nextLine()); 
		System.out.print("회원가입을 위한 비밀번호를 입력하세요 : ");
		user[cnt].setPw(scan.nextLine()); 
		
		//입력이 잘되었는지 확인
//		System.out.println(user[cnt].getId());
//		System.out.println(user[cnt].getPw());
//		
		cnt++;
//		System.out.println(cnt);
		
		}else {
			System.out.println("더이상 회원가입이 불가능합니다");
		}
	}
	//로그인 메서드 
	void login(Scanner scan) {
		System.out.print("로그인을 위한 아이디를 입력하세요 :");
		String tryLogin = scan.next();
		for(int i = 0 ;i < user.length ;i++) {
			if(user[i].getId().equals(tryLogin)) {
				System.out.println("일치하는 값이 존재합니다. ");
				System.out.println("패스워드를 입력하세요 : ");
				if(scan.next().equals(user[i].getPw())) {
					System.out.println("로그인에 성공하셨습니다. ");
				}else {
					System.out.println("패스워드가 일치하지 않습니다 ");
				}
			}
		}
	}
	//getter setter 
	public User[] getUser() {
		return user;
	}
	public void setUser(User[] user) {
		this.user = user;

	}
	
	
	//기본 생성자
	public UserManager() {
		super();
	}



	
}

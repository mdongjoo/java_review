package Ex04;

import java.util.Scanner;

public class UserMain {
	//4. 배열을 이용하여 사용자 정보를 저장하고-> 입력받는다 . , 메소드를 오버로딩하여 사용자의 로그인과 회원가입 기능을 구현하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체 생성
		UserManager um = new UserManager();
		
		um.joinMembership(scan);
		um.joinMembership(scan);
//		um.joinMembership(scan);
//		um.joinMembership(scan);
//		um.joinMembership(scan);
//		um.joinMembership(scan);//더이상 회원가입이 불가능합니다
		
		um.login(scan);
		
	}
}

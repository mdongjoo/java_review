package Ex04;
//4. 배열을 이용하여 사용자 정보를 저장하고-> 입력받는다 . , 메소드를 오버로딩하여 사용자의 로그인과 회원가입 기능을 구현하기
//모든 필드의 접근 제한자는 private으로 설정할것
public class User {
//	User 클래스
//	사용자의 아이디와 비밀번호를 관리
	//필드
	//사용자의 아이디 String , 사용자의 비밀번호 String 
	//모든 필드의 접근 제한자는 private
	private String id;
	private String pw; 
	//메서드
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String password) {
		this.pw = password;
	}
	
	//생성자
	//기본 생성자
	public User() {
		
	}



}

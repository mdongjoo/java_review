package user;

public class UserVO {
//	필드 :  아이디 비밀번호 이름 나이 (private)
//	생성자를 통해서만 초기화 -> 세터 필요없다 게터만
//	toStirng() 재정의하여 모든 필드의 값을 확인할 수 있도록 한다
//	모든필드의 getter메소드를 만든다 
	//필드 
	private String userId; //유저아이디
	private String userPassword; //유저비밀번호
	private String userName;//유저이름
	private int userAge; //유저나이
	//생성자 매개변수 4개 초기화
	public UserVO(String userId, String userPassword, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userAge = userAge;
	}
	//getter 
	public String getUserId() {
		return userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public int getUserAge() {
		return userAge;
	}
	//toString() 모든 필드의 값을 확인할 수 있도록 한다
	// [] 형태로 출력되게끔
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[UserVo userId : "+ this.userId + " userPassword : "+ this.userPassword +" userName :" + this.userName + " userAge :"+ this.userAge+" ]";
	}
	
	
}

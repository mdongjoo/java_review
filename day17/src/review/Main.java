package review;

public class Main {
	public static void main(String[] args) {
		//userVO 객체 생성
		//필드는 private 이지만 생성자를 통해 값을 초기화할 수 있으므로 세터를 사용하지 않는다 
		UserVO user = new UserVO("abc1", "1234", "홍길동", 20);
		System.out.println(user);
		//UserService 객체 생성
		UserService service = new UserService();
		
		//조건문 id 중복검사를 하고 true라면 
		if(service.checkId(user.getUserId())) {
			service.join(user);
			System.out.println(user);
			System.out.println("가입 완료 되었습니다. ");
		}else {
			System.out.println("중복된 아이디가 존재합니다.");
		}
	}
}

package musicTask;

public class Rock extends Music {
	//Rock클래스
	//락 모드를 출력하는 mode메소드
	//only 락 실행을 출력하는 onlyRock메소드 
	//메소드 
		@Override
		void mode() {
			System.out.println("락 모드입니다.");
		}
		void onlyRock() {
			System.out.println("onlyRock!");
		}
}

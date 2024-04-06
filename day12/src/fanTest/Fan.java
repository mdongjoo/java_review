package fanTest;
//Fan 인터페이스 구현한 클래스 3개
	//BasicFan
	//버튼으로 전원켜기 , 버튼으로 전원끄기 , turbo는 비워둔다 
	//
	//BasicFan2
	//리모컨으로 ,,, turbo 는 터보라고 출력 
	//
	//SmartFan
	//음성인식으로 전원켜기 , ,,,끄기 , turbo 터보 출력 
public interface Fan {
	//상수
	int MAX_STRANGTH = 3;
	int MIN_STRANGTH = 0;
	//추상메소드
	void on();
	void off();
	void turbo();
	

}

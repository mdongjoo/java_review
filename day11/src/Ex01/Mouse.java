package Ex01;

public class Mouse extends Animal {
//	Mouse 클래스 부모클래스를 상속받는 자식클래스
//	필드: 없음 
//	메소드: cry() 오버라이딩 (쥐 소리를 출력)
	//extends 상속 키워드 Animal을 상속받는다 extends 생성자를 만들어 오류를 지워준다 
			//메소드 오버라이딩 
			//필드
			//메서드 void cry(){}
		@Override
		void cry() {
			System.out.println("쥐가 웁니다.");
		}
		//생성자 
		//기본생성자
		public Mouse() {
			super();
		}
}

package review;

public class Motocycle extends Vehicle{
	//Car클래스 추상클래스 상속 받는 클래스 
		//추상클래스 메소드 오버라이딩 
		//속도 필드 추가 (private)
		
		//필드
		private int speed ; 
		//메소드 오버라이딩
		@Override
		public void move() {
			// TODO Auto-generated method stub
			System.out.println("오토바이가 움직입니다.");
		}
		//getter setter 오버라이딩 
		@Override
		public int getSpeed() {
			return this.speed;
		}
		@Override
		//속도 설정하는 메소드 
		public void setSpeed(int speed) {
			this.speed = speed;
			System.out.println("오토바이의 속도를 " + this.speed + "로 변경했습니다. ");
		}
}

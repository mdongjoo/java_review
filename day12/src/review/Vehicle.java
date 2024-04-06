package review;

public abstract class Vehicle {
	//차량(vehicle) 추상클래스 
			//move() 이동하는 추상메소드 
			//속도 설정 메소드 (매개변수 int  speed)
			//현재 속도 가져오는 메소드 
	//필드 없음
	
	//move() 추상메소드 
	public abstract void move();
	//속도 설정 메소드 (매개변수 int  speed)
	public abstract void  setSpeed(int speed);
	
	//현재 속도 가져오는 메소드 
	public abstract int getSpeed();
	
	
	
	
}

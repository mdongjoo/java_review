package musicTask;

public class MusicMain {
	//MusicMain 클래스
	//main 메소드
	//check메소드 = > 객체를 확인해서 해당 클래스의 메소드가 모두 출력될수 있도록 구현 
	public static void main(String[] args) {
		//Music m1 = new Music();
		Ballad b1 = new Ballad();
		HipHop h1 = new HipHop();
		Rock r1 = new Rock();
		
	
		check(b1);
		check(h1);
		check(r1);
		
	}
	
	static void check(Music music) {
		music.mode();
		if(music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		}else if(music instanceof Rock) {
			((Rock)music).onlyRock();
		}else if(music instanceof HipHop) {
			((HipHop)music).onlyHipHop();
		}
	}
}

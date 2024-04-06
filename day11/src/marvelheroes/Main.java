package marvelheroes;

public class Main {
//	히어로 객체를 생성하고 슈퍼파워를 사용하기(업캐스팅, 다운캐스팅을 이용하여 슈퍼파워 메소드의 내용 출력하기)
	public static void main(String[] args) {
		IronMan i = new IronMan();
		Hulk h = new Hulk();
		SpiderMan s = new SpiderMan();
//		i.setName("아이언맨");
//		h.setName("헐크");
//		s.setName("스파이더맨");
		
		printSuperPower(i);
		printSuperPower(h);
		printSuperPower(s);
	}
	
	//업캐스팅 사용 
	static void printSuperPower(Hero hero) {
		if(hero instanceof IronMan) {
			hero.setName("아이언맨");
		}else if(hero instanceof Hulk) {
			hero.setName("헐크");
		}else if(hero instanceof SpiderMan) {
			hero.setName("스파이더맨");
		}
		hero.sayCatchphrase();
		hero.useSuperpower();
	}
}

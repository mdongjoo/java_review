package marvelheroes;

public class Hulk  extends Hero{
	//메소드 
		@Override
		public void useSuperpower() {
			System.out.println("슈퍼 주먹 ");
		}

		@Override
		public void sayCatchphrase() {
			System.out.println("나는 헐크");
		}
}

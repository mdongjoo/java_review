package accessModifier;

public class A {
	//필드
		public int var1 = 1;
		int var2 = 2;
		protected int var3 = 3;
		private int var4 = 4;
		//메소드
		
		//생성자
		public A() {
			super();
		}
		//메소드
		public void publicMethod() {
			System.out.println("public 메소드 호출");
		}
		public void defaultMethod() {
			System.out.println("default 메소드 호출");
		}
		public void proMethod() {
			System.out.println(" pro 메소드 호출");
		}
		//getter, setter 메소드 alt + shift + s + r
		public void setVar4(int var4) {
			this.var4 = var4;
		}
		
		public int getVar4() {
			return var4;
		}
		
}

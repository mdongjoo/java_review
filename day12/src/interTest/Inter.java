package interTest;

public interface Inter {
	//상수 , 추상메소드
	public static final int VAR1 = 20 ;
	int VAR2 = 30 ; //public final static를 붙이지 않아도 자동으로 상수로 컴파일한다 
	
	public abstract void method1();
	void method2(); //public abstract을 붙이지 않아도 자동으로 추상메소드로 컴파일한다 
}

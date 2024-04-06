package lamdaTest;

import java.lang.annotation.Annotation;

public class Main {
	public static void main(String[] args) {
		
		FunctionalInter fi = new FunctionalInter() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("익명 객체의 메소드 재정의 ");
			}
		};
		fi.method1();
		
	}
}

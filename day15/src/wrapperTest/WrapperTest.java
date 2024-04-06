package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int number = 10;
		
		//boxing 
		Integer numInt = new Integer(number); //boxing 예전 방법 
		System.out.println(numInt + 10);
		
		Integer numInt2 = Integer.valueOf(number);
		System.out.println(numInt2);
		
		Double numDouble = new Double(1.1);//예전방법
		Double numDouble1 = Double.valueOf(1.1);
		System.out.println(numDouble);
		System.out.println(numDouble1);
		
		//unboxing
		int num1 = numInt2.intValue();
		double num2 = numDouble1.doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		
		//auto
		Integer numInt3 = 3;
		int num3 = numInt3 ;
		
		System.out.println(numInt3);
		System.out.println(num3);
	}
}

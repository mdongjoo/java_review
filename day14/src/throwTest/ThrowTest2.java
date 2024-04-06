package throwTest;

import java.util.Scanner;

public class ThrowTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number = 0;

		System.out.print("양의 정수를 입력하세요");
		
		
		number = scan.nextInt();
		if(number <0) {
			try {
				throw new MyException();				
			}catch(MyException e) {
				e.printStackTrace();
			}
		}

		System.out.println(number);
	}
}

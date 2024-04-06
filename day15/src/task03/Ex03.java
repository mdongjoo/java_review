package task03;

import java.util.Scanner;

public class Ex03 {
//	3. 문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
//	만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며
//	"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력할것
	//로직
		//Integer.parseInt()이용 
		//문자열이 숫자가 아닐경우 NumberFormatException -> try-catch 문 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		//auto boxing unboxing 
		//입력값이 숫자가 아닐경우 예외처리 
		try {
		int number = Integer.parseInt(scan.next());
		System.out.println(number);
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다");
		}
		
		
	}
}

package forTest; //패키지 

public class ContinueTest02 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//1부터 10까지 5를 제외하고 출력하기
		// 반복문(for 초기식 int i = 0; 조건식 i < 10; 증감식 i++)
		// 조건문(if 조건식 i == 4)
		// 출력(i+1)
		
		for(int i = 0; i < 10; i++) { //반복분 for 문 
			if(i==4) { //if문 조건문 
//				continue;
				break; //break : for문을 종료 
			}
			System.out.println(i+1); //출력 
		} //for문 종료 중괄호 
	} //메인 메소드 종료 
} //클래스 종료 











package forTest; //패키지 

public class ContinueTest01 { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		//1부터 100까지의 합 출력
		//1) 총합 구할 변수
		//2) for(초기식 : int i = 1; 조건식 : i <= 100; 증감식 : i++){
		//3)	총합 변수 += i }
		//4) 출력
		
		int total = 0; //정수형 변수에 초기값으로 선언 및 초기화 
		for(int i = 1; i <= 100; i++) { //반복문 for문을 이용 
//			total += i;
			if(i % 2 == 0) { //if문 짝수일때 참 홀수일때 거짓 
				continue; //다음 for문으로 넘어감 
			}
			total += i; // i값을 total 에 더함 
//			System.out.println(i);
		}
		System.out.println("1부터 100까지의 홀수의 총합 : " + total); //출력
	}//메인메소드 종료
} //클래스 종료 














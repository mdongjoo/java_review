package task;//패키지 

public class Ex07 { //클래스 선언부 
//	7. 1부터 50까지의 수 중 3의 배수는 출력하지 않고 나머지 수는 모두 출력하기
	//로직
	//for문 if문 사용
	public static void main(String[] args) {//메인 메소드 선언부 
		for(int i = 0 ;i <50 ;i++) { //for문 반복문 
			if(i%3 != 0) { //if문 3의 배수일때 참 
				System.out.println(i); //출력
			} //if문 종료 
		} //for문 종료
	} //메인 메소드 종료 
} //클래스 종료 

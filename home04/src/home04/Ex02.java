package home04;

public class Ex02 {
//	1부터 100까지의 숫자 중에서 7의 배수이면서 5의 배수가 아닌 숫자들을 출력하기
	public static void main(String[] args) {
		//로직 
		//for문을 아직 안배웠기 때문에 while문 사용 
		//cnt
		//&&
		//출력문
		int cnt = 1 ;
		while(cnt <= 100) {
			if(cnt%7 ==0 && cnt%5 != 0) {
				System.out.println(cnt);
			}
			cnt ++ ;
		}
	}
}

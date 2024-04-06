package home04;

public class Ex01 {
	public static void main(String[] args) {
//		1부터 10까지의 숫자 중에서 홀수만 출력하기
		//로직 
		//while문 cnt 변수 사용
		//%2 == 0사용
		//출력문
		int cnt =1;
		while(cnt <= 10) {
			if(cnt%2 ==0) {
				System.out.println(cnt);
			}
			cnt ++ ;
		}
	}

}

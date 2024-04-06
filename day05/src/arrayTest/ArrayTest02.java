package arrayTest; //패키지

public class ArrayTest02 {//클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//어떤 값을 넣을 지 알 때
		int[] ar1 = {1, 2, 3, 4, 5}; //정수형 배열에 값을 대입 
		System.out.println(ar1); //참조값
		System.out.println(ar1[0]); //0번째 저장공간에 저장된 값
		System.out.println(ar1[4]); //4번째 인덱스 저장공간에 저장된 값 
		
		//몇칸 만들지만 알 때
		int[] ar2 = new int[3]; //heap메모리에 정수형 3칸자리 배열을 생성후 정수형 배열 변수에 참조값을 대입 
		System.out.println(ar2); //참조값
		System.out.println(ar2[0]); //초기값
		System.out.println(ar2[1]); //초기값
		System.out.println(ar2[2]); //초기값
		
		ar2[0] = 10; // 0번째 인덱스에 값을 대입
		ar2[1] = 20; // 1번째 인덱스에 값을 대입
		ar2[2] = 30; //2번째 인덱스에 값을 대입
		System.out.println(ar2[0]); //출력
		System.out.println(ar2[1]); //출력
		System.out.println(ar2[2]); //출력
		//배열의 길이 확인 : 배열명.length
		System.out.println(ar2.length); //배열으 ㅣ길이 출력
		
		System.out.println(ar1.length); //배열의 길이 출력 

		int[] arData = {4, 2, 3, 1}; //정수형 배열에 값을 대입 
//		int number = arData; 
		
	} //메인 메소드 종료
} //클래스 종료 











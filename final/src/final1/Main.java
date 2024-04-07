package final1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
//  Post 클래스
//  - 모든 필드는 private으로 설정한다
//  id: 게시물의 고유 식별자 (정수)
//  title: 게시물의 제목 (문자열)
//  content: 게시물의 내용 (문자열)
//
//  Board 클래스
//  - 메소드(매개변수와 리턴값의 유무는 본인의 로직으로 판단)
//  addPost: 제목과 내용을 받아 새로운 게시물을 게시판에 추가
//  deletePost: 주어진 ID에 해당하는 게시물을 게시판에서 삭제
//     해당 ID가 게시판에 없을 경우 IllegalArgumentException을 던진다
//  getAllPosts(): 모든 게시물을 리스트로 반환
//
//  Main 클래스
//  - 사용자가 메뉴를 통해 게시물을 작성, 삭제, 조회할 수 있어야 한다
	//메뉴는 msg 문자열 변수를 통해 메뉴를 확인할 수 있게 한다 
	//게시물 작성 , 삭제, 조회는 Board 클래스를 통해 확인할 수 있다  
	public static void main(String[] args) {
		Board board = new Board();
		Scanner scan = new Scanner(System.in);
		int num= 0 ;
		//반복문 
		while(true) {
			messageInfo();
			try {
				num = scan.nextInt();
			}catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("잘못된 값이 입력되었습니다");
				scan.close();
			}
			switch(num){
			case 1 : 
				System.out.println("게시물의 제목과 내용을 입력하세요");
				board.addPost(scan.next(),scan.next());
				break;
			case 2 : 
				System.out.println("삭제할 게시물의 번호를 입력하세요");
				try {
					board.deletePost(scan.nextInt());
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3 : 
				board.getAllposts();
				break;
			case 4 : 
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			default :
				System.out.println("다른 값이 들어왔습니다.");
				break;
			}
			
		}
	}
	static void messageInfo() {
		System.out.println("=====메뉴=====");
		System.out.println("1. 게시물 작성");
		System.out.println("2. 게시물 삭제");
		System.out.println("3. 게시물 조회");
		System.out.println("4. 종     료");
		System.out.println("============");
		System.out.print("선택 : ");
		
	}
}

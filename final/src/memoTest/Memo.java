package memoTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//프로그램이 실행되면 새 메모 작성 / 메모 열기 / 메모 저장 / 종료 중 하나를 선택해야함
//1번 새 메모 작성
//
//사용자가 새 메모 내용을 작성할 수 있어야함
//작성한 내용은 프로그램 종료 전까지 메모리에 저장되어야함
//
//2번 메모 열기
//
//사용자가 파일 이름을 입력하면 해당 파일의 내용을 화면에 출력해야함
//파일이 없거나 읽기 오류가 발생하면 오류 메시지 표시
//
//3번 메모 저장
//
//사용자가 입력한 파일 이름으로 현재 메모리에 저장된 메모 내용을 저장함
//저장 중 오류가 발생하면 오류 메시지 표시
//
//4번 종료
public class Memo {
	public static void main(String[] args) {
		String fileContent = "";
		Scanner scan = new Scanner(System.in);
		String msg = "\n 메모 콘솔 프로그램\n" + "1. 새 메모 작성\n" + "2. 메모 열기\n" + "3. 메모 저장\n" + "4. 종료\n" + "메뉴를 선택하세요: ";
		int num = 0;

		while (true) {
			System.out.print(msg);
			//try-catch 지움
			num = scan.nextInt();
			
			
			switch (num) {
			case 1:
				System.out.println("======새 메모 작성 =======");
				try {
					fileContent = newMemo(scan);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("=======================");
				break;
			case 2:
				openMemo(scan);
				break;
			case 3:
				System.out.println("======== 메모 저장========");
				try {
					saveMemo(scan, fileContent);
				} catch (IOException e) {
					System.out.println("저장할 메모가 없습니다.");
					continue;
				}
				System.out.println("=======================");
				break;
			case 4: // 종료
				System.out.println("프로그램을 종료합니다");
				scan.close();
				System.exit(0);
			default:
				System.out.println("값이 잘못 입력되었습니다. ");
				break;

			}
		}
		
	}

	// 새 매모 작성
	private static String newMemo(Scanner scan) throws IOException {
		// 새메모 내용 입력
		// IOException
		// 사용자가 새 메모 내용을 작성할 수 있어야함
		// 작성한 내용은 프로그램 종료 전까지 메모리에 저장되어야함
		// 새 메모의 파일 이름을 입력받는다
		// 내용을 입력받는다
		// 작성한 파일 이름과 내용을 Memo 클래스내에 리스트에 저장한다
		System.out.println("새 메모의 내용을 작성하세요");
		String fileContent = scan.next();
		return fileContent;
	}

	// 메모 열기
	private static void openMemo(Scanner scan) {
		// 열고싶은 메모의 파일명 입력
		// 파일이 존재하지 않거나 읽을 수 없을 때 예외처리 try - catch
		// 사용자가 파일 이름을 입력하면 해당 파일의 내용을 화면에 출력해야함
		// 파일이 없거나 읽기 오류가 발생하면 오류 메시지 표시
		System.out.println("열고싶은 메모의 파일 명을 입력하세요:");
		String fileTitle = "";
		try {
			fileTitle = scan.next();
		} catch (Exception e) {
			System.out.println("값이 잘못들어왔습니다.");
			e.printStackTrace();
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileTitle));
			System.out.println("========파일 출력=========");
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 메모저장
	private static void saveMemo(Scanner scan, String fileContent) throws IOException {
		// 저장할 파일명
		// 저장할 메모가 없을 때 예외처리
		// 사용자가 입력한 파일 이름으로 현재 메모리에 저장된 메모 내용을 저장함
		// 저장 중 오류가 발생하면 오류 메시지 표시
		// 파일 객체를 생성
		// 저장할 파일명 입력받는다 fileTitle에
		if (fileContent == "") {
			throw new IOException();
		}
		System.out.println("저장할 파일명을 입력하세요");
		String fileTitle = scan.next();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileTitle)));
			bw.write(fileContent);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

}

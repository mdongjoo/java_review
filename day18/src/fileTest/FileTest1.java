package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) {
		//자바에서 기본 현재 경로는 프로젝트 폴더이다 
		
		File f = new File("test.txt");
		//파일 생성
//		try {
//			f.createNewFile();
//			System.out.println("파일 생성되었습니다");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//각각 하지않고 드래그 후 단축키 누르면 두 예외처리가 한번에 가능하다
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write('a');
			System.out.println("test.txt파일에 문자 a를 추가했습니다");
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

package basicpart1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  지정된 파일의 크기를 찾는 Java 프로그램을 작성하십시오.
 *  /home/students/abc.txt : 0바이트                                       
 *  /home/students/test.txt : 0바이트
 */
public class Ex045 {

	public static void main(String[] args) throws IOException{

		// 파일 경로 변수 선언
		String filePath = "";
		
		// 입력 스트림 선언 -> 파일경로 담기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		filePath = br.readLine();
		
		File fileName = new File(filePath);
		
		// 파일 존재 확인 후 사이즈 찾기
		if(fileName.isFile()) {
			long fileSize = fileName.length();
			System.out.println(filePath + "의 Size는 " + fileSize + "입니다.");
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		} // if-else
		
	} // main
	
} // end class
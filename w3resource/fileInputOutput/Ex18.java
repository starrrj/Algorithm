package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
 * * ==========================================================
 * 1. 변수선언, 초기화 명시 (의미, 사용하는 곳 주석)
 * 2. Main은 결과값만 ! 로직구현 XX
 * 3. 메소드를 따로두어 로직구현 -> 최소한의 일. 
 * 4. 변수, 메소드 명명 규칙 지키기
 * 5. try-catch 문 사용하여 예외처리. 던지지말기!
 * 6. 방법론 안에서 변수선언 XX, 한번쓰고 버리는 변수는 가능
 * 7. 검증 필수!
 * 8. 선언 -> 초기화 -> 검증 -> 수행 -> 조립 -> 리턴
 * 9. 전역변수 X
 * 10. 주석 꼭 적어주기 -> 지역변수, 메서드 등 모두 !
 * 11. 논리적인 로직에서 한번 더 생각하여, 효율적으로 (***)
 * ===========================================================
 * 
 * 텍스트 파일에서 가장 긴 단어를 찾는 Java 프로그램을 작성하십시오.
 *  
 */

public class Ex18 {

	public static void main (String[] args) {

		String fileName = inputStr();
		
		String LongWord1 = findMaxLongWord(getTextFileUseCharArr(fileName));

		String LongWord2 = findMaxLongWord(getTextFile(fileName));
		
		String LongWord3 = findMaxLongWord(getTextFileUseList(fileName));
		
		System.out.println("LongWord1 : " + LongWord1);
		System.out.println("LongWord2 : " + LongWord2);
		System.out.println("LongWord3 : " + LongWord3);
		
	} // main
	
	
	/*
	 * 1. 문자열 입력 (Str)
	 */
	public static String inputStr() {

		String str = "";

		String messageIOException = "입출력 오류입니다.";
		String nullPointerException = "비어있는 문자열을 입력하셨습니다.";

		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		try {

			str = br.readLine();
			
			// 만약 비어있거나 공백으로 입력한다면 NullPointerException 발생시킴
			if(isBlank(str) == true) {
				
				str = null;
				
			} // if

		} catch (IOException e) {

			System.out.println(messageIOException);
			System.out.println(e.getMessage());

		} catch (NullPointerException e) {

			System.out.println(nullPointerException);
			System.out.println(e.getMessage());

		} // try-catch

		return str;

	} // inputStr


	
	/*
	 * 1-1. 입력된 String 공백 또는 띄어쓰기만 존재하면 메세지 출력
	 */
	public static boolean isBlank(String inputStr) {

		// 띄어쓰기 제거하기
		String nonWhitespace = inputStr.replace(" ", "");

		// 문자열이 공백, 띄어쓰만 존재하는 지
		boolean isBlank = false;

		// 띄어쓰기를 제외한 문장이 비어있다면 true 리턴
		if (nonWhitespace.isEmpty() == true) {

			isBlank = true;

		} // if

		return isBlank;

	} // isBlank
	
	
	
	/*
	 * 2-1 Txt 파일 String으로 읽어오기
	 */
	public static String getTextFileUseCharArr (String file) {
		
		FileReader fr;
		String fileName = file;
		String txtfile = "";
		
		String messageIOException = "입출력 오류입니다.";
		
		try {
			fr = new FileReader("C:/temp/test/" + fileName + ".txt");
			
			int readCharNo;
			
			// 임시로 배열크기 100 설정
			char[] cbuf = new char[100]; 
			
			
			while( (readCharNo = fr.read(cbuf)) != -1 ) {
				
				// String(char value[], int offset, int count)
				String data = new String(cbuf, 0, readCharNo);
//				System.out.println("getTextFileUseCharArr : " + data);
				
				txtfile += data;
				
			} // while

		} catch (IOException e) {	
			
			System.out.println(messageIOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return txtfile;
		
	} // getTextFile
	
	
	
	/*
	 * 2-2. Txt 파일 String으로 읽어오기
	 */
	public static String getTextFile (String file) {
		
		FileReader fr;
		String fileName = file;
		
		String txtfile = "";
		
		String messageIOException = "입출력 오류입니다.";
		
		try {
			fr = new FileReader("C:/temp/test/" + fileName + ".txt");
			
			int readCharNo;
			
			// file의 내용을 옮길 char배열을 임시생성
			char[] cbuf = new char[100]; 
			
			// -1 이 나오기 전까지 계속 옮겨준다.
			while( (readCharNo=fr.read(cbuf)) != -1 ) {
				
				// String(char value[], int offset, int count)
				String data = new String(cbuf, 0, readCharNo);
//				System.out.println("getTextFile : " + data);
				
				txtfile += data;
				
			} // while

		} catch (IOException e) {	
			
			System.out.println(messageIOException);
			System.out.println(e.getMessage());
			
		}// try-catch
		
		return txtfile;
		
	} // getTextFile
	

	
	/*
	 * 2-3. Txt 파일 List사용해서 String으로 읽어오기
	 */
	public static String getTextFileUseList (String file) {
		
		String fileName = file;
		String fileSubject = "";
		
		String messageIOException = "입출력 오류입니다.";
		
		try {
			
			Path pathsGet = Paths.get("C:/temp/test/" + fileName + ".txt");
			
			// 파일의 모든 라인을 불러와 list에 담는다.
            List<String> lines = Files.readAllLines(pathsGet);
            					
            
            // list를 String으로 변환하여 변수에 저장!
            fileSubject = lines.toString();
            
//			System.out.println("getTextFile : " + fileSubject);
            
        } catch (IOException e) {
        	
        	System.out.println(messageIOException);
			System.out.println(e.getMessage());
            
        } // try-catch
		
		return fileSubject;
		
	} // getTextFile
	
	
	
	/*
	 * 3. String 중 가장 긴 단어 찾기
	 */
	public static String findMaxLongWord (String str) {
		
		String LongWord;
		
		// 문장을 빈칸으로 잘라 String배열에 문자를 담기
		String[] strWordArr = str.split(" ");
		
		// 문자의 길이
		int wordlength = 0;
		
		// 문자가 있는 인덱스번호
		int index = 0;
		
		// 배열을 탐색하기
		for (int i = 0; i < strWordArr.length; i++) {
		   	
	    	// length와 배열담긴 문자의 길이를 비교한다.
	    	if(wordlength < strWordArr[i].length()) {
	        	
	            // 긴 쪽의 문자열길이를 length에 담는다.
	    		wordlength = strWordArr[i].length();
	    		
	            // 인덱스 번호를 담는다.
	    		index = i;
	    		
	        } // if
	    	
	   } // for
		
		LongWord = strWordArr[index];
		
		return LongWord;
		
	} // findMaxLongWord
	
} // end class

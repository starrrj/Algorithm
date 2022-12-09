package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
 * 주어진 텍스트에서 특정 단어를 제거하는 Java 프로그램을 작성하십시오. 
 * 새 문자열을 반환합니다.
 * 
 */


public class Ex111 {

	public static void main(String[] args) {
		
		String str1 = inputStr();
		String str2 = inputStr();
		
		String result = removeWords(str1, str2);
		
		System.out.println(result);
		
	} // main
	
	
	
	/*
	 *  문자열 특정 단어 제거 + 입력하지않았을 시 에러 메세지
	 */
	public static String removeWords (String str1, String str2) {
		

		String emptyMessage = "문자열을 입력해주세요";
				
		String resultStr = "";
		
		// 입력 X -> 에러메세지 출력
		if(isBlank(str1) == true || isBlank(str2) == true) {
			
			System.out.println(emptyMessage);
			
		} // if 
		
		resultStr = str1.replace(str2, "");
		
		return resultStr;
		
	} // removeWords
	
	
	
	/*
	 *  입력된 String 공백 또는 띄어쓰기만 존재하면 메세지 출력
	 */
	public static boolean isBlank (String str) {
		
		// 띄어쓰기 제거하기
		String nonWhitespace = str.replace(" ", "");
		
		// 문자열이 공백, 띄어쓰만 존재하는 지
		boolean isBlank = false;
		
		// 띄어쓰기를 제외한 문장이 비어있다면 true 리턴 
		if(nonWhitespace.isEmpty() == true) {
			
			isBlank = true;
			
		} // if
		
		return isBlank;
		
	} // isBlank
	
	
	
	/*
	 *  문자열 입력(String)
	 */
	public static String inputStr() {
		
		String str = "";
		
		String IOException = "입출력 오류입니다.";
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			str = br.readLine();
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return str;
		
	} // InputStr
	

} // end class

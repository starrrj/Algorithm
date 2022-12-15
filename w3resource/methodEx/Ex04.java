package methodEx;

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
 *  문자열의 모든 모음을 세는 Java 메소드를 작성하십시오. 
 *  테스트 데이터:문자열 입력: w3resource
 *  
 *  예상 출력: 문자열의 모음 수: 4
 *
 */

public class Ex04 {

	public static void main(String[] args) {

		String inputStr = inputStr();
		
		int isVowelCnt = isVowelCnt(inputStr);
		
		System.out.println(isVowelCnt);
		

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
	 * 2. 해당 문자(1개)가 모음인지 판단
	 */
	public static boolean isVowel (String str) {
		
		boolean isVowel = false;
		
		boolean vowelUpperStr = "AEIOU".contains(str); 	// 대문자
		boolean vowelLowerrStr = "aeiou".contains(str);	// 소문자

		// 대문자, 소문자 중에 포함 되어있을 때
		if(vowelUpperStr == true || vowelLowerrStr == true) {
		
			isVowel = true;
			
		} // if
		
		return isVowel;
		
	} // isVowel
	
	
	
	/*
	 * 3. 모음 개수 세기
	 */
	public static int isVowelCnt (String str) {
		
		int isVowelCnt = 0;		// 모음개수
		String OneOfStr = "";	// 문자열 1개 잘라서 넣기 
		
		for (int i = 0; i<str.length(); i++) {
			
			OneOfStr = str.substring(i, i+1);
			
			if(isVowel(OneOfStr) == true) {
				
				isVowelCnt ++;
				
			} // if
			
		} // for
		
		return isVowelCnt;
		
	} // isVowel
	
	 
} // end class

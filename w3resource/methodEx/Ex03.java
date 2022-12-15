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
 *  문자열의 중간 문자를 표시하는 Java 메소드를 작성하십시오.
 *  참고: a) 문자열의 길이가 홀수인 경우 두 개의 중간 문자가 있습니다.
 *  b) 문자열의 길이가 짝수이면 중간에 하나의 문자가 있습니다.
 *  테스트 데이터: 문자열 입력: 350
 *  예상 출력: 5
 *  
 *  1. 문자열 입력
 *	2. 문자 길이의 중간값 찾기
 *  3. 짝수인지 ? 판별 
 *	3. 중간의 값 출력
 *
 */

public class Ex03 {

	public static void main(String[] args) {

		String inputStr = inputStr();
		String middle = findMiddleValue(inputStr);
		
		System.out.println(middle);

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
	 * 2-A. 문자 길이의 중간 인덱스 찾기
	 */
	public static int findMiddleIndex(String inputStr) {
		
		int strLength;		// 입력한 문자의 길이
		int middleIndex;	// 입력한 문자의 가운데 인덱스 --> int : 소수점인경우 자동 내림
		
		strLength = inputStr.length();
		middleIndex = (strLength - 1) / 2;
		
		return middleIndex;
		
	} // findMiddleofString

	
	/*
	 * 2-B. 문자 길이가 홀수인지 짝수인지
	 */
	public static boolean isEven(String inputStr) {

		int strLength; // 입력한 문자의 길이
		boolean isEven = false;

		strLength = inputStr.length();

		if (strLength > 1 && strLength % 2 == 0) {

			isEven = true;

		} // if

		return isEven;

	} // findMiddleofString
	
	
	/*
	 * 2. 문자 길이의 중간값 1개인지 두개인지 판별하여 출력
	 */
	public static String findMiddleValue (String inputStr) {
		
		int middleIndex = findMiddleIndex(inputStr);
		String middleValue = "";
		
		// 1. 만약 짝수라면 2 글자
		if(isEven(inputStr) == true) {
			
			middleValue = inputStr.substring(middleIndex,middleIndex+2);
		
		// 2. 홀수라면 1 글자
		} else {
			
			middleValue = inputStr.substring(middleIndex,middleIndex+1);
			
		}
		
		return middleValue;
		
	} // findMiddleofString
	
	
	 
} // end class

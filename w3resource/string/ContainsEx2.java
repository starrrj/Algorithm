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
 *  A. 입력 받고
 *  B. 입력된 문자열 기준으로 비교 (2글자면 중첩해서 비교하기 나비 비야)
 *     - 입력된 문자열 > 제외 문자열
 *     - i => i - 제외 문자열 --> break;
 * 
 */

public class ContainsEx2 {

	public static void main (String[] agrs) {		
		
		//String inputStr = inputStr();
		//String findStr = inputStr();
		
		String inputStr = "나비야 나비야 이러 날아오너라";
		String findStr = "비야";
		
		System.out.println(containsOfStr1(inputStr, findStr));

		
	} // main

	
	/*
	 *  1. 문자열 입력(String)
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
	

	public static boolean containsOfStr1(String str1, String str2) {
		
		String message = "검색할 문자열이 기존 문자열보다 길게 입력되었습니다.";
		
		boolean isContains = false;

		if(str1 == null || str2 == null) {
			
			System.out.println("입력값이 잘못되었습니다. str1:"+str1+", str2:"+str2);
			
			return false;
		}	
		
		int str1Length = str1.length();
		int str2Length = str2.length();
//		String tempStr;
		String subString="";
		// 만약 기존 문자열보다 찾으려는 문자열이 긴 경우 메세지 출력
		if(str1Length < str2Length) {
			
			System.out.println(message);
		
			return false;
		} 
		
		// 검증 끝.
		
		
		for(int i = 0; i<str1Length; i++) {
			
			
//			tempStr = str1.substring(i);
			if(i+str2Length < str1Length) {
				
				subString = str1.substring(i, i+str2Length);
			}
			
			if(str2.equals(subString)) {
				
				System.out.println(str2+"->"+subString);
			}
			
		}


		return isContains;
				
	} // containsOfStr
	
	
	/*
	 *  2. 입력한 문자열 포함 여부 판단하기 (contains of char)
	 */
	public static int containsOfStr2(String str1, String str2) {

		int baseStr; // txt 커서
		int pattarn; // pat 커서
		
		int str1Len = str1.length(); // txt의 문자 개수
		int pattLen = str2.length(); // pat의 문자 개수
		
		int[] skip = new int[Character.MAX_VALUE + 1]; // skip table (건너뛰기 표)

		// 건너뛰기 테이블(skip table) 만들기
		for (baseStr = 0; baseStr <= Character.MAX_VALUE; baseStr++) {
			skip[baseStr] = pattLen;
		} // for
		
		for (baseStr = 0; baseStr < pattLen - 1; baseStr++) {
			skip[str2.charAt(baseStr)] = pattLen - baseStr - 1;
		} // for
		
		
		// 검색
		while (baseStr < str1Len) {
	
			pattarn = pattLen - 1;

			while (str1.charAt(baseStr) == str1.charAt(pattarn)) {
				
				if (pattarn == 0) {
					return baseStr; // 검색 성공
				} // if
				
				pattarn--;
				baseStr--;
			
			} // while
			
			baseStr += (skip[str1.charAt(baseStr)] > pattLen - pattarn) ? skip[str1.charAt(baseStr)] : pattLen - pattarn;
		
		} // while
		
		return -1; // while 문이 종료되면 검색 실패

	} // containsOfStr
	

	
} // end class

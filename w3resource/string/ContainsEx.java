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
 *  1. 입력 받고
 *  2. 입력 문자열 중 나눌 때 기준이 되는 문자 입력
 *  3. 문자열 비교하여 문자 위치(인덱스) 찾기
 *  4. 기준문자 삭제
 *  4. 문자위치(인덱스) 기준으로 배열에 담기
 * 
 */

public class ContainsEx {

	public static void main (String[] agrs) {		
		
		String inputStr = inputStr();
		String findStr = inputStr();
		
//		System.out.println(containsOfStr(inputStr, findStr));
		System.out.println(containsOfChr(inputStr, findStr));

		
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
	

	/*
	 *  2. 입력한 문자열 포함 여부 판단하기 (contains of char)
	 */
	public static String containsOfChr (String str1, String str2) {
		
		// String -> CharArray 로 변환
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		
		String indexOfChr = "";
		
		// 먼저 입력한 문장 탐색 
		for(int i = 0; i < chr1.length; i++) {
			
			// 1. 만약 chr1 배열에서 chr2[0]과 같은 값을 발견한다면!
			if( chr1[i] == chr2[0]) {
				
				// 인덱스 번호를 string에 담아주기
				indexOfChr += i;
				System.out.println(indexOfChr);

			} // if
			
		}// for
		
		return indexOfChr;
		
	} // containsOfStr
	
	
	/*
	 *  2. 입력한 문자열 포함 여부 판단하기 ( contains of string)
	 */
	public static boolean containsOfStr (String str1, String str2) {
		
		// String -> CharArray 로 변환
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		
		boolean isContains = false;
		
		// chr2의 길이
		int chr2Leng =  chr2.length;
		
		int count = 0;
		
		// 먼저 입력한 문장 탐색 
		for(int i = 0; i < chr1.length; i++) {
			
			// 1. 만약 chr1 배열에서 chr2[0]과 같은 값을 발견한다면!
			if( chr1[i] == chr2[0]) {
				
				// 찾을 문자열 탐색
				for(int j = 0; j < chr2.length; j++) {
					
					// 2. chr2[0]을 발견한 인덱스부터 chr2배열 마지막까지 같다면!
					if (chr1[i+j] == chr2[j]) { 
						
						count ++;
						
//						System.out.println(chr2[j] + "&" + chr2[chr2.length-1]);
//						System.out.println(i + "부터" + (i+chr2.length-1) + "까지");
					} else {
						
						if(chr2Leng == count) {
						
							isContains = true; 	// 왜 true가 안나와.....
							
						} else {
							
							isContains = false; 
							
						}
						
						count = 0;
						
					} // if-else
					
				} // for
				
			} // if
			
		}// for
		return isContains;
		
	} // containsOfStr
	
} // end class

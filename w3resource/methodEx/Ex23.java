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
 *  주어진 문자열의 모든 문자가 모음(a, e,i,o,u)인지 여부를 확인하는 Java 메소드를 작성하십시오. 
 *  문자열의 각 문자가 모음이면 true를 반환하고 그렇지 않으면 false를 반환합니다. 
 *  
 *  1 문자열 입력
 *  2. 문자열 확인 (모음 or 자음)
 *    (1) 포함 여부 : contains -> 하지만 모두 포함하지않아도 됨 '||' 이용 하지만 다른 문자가 있다면 false해야함
 * 	  (2) (문자열을 char[] 로 변경해서 sort) -> replace로 소거 -> 모음을 제거한 문자열이 빈 문자열(isEmpty)이라면 true  
 * 	  (3) switch 조건문 : 하나라도 false면 바로 break !
 * 	  (4) replace 함수 사용하여 모음을 모두 삭제하거나 공백으로 변경 -> 반복문 탐색했을 때 공백 or null이 아니라면 false
 */

public class Ex23 {

	public static void main(String[] args) {
		
		String inputStr = inputStr();
		
		boolean isVowel = isVowel(inputStr);
		
		System.out.println(isVowel);

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
	 * 2. String 삽입정렬
	 */
	public static String insertSort(String str) {

		// sort된 문자열을 담을 변수
		String sortStr;

		// 현재 값
		char nowValue;

		// 이전 index 변수.
		int preIndex;

		
		// 1. char 배열로 변환
		char[] charArr = str.toCharArray();

		
		// 2. 배열을 탐색하며 삽입 정렬
		for (int i = 1; i < charArr.length; i++) {

			nowValue = charArr[i];
			preIndex = i - 1;

			// 현재 선택된 원소가 이전 원소보다 작은 경우 + 이전 인덱스가 0과 같거나, 클 때
			while (preIndex >= 0 && charArr[preIndex] > nowValue) {

				// 이전 인덱스 값을 현재 인덱스에 넣기
				charArr[preIndex + 1] = charArr[preIndex];

				// 다음 대상 원소를 탐색한다.
				preIndex--;

			}

			// while 탈출 시점에 선택된 변수 값 저장.
			charArr[preIndex + 1] = nowValue;
		}

		// 3. 정렬된 배열을 새로운 문자열 변수에 담아서 반환
		sortStr = new String(charArr);
		
		return sortStr;

	} // insertSort
	
	
	
	/*
	 * 3. 모음/자음 확인하여 boolean 값 리턴
	 */
	public static boolean isVowel(String str) { 
		
		// 공백 제외하고 다시 
		String removeStr = str.replaceAll(" ", "");
		System.out.println(removeStr);
		
		boolean strIsVowel = true;
			
		char charA = 97;
		char charE = 101;
		char charI = 105;
		char charO = 111;
		char charU = 117;
		
		
		for(int i = 0; i < removeStr.length(); i++) {
			
			// 문자열 자리
			char strIndex = removeStr.charAt(i);
			
			// 1. 모음이 아닌 걸 찾으면 바로 반환하고 끝내기
			if (strIndex != charA && 
					strIndex != charE && 
					strIndex != charI && 
					strIndex != charO && 
					strIndex != charU) {
				
				System.out.printf(" >>> 자음 strIndex : %d , %c \n", i, strIndex);
			
				return strIsVowel = false;
				
			} // if
			
		} // for
		
		return strIsVowel;
		
	} // isVowel
	

} // end class

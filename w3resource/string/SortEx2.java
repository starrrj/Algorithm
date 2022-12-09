package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


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
 * (*** 문자열이라고 어렵게 생각하지말고, 숫자라고 가정해보자)
 * 
 *  1. 입력 받고
 *  2. Str[0] 이 제일 큰 것 찾기
 *  3. 가장 큰걸 찾아 newStr[0] 에 두기
 *  4. 비교하며 찾아서 순서대로 나열하기
 *  
 */

public class SortEx2 {

	public static void main(String[] args) {
		
//		String inputStr = inputStr();
		
		String inputStr = " spring, summer, fall, winter, april, march , june , july ";
		
		String[] strArr = changeStrArr(inputStr);
		
		String[] newStrArr = insertSort(strArr);

		System.out.println(Arrays.toString(newStrArr));
		
		
	} // main
	
	
	// ===============================================================
	//   char[] XX , String으로 
	// 	 1. 입력받은 값을 String 입력받기
	//	 2. 1번의 String을 배열에 담기
	//   3. 배열의 두 개의 값을 비교하여 자리바꾸기 (큰값이 뒤로) ========> 값비교를 어떻게 할 것이냐 ! compareTo
	//================================================================
	
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
			
			System.out.println(str);
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return str;
		
	} // InputStr
	
	
	/*
	 *  2. String ---> String[] 변경기   + null 검증
	 */
	public static String[] changeStrArr(String inputStr) {
		
		String message = "문자열이 비어있습니다.";
		
		String[] strArr = null;
		
		if(inputStr == null || isBlank(inputStr)==true) {
			
			System.out.println( message + ">>>" + "[" + inputStr + "]" );
			
		} else {
		
			strArr = inputStr.split(",");
			
			return strArr;
		}
		
		return strArr;
		
	} // InputStr
	
	/*
	 *  2-1.입력된 String 공백 또는 띄어쓰기만 존재하면 메세지 출력
	 */
	public static boolean isBlank (String inputStr) {
		
		// 띄어쓰기 제거하기
		String nonWhitespace = inputStr.replace(" ", "");
		
		// 문자열이 공백, 띄어쓰만 존재하는 지
		boolean isBlank = false;
		
		// 띄어쓰기를 제외한 문장이 비어있다면 true 리턴 
		if(nonWhitespace.isEmpty() == true) {
			
			isBlank = true;
			
		} // if
		
		return isBlank;
		
	} // isBlank
		
	
	/*
	 * 3-1. 삽입 정렬
	 */
	public static String[] insertSort(String[] StrArr) {

		// 현재기준값
		String nowValue;

		// 기준값 이전 index
		int preIndex;

		if (StrArr != null) {

			for (int i = 1; i < StrArr.length; i++) {

				nowValue = StrArr[i]; // 기준
				preIndex = i - 1; // 비교대상

				while (preIndex >= 0 && compareToCharOfStr(StrArr[preIndex], nowValue) > 0) {

					// 이전 인덱스 값을 현재 인덱스에 넣기
					StrArr[preIndex + 1] = StrArr[preIndex]; // 비교대상이 큰 경우 오른쪽으로 밀어냄

					// 다음 대상 원소를 탐색한다.
					preIndex--;

				} // while

				// while 탈출 시점에 선택된 변수 값 저장.
				StrArr[preIndex + 1] = nowValue;
			}
		}
		return StrArr;

	} // insertSort

	/*
	 * 3-2. 정렬안에서 비교를 해야함
	 */

	public static boolean compareToStr(String standardStr, String target) {
		
		if (standardStr == null || target == null) {

			System.out.println("입력값이 잘못되었습니다. str1:" + standardStr + ", target:" + target);

			return false;
		}
		
		//======== 검증 끝 =========
		
		if (standardStr.compareTo(target) > 0) {
			System.out.printf("%s 보다 %S가 작다\n", standardStr, target);

			return  true;

		} else {
			System.out.printf("%s 보다 %S가 같거나 크다\n", standardStr, target);

			return false;
		} // if-else

	} // compareToStr
	
	
	/*
	 * 3-2. 정렬안에서 비교를 해야함
	 */

	public static int compareToCharOfStr(String standardStr, String target) {

		char[] standardChr = standardStr.toCharArray();
		char[] targetChr = target.toCharArray();

		int commonLength = Math.min(standardStr.length(), target.length());

		int result = 0;

		if (standardStr == null || target == null) {

			System.out.println("입력값이 잘못되었습니다. str1:" + standardStr + ", target:" + target);

			throw new NullPointerException();
		}
		
		// ======== 검증 끝 =========
		
		// 1. 만약 같은 문자열인 경우 0 리턴
		if (standardStr.equals(target)) {

			return result = 0;

		} else {

			// 2. 문자 길이만큼 반복 --> 만약 비교문자가 더 짧으면 XX
			// 따라서 둘 중 더 짧은 길이만큼 반복
			for (int i = 0; i < commonLength; i++) {

				// 둘의 값이 같지않을 때 ! (같은 때는 생략, 따로 할일 XX)
				if (standardChr[i] != targetChr[i]) {

					// 2. 기준 값이 비교대상 보다 작은경우(먼저) 음수 리턴
					if (targetChr[i] < standardChr[i]) {

						result = +1;

						break;

						// 3. 기준 값이 비교대상 보다 큰경우(나중) 양수 리턴
					} else if (standardChr[i] < targetChr[i]) {

						result = -1;

						break;

					} // if-else if

				} // if
			} // for

		} // if - else

		return result;
	} // compareToStr

} // end class

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
 */

public class SplitEx2 {

	public static void main(String[] agrs) {

//		String inputStr = inputStr();
//		String splitPointStr = inputStr();

		String inputStr = "나비야/나비야/이리/날아오너라";
		String splitPointStr = "/";

		String[] result = splitStr(inputStr, splitPointStr);
		
		System.out.println(Arrays.toString(result));

		
		
	} // main
	
	
	/*
	 * 1. 문자열 입력(String)
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
	 *  2. 구분자 문자열의 인덱스 개수 구하기
	 */
	
	public static int findIndexCnt(String inputStr, String splitStr) {

		// 구분자의 인덱스 개수
		int indexCnt = 0;

		// 각 문자열의 길이
		int inputStrLength = inputStr.length();
		int splitStrLength = splitStr.length();
		
		String subString = "";

		// 포함되지 않았을 때 표시할 메세지
		String message = "찾을 수 없습니다.";

		// 기본문자열에 구분자가 없을 때 메세지 반환
		if (inputStr.contains(splitStr) == false) {

			System.out.println(message);

			// ======= 검증 끝

		} 

			// 기본 문자열의 길이만큼 탐색하여 구분자 인덱스 찾기
			for (int i = 0; i < inputStrLength; i++) {

				// 현재 자리에서 구분자의 길이를 더했을 때, 기본문자열보다 같거나 짧아야한다.
				// 발견한다면 나머지 문자열을 subString에 담아준다.
				if (i + splitStrLength <= inputStrLength) {

					subString = inputStr.substring(i, i + splitStrLength);
//					System.out.println("subString : " + subString);
				} // if #1

				// 나머지 길이에 구분자가 포함되어 있을 때 개수세기
				if (splitStr.contains(subString)) {

					indexCnt++;
//					System.out.println(">>indexCnt : " + indexCnt);

				} // if #2

			} // for

			System.out.println("**** 총 구분자 개수는 : " + indexCnt);
		
		

		return indexCnt;

	} // findIndex
	
	
	
	/*
	 *  3. 문자열 분리 하여 배열에 담아주기 (Split ***)
	 */
	public static String[] splitStr (String inputStr, String splitStr) {
		
		// 구분자의 인덱스 개수 구하여 변수 저장
		int indexCnt = findIndexCnt(inputStr, splitStr);
		
		// String배열에 저장할 문자열 임시 변수
		String hadStr;
		
		// 나머지 문자열을 저장할 변수
		String tailString = inputStr;
		
		// splitStr이 있는 인덱스
		int indexNum = 0;

		// Size = 구분자 개수 +1 의 배열 생성
		// Why? 구분자 개수보다
		String[] splitStrArr = new String[indexCnt + 1];
		
		for(int i = 0; i < indexCnt; i++) {
			
			// 1. 구분자 문자열의 인덱스를 구함
			indexNum = tailString.indexOf(splitStr);
			
			// 2. 문자열에서 인덱스까지 잘라서 변수저장 (문자열 첫번째~찾은 문자열인덱스 전까지)
			hadStr = tailString.substring(0, indexNum);
			
			// 3. 문자열에서 인덱스까지 잘라서 변수저장 (찾은 문자열인덱스 ~ 문자열 끝까지)
			tailString = tailString.substring(indexNum+1);
	

//			System.out.println(indexNum);
//			System.out.println(hadStr);
//			System.out.println(tailString);
			
			// 4. 규격에 맞게 자른 String을 배열에 넣음
			splitStrArr[i] = hadStr;

		} // for
		
		// 5. 남은 String을 문자열배열 마지막 인덱스에 넣어준다.
		splitStrArr[indexCnt] = tailString;

		// 배열 리턴
		return splitStrArr;

	} // splitStr
	
	
} // class

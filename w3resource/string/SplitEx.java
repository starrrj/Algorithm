package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
 */

public class SplitEx {

	public static void main(String[] agrs) {

		String inputStr = inputStr();
		String splitPointStr = inputStr();
		
	
		String result = splitStr(inputStr, splitPointStr);
//		String result = SplitStrInList(inputStr, splitPointStr);
		
		System.out.println(result);
		
		
	} // main
	
	/*
	 * B. List로 변경 후 remove 값을 넣어서... 지워도 되잖아  ----> ?? 안되는구나..... 완벽한 단어로만 지울수있음
	 * 그대로 넣는 게 안된다면 char[]로 변경해서 list에 넣는다면? ---> 넣지 못한다 방법이 따로 없을까
	 * String을 쪼개서 list 에 넣게 된다면?!
	 */
	public static String SplitStrInList (String str1, String str2) {
		
//		// String -> CharArray 로 변환
//		char[] chr1 = str1.toCharArray();
//		char[] chr2 = str2.toCharArray();
		
		String result = "";
		
		// 베이스가 되는 str1 문자열을 list로 변경하여 제거
		List<String> list = new ArrayList<>(Arrays.asList(str1));
		
		list.remove(str2);
		
		System.out.println(list);
		
		for(String str: list ) {
			
			result += str+"";
		}
		
		return result;
		
	} // SplitStrInList
	
	
	
	/*
	 * 4. List의 remove 이용하기
	 */
	public static String splitStr(String str1, String str2) {
		
		// 리턴할 String 결과물
		String result ="";
		
		// 베이스가 되는 str1 문자열을 list로 변경하여 제거
		List<String> list = new ArrayList<>();
		
		// 1. String 쪼개서 list에 넣기
		for(int i =0; i < str1.length(); i++) {
			
			list.add(i, str1.substring(i,i+1));			// substring을 안쓰고 가능한 방법 찾아보기
		
		} // for
		
		// 2. list 에서 입력값 지우기
		for (int i = 0; i < str1.length(); i++) {

			list.remove(str2);

		} // for
		
		// 3. 제거된 값 깔끔하게 정리...!
		for(String str : list) {
			
			result += str;
		}

//		System.out.println(result);		// test
		
		return result;
		
	} //splitStr
	

	
	/*
	 * 3. String --> int[] 로 값 변경
	 */
	public static int[] changeIntArr(String str) {
		
		// 인덱스 String의 길이만큼 배열 생성
		int[] intOfindexNum = new int[str.length()];
		
		
		for(int i = 0; i < str.length(); i++) {

			// 인덱스 0의 값부터 변수에 넣어줌
			intOfindexNum[i] = str.indexOf(i);
			
		} // for		
		
		return intOfindexNum;
		
	} // changeOfIntArr
	
	

	/*
	 * 2. 기준문자 인덱스 번호 찾아서 반환
	 */
	public static String findIndexNum(String str1, String str2) {

		// String -> CharArray 로 변환
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		String firstIndex = "";

		// chr2의 길이
		int chr2Leng = chr2.length;

		// 일치하는 문자와 chr2의 개수가 일치하는 지 확인
		int count = 0;

		// 먼저 입력한 문장 탐색
		for (int i = 0; i < chr1.length; i++) {

			// 1. 만약 chr1 배열에서 chr2[0]과 같은 값을 발견한다면!
			if (chr1[i] == chr2[0]) {

				// 찾을 문자열 탐색
				for (int j = 0; j < chr2.length; j++) {

					// 2-1. chr2[0]을 발견한 인덱스부터 chr2배열 마지막까지 같은지?
					if (i + j < chr1.length && chr1[i + j] == chr2[j]) {

						count++;

						if (chr2Leng == count) {

							firstIndex += i;

						} // if

					} // if

				} // for

			} // if

		} // for

		return firstIndex;

	} // findIndexNum

	
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

} // class

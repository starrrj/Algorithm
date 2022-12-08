package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;


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
 *	문자와 숫자를 입력했을 때, 숫자만 나오게 하기!
 *  그 후에 숫자들 다 더하기!
 * 
 */


public class IsDigitEx {

	public static void main(String[] args) {
		
		String input = inputStr();
		
		// 1. 숫자와 문자 구분하기
		String nums = extractNum(input);
		
		// 2. 구분하여 반환된 String -> int[] 로 반환
		int[] numsArr = changeIntArr(nums);
		
		// 3. int[] 값들을 모두 합하여 결과반환
		int sumOfNums = sumOfNums(numsArr);
		
		System.out.println(sumOfNums);
		
		

	} // main
	
	/*
	 * 4. int[]의 값들 꺼내서 모두 더하기
	 */
	public static int sumOfNums(int[] nums) {
		
		int sumResult = 0;
		
		for(int i = 0; i< nums.length; i++) {
		
			sumResult += nums[i];			
			
//			System.out.println("sumOfNums : " + sumResult);
			
		} // for
		
		return sumResult;
		
	} // sumOfNums
	
	
	/*
	 * 3. String --> int[] 로 값 변경
	 */
	public static int[] changeIntArr(String str) {
		
		// 인덱스 String의 길이만큼 배열 생성
		int[] intOfindexNum = new int[str.length()];
		
		
		for(int i = 0; i < str.length(); i++) {

			// 인덱스 0의 값부터 변수에 넣어줌
			intOfindexNum[i] = Character.getNumericValue(str.charAt(i));

//			System.out.println("intOfindexNum : " + intOfindexNum[i]);
			
		} // for		
		
		return intOfindexNum;
		
	} // changeOfIntArr
	
	
	/*
	 *  2. 숫자와 문자 구분하여 String으로 반환
	 */
	public static String extractNum(String str) {
		
		char[] changeChr = str.toCharArray();
		String nums = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			// ASCII 48 ~ 57 사이값 			----> 질문
			if(47 < changeChr[i] && 58 > changeChr[i]) {
				
				nums += changeChr[i];
				
//				System.out.println(nums);
			}
			
		} // for
		
		return nums;
		
	} // extractNum
	

	
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
			
			Objects.requireNonNull(str);
			System.out.println(str);
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return str;
		
	} // InputStr
} // end class

package methodEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

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
 *  세 개의 정수를 받아들이고 그 중 하나가 다른 두 정수 사이의 중간 지점이면 true를 반환하고 
 *  그렇지 않으면 false를 반환하는 Java 메서드를 작성하십시오. 
 *
 *	첫 번째 숫자 입력: 2
 *	두 번째 숫자 입력: 4
 *	세 번째 숫자 입력: 6
 *	세 개의 숫자에 중간점이 있는지 확인하세요!
 *
 * 	진실
 */

public class Ex199 {

	public static void main(String[] args) {

		int num1 = inputInt();
		int num2 = inputInt();
		int num3 = inputInt();
		
		
		Map<String, Integer> nums = new HashMap<>();
		nums = findValues(num1, num2, num3);
		
		boolean sameValue = findValues(nums);
		
		System.out.println(sameValue);

	} // main

	/*
	 * 1. 숫자 입력 (int)
	 */
	public static int inputInt() {

		int num = 0;

		String messageIOException = "입출력 오류입니다.";
		String messageNumberFormat = "숫자를 입력해 주세요";

		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		try {

			num = Integer.parseInt(br.readLine());

		} catch (IOException e) {

			System.out.println(messageIOException);
			System.out.println(e.getMessage());

		} catch (NumberFormatException e) {

			System.out.println(messageNumberFormat);
			System.out.println(e.getMessage());

		} // try-catch-finally

		return num;

	} // inputInt


	
	/*
	 * 2. 세 숫자중 최대값, 사이값, 최소값 구하기
	 */
	public static Map<String, Integer> findValues(int num1, int num2, int num3) {

		int max; // 최대값
		int min; // 최소값
		int otherwiseNum; // 사이 값 = 세개의 숫자 중 최대값 최소값을 제외한 숫자

		// 1. 최대값, 최소값 구하기 --> 변수저장
		max = Math.max(num1, Math.max(num2, num3));
		min = Math.min(num1, Math.min(num2, num3));

		// 2. 나머지값 구하기 --> 변수저장
		otherwiseNum = num1 + num2 + num3 - max - min;

		// 3. 구한 값을 HashMap에 넣어주기 
		Map<String, Integer> nums = new HashMap<>();
		nums.put("max", max);
		nums.put("min", min);
		nums.put("otherwiseNum", otherwiseNum);

		return nums;

	} // isBtweenRanges

	
	/*
	 * 3. 최대값과 최소값의 평균(= 중앙값) 구하기
	 */
	public static double findmiddleValue (Map<String, Integer> nums) {
		
		int max;
		int min;
		double middlePoint;

		// HashMap의 key를 불러와 값을 각 변수에 넣어준다
		max = nums.get("max");
		min = nums.get("min");
		
		// 최대값과 최소값은 평균(=중앙값) 구하기 --> 변수저장
		middlePoint = (max + min) / 2.0;
		
		return middlePoint;
		
	} // isBtweenRanges
	
	
	/*
	 * 4. 사이값과 중앙값이 같은지 판별
	 */
	public static boolean findValues (Map<String, Integer> nums) {
		
		int otherwiseNum;
		double middlePoint = findmiddleValue(nums);
		
		boolean sameValue = false;
		
		// HashMap의 key를 불러와 값을 변수에 넣어준다
		otherwiseNum = nums.get("otherwiseNum");
		
		// 세 숫자 중 나머지 하나(사이값)과 중앙값(=평균)이 동일한지 비교
		if( otherwiseNum  == middlePoint ) {
			
			sameValue = true;
			
		} // if
		
		return sameValue;
		
	} // isBtweenRanges

} // end class



//	/*
//	 */
//	public static int findOtherValue(int num1, int num2, int num3) {
//
//		int max; // 최대값
//		int min; // 최소값
//		double middlePoint; // 최대값과 최소값의 중앙값
//		int otherwiseNum; // 나머지 값 = 세개의 숫자 중 최대값 최소값을 제외한 숫자
//
//		boolean isBtweenRanges; // 중앙값이면 true, 아니면 false
//
//		// 1. 최대값, 최소값 구하기 --> 변수저장
//		max = Math.max(num1, Math.max(num2, num3));
//		min = Math.min(num1, Math.min(num2, num3));
//
//		// 2. 최대값과 최소값은 평균(=중앙값) 구하기 --> 변수저장
//		middlePoint = (max + min) / 2.0;
//
//		// 3. 나머지값 구하기 --> 변수저장
//		otherwiseNum = num1 + num2 + num3 - max - min;
//
//		// 4. 판별한 값을 변수에 저장
//		isBtweenRanges = (otherwiseNum == middlePoint);
//
//		return isBtweenRanges;
//
//	} // isBtweenRanges
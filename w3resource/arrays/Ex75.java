package array;

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
 * 정수 배열의 정렬된 요소 사이의 가장 큰 간격을 계산하는 Java 프로그램을 작성하십시오.
 *  예:
 *  원래 배열: [23, -2, 45, 38, 12, 4, 6]
 *  해당 배열의 정렬된 요소 간 최대 간격: 15
 */

public class Ex75 {

	
	public static void main (String[] args) {
	
	
	int[] arr = { 12, 43, 54, -34, -1, 0, 8};
	
	// 최대 절대값
	int maxAbs = absoluteValue(arr);
	
	System.out.println(maxAbs);
	
	} // main
	
	
	/*
	 *	배열 정렬하여, 가장 큰 절대값 계산
	 */
	public static int absoluteValue(int[] arr) {
		
		// 배열 정렬
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));	// 정렬 test 출력

		
		// 가장 큰 절대값
		int maxAbs = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			maxAbs = Math.max(arr[i + 1] - arr[i], maxAbs);
		}
		return maxAbs;
		
	} // getAbs
	
} // end class

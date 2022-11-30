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
 * 각 숫자가 연속된 숫자 목록에 정확히 한 번 나타나도록 배열의 숫자를 재정렬할 수 있는지 여부를 결정하는 Java 프로그램을 작성하십시오. 
 * true를 반환하고 그렇지 않으면 false를 반환합니다. 
 * 
 * 예 : 원래 배열: [1, 2, 5, 0, 4, 3, 6]
 * 		해당 배열에서 연속 숫자 확인!true
 * 
 */

public class Ex76 {

	public static void main(String[] args) {

//		int[] arr = {1, 2, 5, 0, 4, 3, 6};
//		int[] arr = {9, 0, 7, 0, 4};
		int[] arr = {1, 2 ,5, 0, 3, 6, 7};
		
		
		boolean sequences = sequenceOfNums(arr);
		
		System.out.println(sequences);
		
	}// main
	
	static boolean sequenceOfNums (int[] arr) {
		
		boolean sequences = true;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			// 하나라도 다르다면 false 리턴
			if(arr[i] + 1 != arr[i + 1]) {
				
				sequences = false;
				
			} // if

		} // for
		
		return sequences;
		
	} // sequenceOfNums
	
	
} // end class

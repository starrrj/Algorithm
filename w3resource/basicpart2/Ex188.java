package basicpart2;

import java.util.Arrays;

/*
 * ==========================================================
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
 *  자릿수 배열로 표현된 주어진 양수에 1을 더하는 Java 프로그램을 작성하십시오.
 */

public class Ex188 {
	
	public static void main(String[] args) {

		int[] nums = {9, 9, 9, 9, 4};
		System.out.println( "기존 배열" + Arrays.toString(nums));

		System.out.println( "결과 배열" + Arrays.toString(plusOne(nums)));
		
		
	} // main

	
	/*
	 *  배열에 1 더하기
	 */
	static int[] plusOne(int[] arrayNums){
		
		// 배열 뒤에서 부터 값 불러오기
	    for(int i = arrayNums.length - 1; i >= 0; i-- ) {
	    	
	    	// 배열의 값이 9가 아닐때
	    	if(arrayNums[i] != 9) {
	    		
	    		arrayNums[i] += 1;
	    		
	    		// 배열의
	    		for(int j = i + 1; j < arrayNums.length; ++j ) {
	    			
	    			arrayNums[j] = 0;
	    			
	    		} // inner-for
	    		
	    		return arrayNums;
	    		
	    	} // if
	    } // outer-for
	    
	    int[] result = new int[ arrayNums.length + 1 ];
	    result[0] = 1;
	    return result;
	
	} // compareStrings
	
} // end class


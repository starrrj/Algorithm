package array;

import java.util.Arrays;
import java.util.Random;

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
 * 주어진 정수 배열을 섞는 자바 프로그램을 작성하세요.
 * 예:
 * 입력: nums = { 1, 2, 3, 4, 5, 6 }
 * 출력: 배열 섞기: [4, 2, 6, 5, 1, 3]
 */

public class Ex60 {
	
	public static void main (String[] args) {
		
		// 기존 배열
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 배열섞어주기
		randomShuffle(arr);
		
		
		System.out.println(Arrays.toString(arr));
		
	} // main

	
	/*
	*	배열 값 자리 변경하기
	*/
	public static int[] randomShuffle(int arr[]) {
		
		Random random = new Random();
		
		int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; 	 // 임의의 값을 얻어서 저장할 변수
		
		// 배열 마지막인덱스[8]부터 자리바꾸어주기. 
		// 난수로 0번째부터 바꾸어주기 때문에 두번째 인덱스[1]까지 바꾸어줌
		for (int i = arr.length-1; i > 0; i--) {

			// int형 난수를 반환하여 j에 담아줌
			j = random.nextInt(i);
			System.out.println(j);
			
			// tmp에 담아 '[i]와 [j]' 값을 교환함
			tmp		= arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			
		} // for
		
		return arr;
		
	} // randomShuffle

		
	
} // end class

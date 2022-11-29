package array;

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
 * 배열 요소의 인덱스를 찾는 Java 프로그램을 작성하십시오.
 */

public class Ex06 {
	
	public static void main(String[] args) {
			
		// 주어진 배열
		int[] exArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		
		// 인덱스 번호찾기
		int indexNum = findIndex(exArray,56);
		
		// 인덱스 번호 출력
		System.out.println(indexNum);
		
	} // main

	
	
	/*
	 * 	인덱스 번호 찾기 (배열, 값)
	 */
	static int findIndex (int arr[], int num) {
		
		// 인덱스 번호
		int matchNum = 0;
		
		// 배열 인덱스 0부터 끝까지 탐색
		for(int i = 0; i < arr.length; i ++) {
			
			// 찾는 값과 같은 인덱스 변수에 담아 리턴
			if(arr[i] == num) {
				
				return matchNum = i;
				
			} // if
			
		} // for
		
		return matchNum;
		
	} // findIndex
	
	
} // end class

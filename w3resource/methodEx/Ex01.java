package methodEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
 *  문자열의 중간 문자를 표시하는 Java 메소드를 작성하십시오.
 *  참고: a) 문자열의 길이가 홀수인 경우 두 개의 중간 문자가 있습니다.
 *  b) 문자열의 길이가 짝수이면 중간에 하나의 문자가 있습니다.
 *  테스트 데이터: 문자열 입력: 350
 *  예상 출력: 5
 *  
 *  1. 문자열 입력
 *	2. 문자 길이의 중간값 찾기
 *  3. 짝수인지 ? 판별 
 *	3. 중간의 값 출력
 *
 */

public class Ex01 {

	public static void main(String[] args) {

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

		} // try-catch

		return num;

	} // inputInt


	
	/*
	 * 2. 최소값 구하기
	 */
	public static int[] changeNumArr(int num1, int num2, int num3) {

		int max; // 최대값
		int min; // 최소값
		double middlePoint; // 최대값과 최소값의 중앙값
		int otherwiseNum; // 나머지 값 = 세개의 숫자 중 최대값 최소값을 제외한 숫자

		boolean isBtweenRanges; // 중앙값이면 true, 아니면 false

		// 1. 최대값, 최소값 구하기 --> 변수저장
		max = Math.max(num1, Math.max(num2, num3));
		min = Math.min(num1, Math.min(num2, num3));

		// 2. 최대값과 최소값은 평균(=중앙값) 구하기 --> 변수저장
		middlePoint = (max + min) / 2.0;

		// 3. 나머지값 구하기 --> 변수저장
		otherwiseNum = num1 + num2 + num3 - max - min;

		// 4. 판별한 값을 변수에 저장
		isBtweenRanges = (otherwiseNum == middlePoint);

		return isBtweenRanges;

	} // isBtweenRanges

	
	
	/*
	 * 삽입 정렬
	 */
	public static int[] insertSort(int[] arr) {

		// 현재 값
		int nowValue;

		// index 변수.
		int preIdex;

		for (int i = 1; i < arr.length; i++) {

			nowValue = arr[i];
			preIdex = i - 1;

			// 현재 선택된 원소가 이전 원소보다 작은 경우 + 이전 인덱스가 0과 같거나, 클 때
			while (preIdex >= 0 && arr[preIdex] > nowValue) {

				// 이전 인덱스 값을 현재 인덱스에 넣기
				arr[preIdex + 1] = arr[preIdex];

				// 다음 대상 원소를 탐색한다.
				preIdex--;

			}

			// while 탈출 시점에 선택된 변수 값 저장.
			arr[preIdex + 1] = nowValue;
		}

		return arr;

	} // insertSort

} // end class

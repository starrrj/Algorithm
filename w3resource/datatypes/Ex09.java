package datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
 *   사용자로부터 "두 개의 정수"를 받은 다음 
 *   1. 합계, 
 *   2. 차이, 
 *   3. 곱, 
 *   4. 평균, 
 *   5. 거리(정수 간의 차이), 
 *   6. 최대값(두 정수 중 더 큰 것), 
 *   7. 최소값을 출력하는 Java 프로그램을 작성하세요. (두 정수 중 작은 것). 
 */

public class Ex09 {

	public static void main(String[] args) {
		
		int firstNum;
		int secondNum;
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			System.out.println("두 개의 정수를 입력해주세요");
			firstNum = Integer.parseInt(br.readLine());
			secondNum = Integer.parseInt(br.readLine());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
		
		
		
	} // main

	/*
	 *   1. 두 개의 정수 더하기
	 */
	static void sumNumbers (int firstNum, int secondNum) {
		
		int sum = firstNum + secondNum;
		
		System.out.println("두 수의 합" + sum);
		
	} // sumNumbers		
	
	
	/*
	 *   2.  두 개의 정수 차이
	 */
	static void differenceNumbers (int firstNum, int secondNum) {
		
		int subtract = (firstNum - secondNum);
		
		// 만약 결과가 음수일 경우 양수로 변경
		if(subtract<0) {
			subtract = -(subtract);
		} // if

		System.out.println("두 수의 차" + subtract);
		
	} // subtractNumbers
	
	
	/*
	 *   3. 두 개의 정수 곱셈
	 */
	static void productNumbers (int firstNum, int secondNum) {
			
		int Product = firstNum * secondNum;

		System.out.println("두 수의 곱" + Product);
		
	} // productNumbers
	
	/*
	 *   4. 두 개의 정수 평균
	 */
	static void averageNumbers (int firstNum, int secondNum) {
			
		int average = (firstNum + secondNum) / 2;

		System.out.println("두 수의 평균" + average);
		
	} // averageNumbers
	
	/*
	 *   5. 두 개의 정수 거리(정수 간의 차이) 
	 */
	static void distanceNumbers (int firstNum, int secondNum) {
			
		int distance = Math.abs(firstNum - secondNum);

		System.out.println("두 수의 거리" + distance);
		
	} // distanceNumbers
	
	/*
	 *   6. 두 개의 정수 최대값(두 정수 중 더 큰 것)
	 */
	static void maxNumber (int firstNum, int secondNum) {
			
		int maxNum = Math.max(firstNum, secondNum);

		System.out.println("두 수 중 최대값" + maxNum);
		
	} // maxNumber
	
	/*
	 *   7. 두 개의 정수 최대값(두 정수 중 더 큰 것)
	 */
	static void minNumber (int firstNum, int secondNum) {
			
		int minNum = Math.min(firstNum, secondNum);

		System.out.println("두 수 중 최소값" + minNum);
		
	} // maxNumber
	
} // end class

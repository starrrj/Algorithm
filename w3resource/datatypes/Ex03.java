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
 *   0에서 1000 사이의 정수를 읽고 정수의 모든 숫자를 더하는 Java 프로그램을 작성하십시오. 
 *   
 *   0에서 1000 사이의 정수 입력: 565
 *   예상 출력 : 565 의 모든 숫자의 합은 16입니다
 *   
 */

public class Ex03 {

	public static void main(String[] args) {
		
		int inputNumber;	// 입력받은 값
		int outputNumber;	// 출력받을 값
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			System.out.println("0과 1000사이의 숫자를 입력해주세요");
			inputNumber = Integer.parseInt(br.readLine());
			
			outputNumber = calculateNumbers(inputNumber);
			
			System.out.println(outputNumber);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
		
		
		
	} // main

	/*
	 *   각 자리수의 숫자를 더하는 메서드
	 */
	static int calculateNumbers (int number) {
		
		int firstNum;		// 백의 자리
		int secondNum;		// 십의 자리
		int thirdNum;		// 일의 자리
		int sumNumbers;		// 자리수의 합계
		
		firstNum = number/100 ;
		secondNum = (number%100)/10;
		thirdNum = number%10;
		
		sumNumbers = firstNum + secondNum + thirdNum;
		
		return sumNumbers;
		
//		
//		int num = Integer.parseInt(strNumber);
//		
//		// 0과 1000 사이의 숫자만 !
//		if(0<num && 1000>num) {
//			
//			// 입력받은 string배열 자리수마다 더해주기
//			for(int i=0; i< strNumber.length(); i++) {
//				
//				num =+ Integer.parseInt(strNumber.substring(i));
//			
//			} // for
//		} else {
//			System.out.println("0과 1000사이의 숫자만 가능합니다. ");
//		} // if-else
//		
	} // sumNumbers
		
	
} // end class

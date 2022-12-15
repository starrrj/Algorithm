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
 *  주어진 정수의 모든 숫자가 짝수인지 확인하는 Java 메소드를 작성하십시오. 
 *  모든 숫자가 홀수이면 true를 반환하고 그렇지 않으면 false를 반환합니다.
 *  
 *  1. 숫자 입력
 *  2. 숫자가 홀수인지 짝수인지 'num % 2 == 0' 짝수 
 *  3. 각 자리의 숫자로 보려면, int를 입력받아서 int[]로 각 숫자를 넣어주어야한다
 *  	-> 그렇다면 int를 String으로 변환 후 그 자리를 int []로 넣어야할까? 
 */

public class Ex22 {

	public static void main(String[] args) {
		
		int inputNums = inputInt();
		
		boolean isEvenOfAll = isEvenOfAll(inputNums);
		
		System.out.println("입력된 모든 정수가 짝수인가? : "+ isEvenOfAll);
		
		
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
	 * 2. 정수가 짝수인지 판별
	 */
	public static boolean isEven(int num) { 
		
		boolean isEven = false;
		
		// 조건 충족하는 짝수인 경우 true 반환
		if ( num > 1 && num % 2 == 0 ) {
			
			isEven = true;
			
		} // if
		
		
		return isEven;
		
	} // isEven
	
	
	
	/*
	 * 3. 모든 정수가 짝수인지 확인
	 */
	public static boolean isEvenOfAll(int nums) {

		boolean isEvenOfAll = true;
		
		// int -> String
		String numStr = Integer.toString(nums);
		
		// 짝수 판단시 사용할 임시변수 
		int tmpNum;

		// numStr의 길이
		int numLength = numStr.length();

		// 모든 정수를 탐색하여 판단. 단, 홀수발견시 바로 break!!!
		for(int i = 0; i < numLength; i++) {
			
			tmpNum = Integer.parseInt(numStr.substring(i, i+1));

			if(isEven(tmpNum) == false) {
				
				isEvenOfAll = false;
				
				break;
			}
			
		} // for

		return isEvenOfAll;
		
	} // changeIntArr
	
	
	
} // end class

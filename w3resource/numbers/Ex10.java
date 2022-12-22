package numbers;

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
 *  주어진 숫자가 행복한 숫자인지 불행한 숫자인지 확인하는 Java 프로그램을 작성하십시오.
 *  행복한 숫자 : 임의의 양의 정수로 시작하여 해당 숫자의 제곱의 합으로 숫자를 바꾸고 
 *  			  숫자가 1이 될 때까지 프로세스를 반복하거나 1을 포함하지 않는 주기에서 무한 반복합니다. (--> 무한반복하면..)
 *  불행한 숫자 : 행복하지 않은 숫자입니다.
 *  처음 몇 개의 불행한 숫자는 2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 18, 20입니다.
 *  
 *  예상 출력
 *  숫자 입력: 5
 *  불행한 숫자
 *  
 */

public class Ex10 {

	public static void main(String[] args) {

		int happyNum = inputInt();
		

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
	 * 2. 행복한 숫자인 지? 
	 */

	public static int isHappyNum (int number) {
		return number;
		
	} // isHappyNum
	
	
	/*
	 * 2. 
	 */


} // end class

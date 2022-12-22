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
 *  특정 범위에서 임의의 정수를 생성하는 Java 프로그램을 작성하십시오.
 *  
 */

public class Ex03 {

	public static void main(String[] args) {

		int startNum = inputInt();
		int endNum = inputInt();
		
		int randomNum = createRandomNum(startNum, endNum);
		
		System.out.println(randomNum);
		

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
	 * 2. 범위값을 가지고 랜덤숫자 만들기
	 */

	public static int createRandomNum (int startNum, int ednNum) {
		
		// 범위안랜덤숫자 = 시작숫자 + (0이상 1.0미만 랜덤 double생성 * 입력숫자들의 차이 +1) 
		int randomNum = startNum + (int)(Math.random() * ((ednNum - startNum) + 1));
		
		return randomNum;
		
	} // createNum

} // end class

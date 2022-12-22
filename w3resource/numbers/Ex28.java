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
 *  숫자가 암스트롱 숫자인지 확인하는 프로그램을 Java로 작성하십시오.
 *  암스트롱(Michael F. Armstrong) 숫자는 숫자 세제곱의 합과 같은 숫자입니다. 
 *  예를 들어 0, 1, 153, 370, 371 및 407은 암스트롱 숫자
 *  예상 출력 입니다.
 *  
 *  정수를 입력하세요: 153 
 *  (1*1*1)+(5*5*5)+(3*3*3) = 153
 *  암스트롱 수인가요? 진실
 *  
 */

public class Ex28 {

	public static void main(String[] args) {

		int amstrongNum = inputInt();
		
		boolean ArmstrongNumOk = isArmstrong(amstrongNum);
		
		System.out.println(ArmstrongNumOk);

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
	 * 2. 각 숫자들의 세제곱 구하기
	 */

	public static int findSumOfCubes(int number) {

		int result = 0;
		
		// 1. 각 자리 세제곱을 구한다
		while (number != 0) {
			
			// 1-1 ) 1의 자리 도출
			int x = number % 10;
			
			// 1-2 ) 세제곱 한 뒤 result에 저장 
			//       ---> 이후 저장된 값과 다른자리의 세제곱을 더해줌
			result = result + x * x * x;
			
			// 1-3 ) 10을 나누어 자리수 하나씩 제거 
			//       --> 1-1로 올라가 다음 자리수 구하기
			number = number / 10;
			
		} // while
		
		return result;
		
	} // findSumOfCubes
	
	
	
	/*
	 * 2. 암스트롱 숫자 맞는 지 판별 !
	 */

	public static boolean isArmstrong(int inputNumber) {

		// 결과 변수에 세제곱의 합 메서드를 넣어준다.
		int result = findSumOfCubes(inputNumber);
		boolean armstrongNumOK = false;
		
		// 입력된 값과 세제곱 비교하여 값 판별
		if (inputNumber == result) {
			
			return armstrongNumOK = true;
			
		} // if
		
		return armstrongNumOK;
		
	} // isArmstrong

} // end class

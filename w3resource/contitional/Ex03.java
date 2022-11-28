package contitional;

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
 *  사용자로부터 숫자를 받아 양수인지 음수인지 출력하는 
 *  Java 프로그램을 작성하십시오.
 */

public class Ex03 {

	
	public static void main(String[] args) {	
		
		// 입력받은 숫자 변수에 저장
		int num1 = inputNum();
		int num2 = inputNum();
		int num3 = inputNum();
		
		// 숫자를 구별하는 메서드의 결과값을 변수에 저장
		int result = isMaxNum2(num1, num2, num3);
		
		// 결과 출력
		System.out.println(result);
		
	} // main
	
	
	
	/*
	 *  양수, 음수, 0 을 구별 
	 *  (1) Math.max() 이용
	 */
	public static int isMaxNum2(int num1, int num2, int num3) {

		int max = Math.max(Math.max(num1,num2),num3);
		
		return max;
		
	} // isMaxNum2
	
	
	/*
	 *  (2) 조건문 이용 (삼항연산자)
	 */
	public static int isMaxNum1(int num1, int num2, int num3) {

		int max = (num1 >= num2) ? num1 : num2;
		
		max = (max >= num3) ? max : num3;
		
		return max;
		
	} // isMaxNum1
	

	
	
	/*
	 *  숫자 입력
	 */
	public static int inputNum() {
		
		int num = 0;
		String numberFormatMessage = "숫자형식 오류입니다.";
		String IOException = "입출력 오류입니다.";
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			// 입력받은 String ---> Integer 변환
			num = Integer.parseInt(br.readLine());
			
		} catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
			System.out.println(numberFormatMessage);
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return num;
		
	} // InputNum
	
} // class

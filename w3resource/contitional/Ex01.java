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
public class Ex01 {

	
	public static void main(String[] args) {	
		
		// 입력받은 숫자 변수에 저장
		int num = inputNum();
		
		// 숫자를 구별하는 메서드의 결과값을 변수에 저장
		String result = isSeparateNumber(num);
		
		// 결과 출력
		System.out.println(result);
		
	} // main
	
	
	/*
	 *  양수, 음수, 0 을 구별
	 */
	public static String isSeparateNumber(int num) {
		
		String positive = "양수입니다";
		String negative = "음수입니다";
		String zero = "0 입니다";
		String result;
		
		if(num > 0) {
		
			result = positive;
		
		} else if (num < 0) {
			
			result = negative;
			
		} else {
			
			result = zero;
			
		} // if-else if
		
		return result;
		
	} // isSeparateNumber
	
	
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

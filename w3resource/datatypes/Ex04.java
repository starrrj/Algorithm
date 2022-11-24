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
 *   분을 연도와 일 수로 변환하는 Java 프로그램을 작성하십시오.
 *   
 *   일 = 60 *24
 *   연도 = 60 * 24 * 365
 */

public class Ex04 {

	public static void main(String[] args) {
		
		int min;	
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			System.out.println("0과 1000사이의 숫자를 입력해주세요");
			min = Integer.parseInt(br.readLine());
			
			changeDaysAndYears(min);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
		
		
		
	} // main

	/*
	 *   분을 연도와 일자로 계산하여 출력
	 */
	static void changeDaysAndYears (int min) {
		
		int days = (min / (60 * 24)) % 365;
		int InYears = min / (60 * 24 * 365);
		
		System.out.println(InYears +"년 " + days + "일입니다.");
		
	} // changeDay
		
	
} // end class

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
 *   인치 단위의 숫자를 읽고 미터로 변환하는 Java 프로그램을 작성하십시오. 
 *   인치 값 입력: 1000
 *   예상 출력 : 1000.0인치는 25.4미터입니다
 *   
 */

public class Ex02 {

	public static void main(String[] args) {
		
		double length;
		double meter;
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			length = Double.parseDouble(br.readLine());
			
			meter = changedMeter(length);
			System.out.println(meter);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  // try-catch
		
		
	} // main

	/*
	 *	인치 -> 미터로 변경하는 메서드 
	 */
	static double changedMeter (double length) {

		double meter;
		
		// 미터 = (인치 * 2.54) / 100
		meter =  (length * 2.54) / 100;
		
		return meter;	
	} // changedMeter
	
} // end class

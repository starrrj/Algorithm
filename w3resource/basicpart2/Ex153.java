package basicpart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ==========================================================
 * 1. 변수선언, 초기화 명시 (의미, 사용하는 곳 주석)
 * 2. Main은 결과값만 ! 로직구현 XX
 * 3. 메소드를 따로두어 로직구현 OOO
 * 4. 변수, 메소드 명명 규칙 지키기
 * 5. try-catch 문 사용하여 예외처리. 던지지말기!
 * 6. 방법론 안에서 변수선언 XX, 한번쓰고 버리는 변수는 가능
 * 7. 검증 필수!
 * 8. 선언 -> 초기화 -> 검증 -> 수행 -> 조립 -> 리턴
 * ===========================================================
 *  
 * 두 개의 double 변수를 허용하는 Java 프로그램을 작성하고 
 * 둘 다 엄격하게 0과 1 사이이면 true를 출력, 그렇지 않으면 false를 출력
 * 
 */

public class Ex153 {

	public static void main(String[] args) {
		
		// 변수 선언
		double num1 = 0;
		double num2 = 0;
		
		boolean result = false;
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("숫자를 2개 입력해주세요.");
		
		try {
			
			num1 = Double.parseDouble(br.readLine());
			num2 = Double.parseDouble(br.readLine());
			
			result = checkNumbers(num1, num2);
			System.out.println(result);
			
			
		} catch (NumberFormatException | IOException e) {
			
			System.out.println("0과 1사이의 '숫자'만 입력가능합니다.");
//			e.printStackTrace();
			
		} finally {
			System.out.println("시스템 종료.");
		} // try-catch-finally

	} // main

	
	/* 입력된 숫자가 모두 동일한 지 비교  */
	static boolean checkNumbers(double num1, double num2) {
		
		if(0< num1 && num1 <1 &&  0<num2 && num2<1) {
			
			return true;
			
		} else {

			return false;
			
		} // if-else
		
	}  // compareWithNumbers
	
} // end class

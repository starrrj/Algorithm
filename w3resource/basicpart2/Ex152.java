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
 * 사용자로부터 4개의 정수를 받고 4개가 모두 같으면 같음을 출력하고 
 * 그렇지 않으면 같지 않음을 출력하는 Java 프로그램을 작성하십시오. 
 * 
 */

public class Ex152 {

	public static void main(String[] args) {
		
		// 변수 선언
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("숫자를 4개 입력해주세요.");
		
		try {
			
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
			num3 = Integer.parseInt(br.readLine());
			num4 = Integer.parseInt(br.readLine());

			compareWithNumbers(num1,num2,num3,num4);
			
		} catch (NumberFormatException | IOException e) {
			
			System.out.println("숫자만 입력가능합니다.");
//			e.printStackTrace();
			
		} finally {
			System.out.println("시스템 종료.");
		} // try-catch-finally

	} // main

	
	/* 입력된 숫자가 모두 동일한 지 비교  */
	static boolean compareWithNumbers(int num1, int num2, int num3, int num4) {
		
		if( num1==num2 && num2==num3 && num3==num4 ) {
			
			System.out.println("모든 숫자가 같습니다.");
			return true;
			
		} else {

			System.out.println("숫자가 같지 않습니다.");
			return false;
			
		} // if-else
		
	}  // compareWithNumbers
	
} // end class

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
 *  부동 소수점 숫자를 읽고 숫자가 0이면 "0"을 인쇄하는 Java 프로그램을 작성하십시오. 
 *  그렇지 않으면 "양수" 또는 "음수"를 인쇄하십시오. 
 *  숫자의 절대값이 1보다 작으면 "small"을, 1,000,000을 초과하면 "large"를 추가합니다. 
 */

public class Ex04 {

	
	public static void main(String[] args) {	
		
		// 입력받은 숫자 변수에 저장
		double num = inputDouble();
		
		// 숫자를 구별하는 메서드의 결과값을 변수에 저장
		String result = isSeparateNumber(num);
		String result2 = isAbsoluteNumber(num);
		
		// 결과 출력
		System.out.printf("%s%n%s", result, result2);
		
	} // main
	
	
	
	/*
	 *  양수, 음수, 0 을 구별
	 */
	public static String isSeparateNumber(double num) {
		
		String positive = "양수입니다";
		String negative = "음수입니다";
		String zero = "0";
		String result; 
		
		num = Math.abs(num);
		
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
	 *  절대값을 구하기
	 */
	public static String isAbsoluteNumber(double num) {
		
		String small = "small";
		String between = "1과 1000000의 사이값입니다.";
		String large = "large";
		String absNum = null;
		
		if(num < 1) {
		
			absNum = small;
		
		} else if (num > 1000000) {
			
			absNum = large;
			
		} else {
			
			absNum = between;
			
		}// if-else if
		
		return absNum;
		
	} // isAbsoluteNumber
	
	
	/*
	 *  숫자 입력 (Double)
	 */
	public static double inputDouble() {
		
		double num = 0;
		String numberFormatMessage = "숫자형식 오류입니다.";
		String IOException = "입출력 오류입니다.";
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			// 입력받은 String ---> Double 변환
			num = Double.parseDouble(br.readLine());
			
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

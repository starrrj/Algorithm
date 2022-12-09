package string;

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
 * 두 번째 문자열의 문자가 첫 번째 문자열에 있는지 확인하는 Java 프로그램을 작성하십시오. 
 * 문자가 있다면 true를 반환하고 그렇지 않으면 false를 반환합니다.
 * 
 */


public class Ex112 {

	public static void main(String[] args) {
		
		String str1 = inputStr();
		String str2 = inputStr();
		
		String result = isContainString(str1, str2);
		
		System.out.println(result);
		
	} // main
	
	
	
	/*
	 *  문자열 포함 여부 확인 ( contains )
	 */
	public static String isContainString (String str1, String str2) {
		
		String trueStr = "문자열이 포함됩니다.";
		String falseStr = "문자열이 포함되지 않습니다.";
		String resultStr = "";
		
		boolean containStr = str1.contains(str2);
		
		if(containStr == true) {
			
			resultStr = trueStr;
			
		} else {
			
			resultStr = falseStr;
			
		} // if-else
		
		return resultStr;
		
	} // isContainString
	
	
	
	
	/*
	 *  문자열 입력(String)
	 */
	public static String inputStr() {
		
		String str = "";
		
		String IOException = "입출력 오류입니다.";
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			str = br.readLine();
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return str;
		
	} // InputStr
	

} // end class

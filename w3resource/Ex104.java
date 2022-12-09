package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

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
 * 주어진 문자열 길이에 따라 오름차순 및 내림차순으로 
 * 정렬하는 Java 프로그램을 작성하십시오. 
 * 
 */


public class Ex104 {

	public static void main(String[] args) {
		
		String str = inputStr();
		
		String[] ascendStrArr = ascendStrArr(str);
		System.out.println(Arrays.toString(ascendStrArr));

		String[] descendStrArr = descendStrArr(str);
		System.out.println(Arrays.toString(descendStrArr));

		
	} // main
	
	
	/*
	 *  문자열 배열에 넣어 오름차순 정렬
	 */
	public static String[] ascendStrArr(String str) {
	
		String[] strArr = str.split(" ");
		
		Arrays.sort(strArr);
		
		return strArr;
		
	} // changeStrArr
	
	
	/*
	 *  문자열 배열에 넣어 내림차순 정렬
	 */
	public static String[] descendStrArr(String str) {
		
		String[] strArr = str.split(" ");
		
		Arrays.sort(strArr, Collections.reverseOrder());
		
		return strArr;
		
	} // changeStrArr
	
	
	
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

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
 * 주어진 문자열에서 지정된 문자 바로 앞과 뒤의 문자가 
 * 동일한지 확인하는 Java 프로그램을 작성하십시오. 
 * 
 * 주어진 문자열은: moon#night
 * 앞뒤 문자가 동일함: true
 * 
 * 주어진 문자열은 다음과 같습니다. bat##ball
 * 전후 문자가 동일함: false
 * 
 * 주어진 문자열은 #moon#night입니다.
 * 앞뒤 문자가 동일함: true
 * 
 */


public class Ex080 {

	public static void main(String[] args) {
		
		String str = inputStr();
		
		boolean isEqualsStr = isEqualStr(str);
		
		System.out.println(isEqualsStr);

		
	} // main
	
	
	
	/*
	 *  문자열 # 기준으로 나누어 비교하기 
	 */
	public static boolean isEqualStr(String str) {
		
		// # 기준으로 문자열 나누어 String배열에 담기
		String[] spliteStr = str.split("#");
		
		// 문자열이 모두 같은 지?
		boolean euqalsStr = false;
		
		
		// 배열 인덱스 0부터 길이-1 까지 탐색 -> "- 1" 넣는 이유 for문 안에서 "길이+1" 을 비교하기 때문에
		loop : 
		for(int i = 0; i < spliteStr.length-1; i++) {
			
			// 현재인덱스와 다음인덱스 동일 한 지 비교
			if(spliteStr[i].equals(spliteStr[i+1])) {
				
				euqalsStr = true;
				
			// 만약 같지않다면 false 담고, 바로 탈출
			} else {
				
				euqalsStr = false;
				
				break loop;
				
			} // if-else
			
		} // for
		
		return euqalsStr;
		
		
	} // isEqualStr
	
	
	
	
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

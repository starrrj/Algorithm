package dateTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * 두 날짜의 차이를 일 단위로 계산하는 Java 프로그램을 작성하십시오.
 * 
 * 1. 날짜입력 (년도 / 월 / 일) X 2
 * 2. 차이 구하기 
 * 3. 일자로 환산
 * 
 */

public class Ex38 {

	public static void main(String[] args) {

		Date bigDate = changeDate();
		Date smallDate = changeDate();

		long days = findDiffDays(bigDate, smallDate);
		
		System.out.printf("%d일 차이납니다.", days);
		

	} // main

	/*
	 *  1. 문자열 입력(String)
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
	
	
	
	
	/*
	 *  2. 입력된 String 날짜로 형식으로 변환
	 */
	public static Date changeDate() {
		
		Date changeDateFormat = null;
		String messageParseException = "변환 실패했습니다.";
		
		try {
			
			changeDateFormat = new SimpleDateFormat("yyyy/MM/dd").parse(inputStr());
			
		} catch (ParseException e) {
			
			System.out.println(messageParseException);
			System.out.println(e.getMessage());
		}

		return changeDateFormat;

	} // changeDate
	
	
	
	
	/*
	 *  3. 일수 차이 구하기
	 */
	
	public static long findDiffDays (Date bigDate, Date smallDate) {
		
		long diffSec = (bigDate.getTime() - smallDate.getTime()) / 1000; //초 차이
		
		System.out.println(bigDate.getTime());
		
        long diffDays = diffSec / (24*60*60); //일자수 차이
        
		return diffDays;
		
	} // findDiffDays
		
} // end class

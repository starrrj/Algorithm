package dateTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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
 * 유닉스 타임스탬프를 자바 날짜로 변환하는 자바 프로그램을 작성하세요.  --> '초'로 환산하여 정수로 나타낸것
 * 
 * 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을 초로 환산하여 정수로 나타낸 것이다.
 * unixSeconds = 유닉스 계열 운영 체제나 여러 다른 운영 체제, 그리고 파일 형식들에서 사용된다.
 * 유닉스 시간에서 윤초는 무시된다.
 * 
 * 
 */

public class Ex36 {

	public static void main(String[] args) {

		long unixSeconds = inputUnixSec();
		String javaDateTime;
		
		javaDateTime = changeJavaDate(unixSeconds);
		
		System.out.println(javaDateTime);
		
	} // main

	/*
	 * 1. unix Seconds 입력 (long)
	 */
	public static long inputUnixSec() {

		long unixSeconds = 0;
		
		String messageIOException = "입출력 오류입니다.";
		String messageNumberFormat = "숫자를 입력해 주세요";

		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		try {

			unixSeconds = Long.parseLong(br.readLine());

		} catch (IOException e) {

			System.out.println(messageIOException);
			System.out.println(e.getMessage());

		} catch (NumberFormatException e) {

			System.out.println(messageNumberFormat);
			System.out.println(e.getMessage());
			
		} // try-catch

		return unixSeconds;

	} // inputLong
	
	
	
	/*
	 * 입력된 unix Seconds 를 자바 날짜로 변경
	 */
	public static String changeJavaDate(long unixSeconds) {

		String javaDate = "";
		
		Date date = new Date(unixSeconds * 1000L);

		// SimpleDateFormat으로 표시형식 변경
		SimpleDateFormat javaTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		
		// Greenwich Mean Time : 그리니치 천문대 기준시각
		javaTimeFormat.setTimeZone(TimeZone.getTimeZone("GMT-4"));
		
		javaDate = javaTimeFormat.format(date);
		

		return javaDate;

	} // changeJavaTime
	
	
	
		
		
} // end class

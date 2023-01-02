package dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
 * 매주 첫째 날과 마지막 날을 계산하는 Java 프로그램을 작성하십시오.
 * 
 */

public class Ex09 {

	public static void main(String[] args) {

		getLastDate();

	} // main

	/*
	 * 1. 해당 주의 첫째날과 마지막 날 계산 가져오기
	 */
	public static void getLastDate() {

		// Get calendar set to current date and time
		Calendar cal = Calendar.getInstance();

		// 해당하는 주 월요일로 설정
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);


		// Print dates of the current week starting on Monday
		DateFormat df = new SimpleDateFormat("yy-MM-dd (EEE) ");
		
		// 월요일 기본 출력
		System.out.println(" 이번주 첫째날 >>> " + df.format(cal.getTime()));

		// 해달 날짜에서 6일을 더해 일요일 값을 넣어줌
		cal.add(Calendar.DATE, 6);
		
		System.out.println(" 이번주 마지막 >>> " + df.format(cal.getTime()));
		
		
	} // getLastDate

} // end class

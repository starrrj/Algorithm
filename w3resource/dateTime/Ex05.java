package dateTime;

import java.util.Calendar;
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
 * 뉴욕의 현재 시간을 가져오는 Java 프로그램을 작성하십시오.
 * + 서울도 해보기!
 */

public class Ex05 {

	public static void main(String[] args) {

		getNewYorkDate();
		getSeoulDate();
		
		
	} // main
	
	
	/*
	 * 1.뉴욕의 현재 시간을 가져오기
	 */

	public static void getNewYorkDate() {

		int nyHour = 0;
		int nyMinute = 0;
		int nySecond = 0;

		// 숫자에서 문자열로 변환한 값을 담을 변수
		String nyAmPmStr = ""; 
		
		// 추상클래스 -> 직접객체생성 XX
		Calendar newYorkDate = Calendar.getInstance();
		
		newYorkDate.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		
		// GET으로 각 변수 값 가져오기
		nyHour = newYorkDate.get(Calendar.HOUR_OF_DAY);
		nyMinute =  newYorkDate.get(Calendar.MINUTE);   // '월'은 0부터 시작하기 때문에 +1 해주기
		nySecond = newYorkDate.get(Calendar.SECOND);
		
		nyAmPmStr = getAMPM(newYorkDate.get(Calendar.AM_PM));
		
		System.out.printf(" >>> 현재 뉴욕시간 : %S %d시 %d분 %d초 \n", nyAmPmStr,nyHour,nyMinute,nySecond);
		
	} // getNewYorkDate
	
	
	
	/*
	 * 2. AM/PM 구분하여 String으로 반환하기
	 */

	public static String getAMPM(int amPm) {
	
		String amPmStr = "";
		
		if(amPm == Calendar.AM) {
			
			amPmStr = "(오전)";
			
		} else {
	
			amPmStr = "(오후)";
			
		} // if-else
		
		return amPmStr;
		
	} // getAMPM
	
	
	/*
	 * 3.서울의 현재 시간을 가져오기
	 */

	public static void getSeoulDate() {

		int krHour = 0;
		int krMinute = 0;
		int nySecond = 0;

		// 숫자에서 문자열로 변환한 값을 담을 변수
		String krAmPmStr = ""; 
		
		// 추상클래스 -> 직접객체생성 XX
		Calendar newYorkDate = Calendar.getInstance();
		
		newYorkDate.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		
		
		// GET으로 각 변수 값 가져오기
		krHour = newYorkDate.get(Calendar.HOUR_OF_DAY);
		krMinute =  newYorkDate.get(Calendar.MINUTE);   // '월'은 0부터 시작하기 때문에 +1 해주기
		nySecond = newYorkDate.get(Calendar.SECOND);
		
		krAmPmStr = getAMPM(newYorkDate.get(Calendar.AM_PM));
		
		System.out.printf(" >>> 현재 서울시간 : %S %d시 %d분 %d초 \n", krAmPmStr,krHour,krMinute,nySecond);
		
	} // getSeoulDate

} // end class

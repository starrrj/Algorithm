package dateTime;

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
 * 기본 달력의 현재 날짜에서 년, 월, 주, 날짜의 최대값을 가져오는 Java 프로그램을 작성하십시오.
 * 
 */

public class Ex03 {

	public static void main(String[] args) {

		getMaxDate();
		
	} // main
	
	
	/*
	 * 1.기본 달력의 현재 날짜에서 년, 월, 주, 날짜의 최대값 가져오기
	 */

	public static Calendar getMaxDate() {

		int maxYear = 0;
		int maxMonth = 0;
		int maxWeek = 0;
		int maxDate = 0;
		
		// 추상클래스 -> 직접객체생성 XX
		Calendar cal = Calendar.getInstance();

		// GET으로 각 변수 값 가져오기
		maxYear = cal.get(Calendar.YEAR);
		maxMonth = cal.getActualMaximum(Calendar.MONTH) + 1;   // '월'은 0부터 시작하기 때문에 +1 해주기
		maxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		maxDate = cal.getActualMaximum(Calendar.DATE);
		
		System.out.printf(" >>> 현재 %d년은 %d주까지 있으며, %d월 %d일 입니다.", maxYear,maxWeek,maxMonth,maxDate);
		
		return cal;
		
	} // getToday
	
	
} // end class

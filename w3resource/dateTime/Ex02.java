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
 * 기본 달력의 정보(년, 월, 일, 시, 분)를 가져와 표시하는 Java 프로그램을 작성하십시오. 
 * 
 */

public class Ex02 {

	public static void main(String[] args) {

		// 기본 달력정보의 오늘날짜 가져오기
		getToday();
		
	} // main
	
	
	/*
	 * 1.기본 달력의 오늘 (년, 월, 일, 시, 분) 값 가져오기
	 */

	public static void getToday() {

		int year = 0;
		int month = 0;
		int date = 0;
		String amPm = "";	// 숫자 ---> 문자열로 반환하는 메서드 사용하여 바꾸어주기
		int hour = 0;
		int minute = 0;
		
		// 추상클래스 -> 직접객체생성 XX
		Calendar cal = Calendar.getInstance();

		// GET으로 각 변수 값 가져오기
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;   // '월'은 0부터 시작하기 때문에 +1 해주기
		date = cal.get(Calendar.DATE);
		amPm = getAMPM(cal.get(Calendar.AM_PM));
		hour = cal.get(Calendar.HOUR);
		minute = cal.get(Calendar.MINUTE);
		
		System.out.printf(" >>> 오늘은 %d년 %d월 %d일 %S %d시 %d분 입니다.", year,month,date,amPm,hour,minute);
		
	} // getToday
	
	
	
	
	/*
	 * 2. AM/PM 구분하여 String으로 반환하기
	 */

	public static String getAMPM(int amPm) {
	
		String amPmStr = "";
		
		if(amPm == Calendar.AM) {
			
			amPmStr = "오전";
			
		} else {
	
			amPmStr = "오후";
			
		} // if-else
		
		return amPmStr;
		
	} // getAMPM
	

} // end class

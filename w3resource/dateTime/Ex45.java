package dateTime;

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
 * 주어진 두 해 사이의 날짜 수를 세는 Java 프로그램을 작성하십시오. 
 * 
 */

public class Ex45 {

	public static void main(String[] args) {

		int startYear = inputInt();
		int endYear = inputInt();
		int days = 0;
		
		days = getBetweenDays(startYear, endYear);
		
		System.out.printf(">>>>>>> 두 해 사이의 날짜 : 총 %d일 \n", days);

	} // main

	/*
	 * 1. 숫자 입력 (int)
	 */
	public static int inputInt() {

		int num = 0;

		String messageIOException = "입출력 오류입니다.";
		String messageNumberFormat = "숫자를 입력해 주세요";

		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		try {

			num = Integer.parseInt(br.readLine());

		} catch (IOException e) {

			System.out.println(messageIOException);
			System.out.println(e.getMessage());

		} catch (NumberFormatException e) {

			System.out.println(messageNumberFormat);
			System.out.println(e.getMessage());
			
		} // try-catch

		return num;

	} // inputInt
	
	
	/*
	 *  입력된 년도가 윤년인지 아닌지 판별 (평년 = 0 , 윤년 = 1)
	 */
	public static boolean isLeapYear(int year) {
		
		boolean isLeap = false;

		// 윤년이면 변수에 1을 담아준다.
		// 공식 : 4 나 100으로 나누어 떨어지거나, 400으로 나누어 떨어지면 윤년으로 한다.
		if( (year % 4 == 0 && year % 100 != 0) || (year%400 == 0)) {
			
			isLeap = true;
			
		} // if
		
		return isLeap;

	} // isLeapYear
	
	
	/*
	 *  평년이면 365일 , 윤년이면 366일을 반환
	 */
	public static int getDaysOfYear(int year) {
		
		// default 365일
		int days = 365;
		
		// 윤년일 때 366일 !!
		if(isLeapYear(year) == true) {
			
			return days = 366;
			
		} // if
		
		return days;
		
	} // getDaysOfYear
	
	
	/*
	 *  두 년도 사이의 날짜 수 구하기
	 */
	public static int getBetweenDays(int startYear, int endYear) {

		int days = 0;
		
		String messageOutOfRange = "시작년도는 마지막년도보다 작아야합니다.";

		try {
			
			if (startYear > endYear) {

				System.out.println(messageOutOfRange);

				return -999;
				
			} // if

			// ======= 검증 끝
			
			for (int i = startYear; i <= endYear; i++) {
				
				System.out.printf("%d년 => %d일 \n", i, getDaysOfYear(i));
				
				days += getDaysOfYear(i);
			       
			} // for

		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return days;
		
		
	} // getBetweenDays
		
		
} // end class

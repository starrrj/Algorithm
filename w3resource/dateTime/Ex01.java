package dateTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
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
 * Calendar 클래스를 사용하여 Date 객체를 생성하는 Java 프로그램을 작성하십시오.
 * 
 */

public class Ex01 {

	public static void main(String[] args) {

		int year = 0;
		int month = 0;
		int date = 0;
		
		// 입력 -> 출력
		inputCalendar(year, month, date);

	} // main
	

	/*
	 * 1. 숫자 입력 입력 (int)
	 */
	public static int inputInt() {

		int num = 0;

		String IOException = "입출력 오류입니다.";

		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		try {

			num = Integer.parseInt(br.readLine());

		} catch (IOException e) {

			System.out.println(IOException);
			System.out.println(e.getMessage());

		} // try-catch

		return num;

	} // inputInt

	
	/*
	 * 2. 년, 월, 일 입력 후 값넣어주기
	 */

	public static void inputCalendar(int year, int month, int date) {

		// 년/월/일 입력
		year = inputInt();
		month = inputInt();
		date = inputInt();
		
		// Date 객체
		Date dateCal;

		// 추상클래스 -> 직접객체생성 XX
		Calendar cal = Calendar.getInstance();

		// SET으로 각 변수 값 입력
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);
		
		// 날짜 구하기
		dateCal = cal.getTime();
		
		System.out.println(dateCal);
		
	} // inputCalendar
	
} // end class

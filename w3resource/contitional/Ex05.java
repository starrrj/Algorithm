package contitional;

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
 *  사용자로부터 숫자를 유지하고 1에서 7 사이의 정수를 생성하고 
 *  요일 이름을 표시하는 Java 프로그램을 작성하십시오.
 */

public class Ex05 {

	
	public static void main(String[] args) {	
		
		// 입력값 변수에 저장
		int num = inputInt();
		
		// 입력한 숫자를 요일로 변경하여 변수 저장
		String day = getDayName(num);

		// 요일 출력
		System.out.println(day);
		
	} // main
	
	
	
	/*
	 *  숫자 입력시 요일을 표시
	 */
	public static String getDayName(int num) {
		
		String dayName = "";
		
		switch (num) {
		
		case 1:	 dayName = "월요일";	break;
		case 2:  dayName = "화요일";	break;			
		case 3:  dayName = "수요일";	break;			
		case 4:  dayName = "목요일";	break;
		case 5:  dayName = "금요일";	break;					
		case 6:  dayName = "토요일";	break;					
		case 7:  dayName = "일요일";	break;

		}
		
		return dayName;
		
	} // isSeparateNumber

	
	/*
	 *  숫자 입력(Integer)
	 */
	public static int inputInt() {
		
		int num = 0;
		
		String numberFormatMessage = "숫자형식 오류입니다.";
		String IOException = "입출력 오류입니다.";
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			// 입력받은 String ---> Integer 변환
			num = Integer.parseInt(br.readLine());
			
		} catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
			System.out.println(numberFormatMessage);
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return num;
		
	} // InputNum
	
} // class

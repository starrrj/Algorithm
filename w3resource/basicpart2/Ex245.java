package basicpart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ==========================================================
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
 *   n개월 동안의 부채 금액을 계산하는 Java 프로그램을 작성하십시오. 
 *   대출 금액은 $100,000이며 대출금은 부채의 4% 이자를 더하고 
 *   '매월' 위의 가장 가까운 1,000에서 반올림합니다.
 *   
 */

public class Ex245 {
	
	public static void main(String[] args) {

		int month; 				// 대출기간(월)
		double loan;			// 대출금  (원)
		double interestRate;	// 이자율
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {			
			
			System.out.println("대출 기간(월)을 입력해주세요 ");
			month = Integer.parseInt(br.readLine());
			
			System.out.println("대출 금액(원)을 입력해주세요 ");
			loan = Double.parseDouble(br.readLine());
			

			System.out.println("대출 이율(%)을 입력해주세요 ");
			interestRate = Double.parseDouble(br.readLine())/100;
			

			computeloan(month, loan, interestRate);

			System.out.println("3."+ computeloan(month, loan, interestRate));
			
			
		} catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		} // try-catch
		
	} // main
	
	/*
	 *  총 부채금액 계산
	 */
	
	static double computeloan (int month, double loan, double interestRate) {
		
		// 대출기간(월)에 따른 총 부채
		for(int i=0; i< month; i++ ) {
			
			loan += loan*interestRate;
//			System.out.println("1."+loan);
			
			// 천원미만 단위가 있다면 반올림
			if(loan % 1000 != 0) {
			
				loan = (Math.round(loan/1000))*1000;
//				System.out.println("2."+loan);
			
			} // if
		
		} // for
		
		return loan;
		
	}
	
} // end class
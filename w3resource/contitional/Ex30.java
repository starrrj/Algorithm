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

 *   3개의 숫자를 받아들이고 
 *   3개의 숫자가 모두 같으면 "모든 숫자는 같다"를 출력하고, 
 *   3개의 숫자가 모두 다르면 "모든 숫자는 다르다"를, 
 *   그렇지 않으면 "모두 같거나 다르지 않음"을 출력하는 자바 프로그램을 작성하십시오.
 *   
 *   테스트 데이터
 *   첫 번째 숫자 입력: 2564
 *   두 번째 숫자 입력: 3526
 *   세 번째 숫자 입력: 2456
 *   예상 출력 : 모든 숫자가 다릅니다
 *  
 */


public class Ex30 {

	
	public static void main(String[] args) {	
		
		int num1 = inputInt();
		int num2 = inputInt();
		int num3 = inputInt();
		
		CompareNumber(num1, num2, num3);
		
		
	} // main
	
	
	
	/*
	 *   숫자 비교
	 */
	public static void CompareNumber(int a, int b, int c) {

		String sameNum = "모든 숫자가 같습니다.";
		String sameOrdifferentNum = "2개의 숫자만 같습니다.";
		String differenceNum = "모든 숫자가 다릅니다";
		
		if(a == b && b == c ) {
			
			System.out.println(sameNum);
			
		} else if(a == b || b == c || c == a ) {
			
			System.out.println(sameOrdifferentNum);
			
		} else {
			
			System.out.println(differenceNum);
			
		} // if-else if
		
	}// getTriangle
	
	
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

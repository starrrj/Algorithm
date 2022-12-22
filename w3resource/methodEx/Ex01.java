package methodEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
 *  세 개의 숫자 중 가장 작은 숫자를 찾는 Java 메소드를 작성하십시오. 
 *
 * 	테스트 데이터:
 * 첫 번째 숫자 입력: 25
 * 두 번째 숫자 입력: 37
 * 세 번째 숫자 입력: 29
 * 
 * 예상 출력:
 *  가장 작은 값은 25.0입니다.
 *  
 *  음 숫자가 3개가 아닌 여러개가 입력될 때는 어떻게 처리하는 것이 좋을까?
 *  ArrayList를 이용하여, 입력할 때 마다 list에 넣어준다.
 *  	이 때, 다른 게 입력되면 list에 담아주는 걸 끝낸다...? 어떻게 마무리를 하는게 좋을까
 *  sort를 이용하여 정렬을 하고, 그 후 가장 처음에 담겨
 */

public class Ex01 {

	public static void main(String[] args) {
		


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

		} // try-catch-finally

		return num;

	} // inputInt
	
	
	/*
	 *  2. 입력한 숫자 배열에 담아주기
	 */
	public static List<Integer> splitStr (int nums) {
		
		List<String> list = new ArrayList<String>();
		
//		while ( indexNum > 0) {
//			
//			
//		}
		return null;
	
	} // 
	
} // end class

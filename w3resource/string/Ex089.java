package string;

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
 * 주어진 문자열에 나타나는 숫자의 합을 0
 * 계산하는 Java 프로그램을 작성하십시오.
 * 
 */


public class Ex089 {

	public static void main(String[] args) {
		
		String str = inputStr();
		
		int sumNums = changeSumOfNums(str);
		
		System.out.println(sumNums);
		
		
	} // main
	
	

	/*
	 *  문자열의 숫자 더하기
	 */
	public static int changeSumOfNums (String str) {

		// 숫자들의 합
		int sumNums = 0;
		
		// 10의자리 이상의 정수를 판별하여 정수로 변경시키기 위해 사용하는 임시변수
		String tmp = "";
		
		
		// 문자열을 한글자씩 자른 형태로 char 배열에 데이터 담기
		char[] chrArr = str.toCharArray();
		
//		System.out.println(Arrays.toString(chrArr));
		
		// 배열 앞부터 탐색
		for(int i = 0; i < chrArr.length; i++) {
			
			// 만약 현재 인덱스의 값이 숫자일 때
			if( Character.isDigit(chrArr[i]) == true ) {
				
				// 배열의 길이 전까지의 값 중에 현재 인덱스 +1까지 숫자 일 때
				if(i < chrArr.length-1 && Character.isDigit(chrArr[i+1])) {
					
					// 문자열 임시변수에 담기만 !
					tmp += chrArr[i];
				
				// 인덱스 다음 값이 문자일 때
				} else {
					
					// 문자열 임시변수 에 담은 후
					tmp += chrArr[i];
					
					// 문자열을 int로 변환 후 총합변수에 더하기 (***)
					sumNums += Integer.parseInt(tmp);
					
					// 임시변수 초기화
					tmp = "";
					
				} // if-else
				
			}
			
		} // for	
		
		return sumNums;
		
	} // changeSumOfNums

	
	
	
	/*
	 *  문자열 입력(String)
	 */
	public static String inputStr() {
		
		String str = "";
		
		String IOException = "입출력 오류입니다.";
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			str = br.readLine();
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return str;
		
	} // InputStr
	
	
} // end class

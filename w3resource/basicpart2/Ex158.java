package basicpart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ==========================================================
 * 1. 변수선언, 초기화 명시 (의미, 사용하는 곳 주석)
 * 2. Main은 결과값만 ! 로직구현 XX
 * 3. 메소드를 따로두어 로직구현 OOO
 * 4. 변수, 메소드 명명 규칙 지키기
 * 5. try-catch 문 사용하여 예외처리. 던지지말기!
 * 6. 방법론 안에서 변수선언 XX, 한번쓰고 버리는 변수는 가능
 * 7. 검증 필수!
 * 8. 선언 -> 초기화 -> 검증 -> 수행 -> 조립 -> 리턴
 * ===========================================================
 *  
 *  I와 j가 소수이면 A[i][j]가 거짓이고 그렇지 않으면 A[i][j]가 참이 되도록 
 *  2차원 배열(mxm) A[][]를 만드는 Java 프로그램을 작성하십시오.
 */

public class Ex158 {
	
	public static void main(String[] args) {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		
			try {
				
				String fristCharArray = br.readLine();
				String secondCharArray = br.readLine();
				
				containsStrings(fristCharArray,secondCharArray);
				System.out.println(containsStrings(fristCharArray, secondCharArray));
				
			} catch (IOException | NullPointerException e) {
				e.printStackTrace();
			} // try-catch
			
	
	} // main

	static boolean containsStrings (String fristCharArray, String secondCharArray) {
		
		if(fristCharArray == null || secondCharArray == null) {
			
			System.out.println("문자열을 입력해주세요");
			
		} // if
		
		// 
		
		for(int i=0; i< secondCharArray.length() -1; i++) {
			for(int j=0; i< fristCharArray.length() -1; j++) {
				
			}
		}
		return false;
		
		
	} // compareStrings
	
} // end class


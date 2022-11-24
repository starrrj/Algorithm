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
 *  모든 단어를 뒤집지 않고 문장의 내용을 뒤집는 Java 프로그램을 작성하십시오.
 */

public class Ex169 {
	
	public static void main(String[] args) {

		String inputSentence;	// 입력 문장
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("문장을 입력해주세요.");
		
		try {
			inputSentence = br.readLine();
			
			System.out.println(containsStrings(inputSentence));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		} catch (NullPointerException e) {
			e.printStackTrace();				  
			System.out.println(e.toString());
		} // try-catch
		
	} // main

	
	/*
	 * 입력 문장을 나누어서 String 으로 리턴
	 */
	static String containsStrings (String inputSentence) {
		
		if(inputSentence == null) {
			
			System.out.println("문자열을 입력해주세요");
			
		} // if
		
		StringBuilder stringBuilder = new StringBuilder();
	    String[] words = inputSentence.split(" ");
	    
	    for (int i = words.length - 1; i >= 0; i--) {
	      stringBuilder.append(words[i]);
	      
	      if (i != 0) {
	        stringBuilder.append(" ");
	      }
	    }
	    return stringBuilder.toString();
	
	} // compareStrings
	
} // end class


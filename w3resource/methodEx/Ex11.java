package methodEx;

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
 *  문자열이 유효한 암호인지 확인하는 Java 메서드를 작성합니다. 편집기로 이동
 *  암호 규칙:
 *  암호는 10자 이상이어야 합니다.
 *  비밀번호는 '문자와 숫자'로만 구성됩니다.
 *  암호는 최소 숫자 두개를 포함해야 합니다.
 *  입력하세요. (위 이용약관에 동의하는 것입니다.): abcd1234      비밀번호 유효: abcd1234
 *  
 *  - 문자열 입력 + 비어있는 문자열 입력되었는 지 검증
 *	- 문자열이 문자로 이루어져있는 지 확인 || 숫자로 이루어져있는 지 확인 ==> 둘다 포함되어야함
 *	- 
 */

public class Ex11 {

	public static void main(String[] args) {
		
		String pwd = inputStr();
		
		boolean isVaildPwd = isValidPwd(pwd);
		
		System.out.println(isVaildPwd);
		
	} // main

	/*
	 * 1. 문자열 입력 (Str)
	 */
	public static String inputStr() {

		String str = "";

		String messageIOException = "입출력 오류입니다.";
		String nullPointerException = "비어있는 문자열을 입력하셨습니다.";

		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		try {

			str = br.readLine();
			
			// 만약 비어있거나 공백으로 입력한다면 NullPointerException 발생시킴
			if(isBlank(str) == true) {
				
				str = null;
				
			} // if

		} catch (IOException e) {

			System.out.println(messageIOException);
			System.out.println(e.getMessage());

		} catch (NullPointerException e) {

			System.out.println(nullPointerException);
			System.out.println(e.getMessage());

		} // try-catch

		return str;

	} // inputStr
	
	
	
	/*
	 * 1-1. 입력된 String 공백 또는 띄어쓰기만 존재하면 메세지 출력
	 */
	public static boolean isBlank(String inputStr) {

		// 띄어쓰기 제거하기
		String nonWhitespace = inputStr.replace(" ", "");

		// 문자열이 공백, 띄어쓰만 존재하는 지
		boolean isBlank = false;

		// 띄어쓰기를 제외한 문장이 비어있다면 true 리턴
		if (nonWhitespace.isEmpty() == true) {

			isBlank = true;

		} // if

		return isBlank;

	} // isBlank
	
	
	
	/*
	 * 2. 입력한 비밀번호 길이 맞는지 확인
	 */
	
	public static boolean isValidLength(String password) {

		int pwdLength = 10;
		int inputPwdLength = password.length();
		
		String message = "8자 이상 입력해주세요!";
		
		// 1. 입력한 비밀번호가 규정(8자이상)보다 짧으면 XX
        if (inputPwdLength < pwdLength) {
        	
        	System.out.println(message);
        	
        	return false;
        
        } // if
        
		return false;

    } // isValidLength
	

	
	/*
	 * 3 - A )  문자가 알파벳인지 확인
	 */

	public static boolean isLetter(char ch) {

		boolean isLetter = false;
		
		// 1. 모두 대문자로 바꾸어주기
		ch = Character.toUpperCase(ch);

		// 2. 조건 확인 : 사이값일 때 문자 !
		if (ch >= 'A' && ch <= 'Z') {

			return isLetter = true;

		} // if

		return isLetter;

	} // isLetter
	
	
    /*
	 * 3 - B ) 문자가 숫자인지 확인
	 */

    public static boolean isNumeric(char ch) {

    	boolean isNumeric = false;
    	
    	
    	// 조건 확인 : 사이값일 때 숫자 !
    	if (ch >= '0' && ch <= '9') {
    		
    		return isNumeric = true;
    		
    	} // if
        
		return isNumeric;
        
    } // isNumeric
	

    /*
	 * 3. 비밀번호 검증
	 */
	
	public static boolean isValidPwd(String password) {

		boolean isValidPwd = false;
		
		if (isValidLength(password) == false) {
			return false;
		}

		int inputPwdLength = password.length();
		
        // 문자 수 세기
        int charCount = 0;
        
        // 숫자 수 세기
        int numCount = 0;
        
        // 숫자 수 세기
        int otherCount = 0;
        

		String message = "알파벳과 숫자만 입력가능합니다.";
        
        // 2. 입력한 비밀번호 탐색 , 문자와 숫자로만 이루어져있는 지
        //    알파벳과 숫자 말고 다른 걸 입력했을 지 바로 false !!
        for (int i = 0; i < inputPwdLength; i++) {

            char ch = password.charAt(i);

            if (isNumeric(ch)) {
            	
            	numCount++;
            	
            } else if (isLetter(ch)) {
            	
            	charCount++;
            	
            } else {
            	otherCount ++;
            	
            	System.out.println(message);
            	return isValidPwd = false;
            	
            } // if-else if

        } // for
        
        
        // 3. 숫자가 2개 이상인지 확인
       if (numCount >= 2) {
    	   return isValidPwd = true;
       } // if
       
	return isValidPwd;
        
    } // isValidPwd
	
    
} // end class

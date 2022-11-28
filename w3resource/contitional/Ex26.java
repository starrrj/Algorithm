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

 *  다음 문자 마름모 구조를 표시하는 Java 프로그램을 작성하십시오. 
 *  
 *  
 	  A                                                   
     ABA                                                  
    ABCBA                                                 
   ABCDCBA                                                
  ABCDEDCBA                                               
 ABCDEFEDCBA                                              
ABCDEFGFEDCBA                                             
 ABCDEFEDCBA                                              
  ABCDEDCBA                                               
   ABCDCBA                                                
    ABCBA                                                 
     ABA                                                 
      A       
 *  
 */


public class Ex26 {

	
	public static void main(String[] args) {	
		
		int num = inputChar();
		
		getTriangle(num);
		
	} // main
	
	
	
	/*
	 *   다이아몬드 패턴 만들기
	 */
	public static void getTriangle(int num) {

		int start = 'A'; // 시작 문자 = 65
		System.out.println("입력 int : "+ start);
		
		char chr = (char) num;
		
		
		// 상단
		for(int i = start; i <= chr; i++) {
			
			// 앞 공백
		    for(int j = chr; j > i; j--) {
		   	 
		    System.out.print(" ");
		    } // inner-for #1
		    
		    // 왼쪽 알파벳
		    for(int j = start; j <= i; j++) {
		   	 
		       System.out.print((char)j);
		    } // inner-for #2
		    
		    // 오른쪽 알파벳
		    for(int j = i; j >= start; j--) {
		   	 
		       System.out.print((char)j);
		    } // inner-for #3
		    
		    System.out.println("");
		} // outer-for #1
		 

		
		//하단
		for(int i = chr; i >= start; i--) {
			
			// 하단 공백
			for(int j = i; j <= chr; j++) {
	    	 
	    	 System.out.print(" ");
			} // inner-for #1
	     
			// 왼쪽 알파벳
		    for(int j = start; j < i; j++) {
		   	 
		       System.out.print((char)j);
		    } // inner-for #2
		    
		    // 오른쪽 알파벳
		    for(int j = i-1; j >= start; j--) {
		   	 
		       System.out.print((char)j);
		    } // inner-for #3
		    
		    System.out.println("");

	   }// outer-for #1
	
	}// getTriangle
	
	
	/*
	 *  문자 입력(Character)
	 */
	public static int inputChar() {
		
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
		
	} // inputChar
	
} // class

package basicpart2;

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
 *  t가 참을 나타내고 f가 거짓을 나타내는 
 *  2차원 부울 배열의 내용을 인쇄하는 Java 프로그램을 작성하십시오.
 * 
 * 샘플 배열:
 * array = {{true, false, true},
 * {false, true, false}};
 * 예상 출력 :
 * tft
 * ftf
 */

public class Ex154 {
	
	static int rowsLength;
	static int columnsLength;

	public static void main(String[] args) {
		
		boolean [][] boolArray  = {{true, false, true}, {false, true, false}};
		
		rowsLength = boolArray.length;
		columnsLength = boolArray[0].length;		
		
		checkTrueAndFalse(boolArray);	

	} // main

	
	static void checkTrueAndFalse (boolean [][] boolArray) {
		
		for (int i = 0; i < rowsLength; i++) {
			for (int j = 0; j < columnsLength; j++) {
				
				if (boolArray[i][j]) {
					System.out.print("t ");
				} else {
					System.out.print("f ");
				} // if-else
				
			} // for
			System.out.println("");
		}	// for
		
	} // checkTrueAndFalse
	
	
} // end class

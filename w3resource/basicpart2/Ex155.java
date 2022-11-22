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
 *  주어진 2차원 배열의 행과 열을 변경한 후 배열을 인쇄하는 Java 프로그램을 작성하십시오. 
 *  원래 배열:
 *  10 20 30
 *  40 50 60
 *  해당 배열의 행과 열을 변경한 후: 
 *  10 40
 *  20 50
 *  30 60
 */

public class Ex155 {
	
	public static void main(String[] args) {
		
		int[][] numArray = {{10, 20, 30}, {40, 50, 60}};

		turnover(numArray);
		
	} // main

	
	/* 행열을 변경하는 메서드 */
	static void turnover(int[][] numArray) {
		
		int[][] newArray = new int[numArray[0].length][numArray.length];
				
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[0].length; j++) {
				
				newArray[j][i] = numArray[i][j];

			}
		}
		
		// 행렬변경 후 출력
		printArray(newArray);
		
	} // turnover
	
	
	/* 배열출력 메서드 */
	static void printArray(int[][] numArray) {
	
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[0].length; j++) {
				
				System.out.print(numArray[i][j] + " ");
				
			}
			System.out.println("");
		}
		
	} // printArray
	
} // end class


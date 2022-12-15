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
 *  세 개의 정수를 받아들이고 그 중 하나가 다른 두 정수 사이의 중간 지점이면 => 두개의 평균이 다른하나와 같을 때
 *  true를 반환하고 그렇지 않으면 false를 반환하는 Java 메서드를 작성하십시오. 
 *  1. 숫자 입력
 *  2. 중간값 판별 (최대, 최소, 나머지값 = 중간값인지? )
 *	
 */

public class Ex19 {

	public static void main(String[] args) {

		int num1 = inputInt();
		int num2 = inputInt();
		int num3 = inputInt();
		
		boolean isMiddleNum;
		
		isMiddleNum = isBtweenRanges(num1, num2, num3);
		
		System.out.println(isMiddleNum);
		

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

		} // try-catch

		return num;

	} // inputInt
	
	
	/*
	 * 2. 최대값 최소값 구하여 그 둘의 평균값과 나머지가 같은 지 확인
	 */
	 public static boolean isBtweenRanges(int num1, int num2, int num3){
		 
		 	int max;			// 최대값
		 	int min;			// 최소값
		 	double middlePoint;	// 최대값과 최소값의 중앙값
		 	int otherwiseNum;	// 나머지 값 = 세개의 숫자 중 최대값 최소값을 제외한 숫자 
		 	
		 	boolean isBtweenRanges; // 중앙값이면 true, 아니면 false
		 	
		 
		 	// 1. 최대값, 최소값 구하기 --> 변수저장
		 	max = Math.max(num1, Math.max(num2,num3));
		 	min = Math.min(num1, Math.min(num2,num3));
		    
		    
		    // 2. 최대값과 최소값은 평균(=중앙값) 구하기 --> 변수저장
		    middlePoint = (max + min) / 2.0;
		    
		    // 3. 나머지값 구하기 --> 변수저장
		    otherwiseNum  = num1 + num2 + num3 - max - min;
		    
		    // 4. 판별한 값을 변수에 저장
		    isBtweenRanges = (otherwiseNum == middlePoint);
		    
		    return isBtweenRanges;
		    
	 } // isBtweenRanges
	 
} // end class

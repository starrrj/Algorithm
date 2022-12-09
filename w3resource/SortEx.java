package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;


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
 * (*** 문자열이라고 어렵게 생각하지말고, 숫자라고 가정해보자)
 * 
 *  1. 입력 받고
 *  2. Str[0] 이 제일 큰 것 찾기
 *  3. 가장 큰걸 찾아 newStr[0] 에 두기
 *  4. 비교하며 찾아서 순서대로 나열하기
 * 
 *  무엇을 사용해야할 까 ... ArrayList ??? 중복가능 순서대로
 *  우선 영어로만! .. char[] ..
 *  
 *  음 띄어쓰기를 기준으로 잘라서 넣어야하는 것 아닌가? 다시생각하기
 *  
 *  만약 띄어쓰기를 기준으로 나뉜 String 배열이라면?
 *  1. 띄어쓰기를 기준으로 배열에 따로 넣어준다. --> split  먼저 구현하기. 구현전에는 split 함수사용
 *  2. 배열에 담긴 String배열 인덱스 0번부터 비교하여 정렬
 *  	- abc, bca, cab 라면 a, b, c 를 비교하여 순서대로 정렬
 *  
 */

public class SortEx {

	public static void main(String[] args) {
		
		String inputStr = inputStr();
		
		// String -> char[]
		char[] chr = changeChrfromStr(inputStr);

		// char[] --> 정렬된 char[]
		char[] result = bubleSort(chr);
		
		System.out.println(result);
		
	} // main

	
	/*
	 *  3. char[] 버블 정렬
	 */
	public static char[] bubleSort(char[] arr) {
		
		// 값 교환시 값 넣어놓을 임시 바구니
		char tmp;
		
		
		for(int i = 0; i < arr.length-1; i++ ) {
			
			// 앞의 정수가 바로 다음 정수보다 클 경우 자리를 바꿔주기 위한 비교
			// -i : 이미 확인한 부분은 제외하고 비교.
			for(int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
				
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
					
				} // if
				
			} // inner-for
			
		} // outer-for
		
		return arr;
		
	} // bubleSort
	
	
	/*
	 * 	2. 입력받은 String --> char[] 로 변경  ---> 띄어쓰기 기준이 아닌 문자기준이 되어버림..
	 */
	
	public static char[] changeChrfromStr (String str) {
		
		char[] changeChr = str.toCharArray();
		
		System.out.println(changeChr);
		
		return changeChr;
		
		
	} // sortStr
	
	
	
	/*
	 *  1. 문자열 입력(String)
	 */
	public static String inputStr() {
		
		String str = "";
		
		String IOException = "입출력 오류입니다.";
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			str = br.readLine();
			
			Objects.requireNonNull(str);
			System.out.println(str);
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch
		
		return str;
		
	} // InputStr
} // end class

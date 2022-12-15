package string;

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
 *  1. 문장입력받기
 *  2. 입력 문자열 중 나눌 때 기준이 되는 문자 입력
 *  3. 입력한 문자와 같은 문자를 찾는다. --> 
 *  4. 배열에 담는 다.
 *  배열에 넣기가 중요 ! 나눠서 배열에 넣는 것이 split (***)
 *  
 *  String 인덱스의 값을 뽑아낼때 charAt(indexNum)
 */

public class SplitEx3 {

	public static void main(String[] agrs) {

//		String inputStr = inputStr();
//		String splitPointStr = inputStr();

		String inputStr = "나비야/나비야/이리/날아오너라";
		String splitPointStr = "/";

		List<String> result = splitStr(inputStr, splitPointStr);
		
		for(String str : result) { //for문을 통한 전체출력
		    System.out.println(str);
		}
	

	} // main
	
	
	/*
	 * 1. 문자열 입력(String)
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
	
	
	/*
	 *  2. 문자열 분리 하여 배열에 담아주기 (Split ***)
	 */
	public static List<String> splitStr (String inputStr, String splitStr) {
		
		// String배열에 저장할 문자열 임시 변수
		String hadStr = "";
		
		// 나머지 문자열을 저장할 변수
		String tailString = inputStr;
		
		// splitStr이 있는 인덱스 --> while문 진행을 위해 임의의 값을 넣어줌 --> 다른방법없을지 생각해보기! 
		int indexNum = 1;
		
		// ArrayList는 사이즈를 명시할 필요가 없다! 데이터 추가할 때 자동증가
		// ==== > 때문에 배열에 넣을 때 처럼 따로 길이설정 X
		// ==== > 때문에 split 문자의 개수를 구하지 않아도 됨!
		List<String> list = new ArrayList<String>();

		// Arraylist에 String 잘라서 값 넣어주기

		while ( indexNum > 0) {
			
			// 1. 구분자 문자열의 인덱스를 구함
			indexNum = tailString.indexOf(splitStr);
			
			// 2. 인덱스 번호를 찾았을 시
			// 문자열에서 인덱스까지 잘라서 변수저장 (문자열 첫번째~찾은 문자열인덱스 전까지)
			if (indexNum > 0) {
				
				hadStr = tailString.substring(0, indexNum);

				// 3. 문자열에서 인덱스까지 잘라서 변수저장 (찾은 문자열인덱스 ~ 문자열 끝까지)
				tailString = tailString.substring(indexNum + 1);
				
			} else {
						
			// 4. 이후 만약 인덱스를 찾지못하면 나머지를 변수저장
				hadStr = tailString;
			} // if-else
			 
			list.add(hadStr);
		
		} // while

		// 배열 리턴
		return list;
		
	} // splitStr

	
	
} // class

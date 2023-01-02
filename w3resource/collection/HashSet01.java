package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
 *  Java 프로그램을 작성하여 새 배열 목록을 만들고 
 *  일부 색상(문자열)을 추가하고 컬렉션을 인쇄합니다.
 */

public class HashSet01 {

	public static void main(String[] args) {

		Set<String> hashColor = new HashSet<>();

		hashColor = setHashColor();

		System.out.println(hashColor);

	} // main

	/*
	 * Hashset 생성하여 값넣어주기 
	 * (1) 동일 객체 및 동등 객체는 중복 저장하지 않음 
	 * (2) 동등 객체 판단 방법
	 */
	public static Set<String> setHashColor() {

		Set<String> set = new HashSet<>();

		set.add("Red");
		set.add("Orange");
		set.add("Yellow");
		set.add("Green");
		set.add("Blue");
		set.add("Indigo");
		set.add("Purple");

		return set;

	} // setHashColor

	
	/*
	 * Hashset 루프하여 탐색, String에 담아서 반환
	 */
	public static String iterateHash() {

		String iterateString = "";

		Set<String> set = new HashSet<>();

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) { // 저장된 객체수많큼 루핑,
										// String 객체 하나를 가져옴, 가져올게 있으면 true, 없으면 false

			iterateString += iterator.next();

		} // while

		return iterateString;

	} // iterateHash

} // end class

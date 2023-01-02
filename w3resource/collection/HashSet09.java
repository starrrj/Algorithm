package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
 * 해시 세트를 List/ArrayList로 변환하는 Java 프로그램을 작성하십시오. 
 */

public class HashSet09 {

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
	 * Hashset을 List로 변환
	 */
	public static List<String> changeHash(HashSet<String> hashSet) {

		List<String> list = new ArrayList<String>(hashSet);

		return list;

	} // changeHash

} // end class

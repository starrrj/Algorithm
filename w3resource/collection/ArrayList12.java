package collection;

import java.util.ArrayList;
import java.util.List;

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
 * 배열 목록의 일부를 추출하는 Java 프로그램을 작성하십시오.
 */

public class ArrayList12 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list = setListColor();

		
		List<String> subList = new ArrayList<String>();
		subList = extractArrList(list);
		
		System.out.println(subList);
	
	} // main

	
	/*
	 * List 생성하여 값넣어주기
	 */
	public static List<String> setListColor() {

		List<String> listColor = new ArrayList<String>();

		listColor.add("Red");
		listColor.add("Orange");
		listColor.add("Yellow");
		listColor.add("Green");
		listColor.add("Blue");
		listColor.add("Indigo");
		listColor.add("Purple");

		return listColor;

	} // setListColor

	
	/*
	 * 요소 추출하기
	 */
	public static List<String> extractArrList(List<String> list) {

		List<String> extractionList = new ArrayList<String>();

		extractionList = list.subList(1, 4);


		return extractionList;

	} // joinedList

} // end class

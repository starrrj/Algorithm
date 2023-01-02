package collection;

import java.util.TreeMap;

/*
 * ==========================================================O
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
 * 연결된 목록의 지정된 위치에 지정된 요소를 삽입하는 Java 프로그램을 작성하십시오.
 * 
 */
public class TreeMap01 {

	public static void main(String[] args) {


	} // main

	/*
	 * HasMap 생성하여 값넣어주기 (key, value)
	 */
	public static TreeMap<Integer, String> setTreeMap() {

		// Lvalue(부모타입) = Rvalue(자식타입, 구현클래스)
		TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>(); 

		treeMap.put(1, "Red");
		treeMap.put(2, "Orange");
		treeMap.put(3, "Yellow");
		treeMap.put(4, "Green");
		treeMap.put(5, "Blue");
		treeMap.put(6, "Indigo");
		treeMap.put(7, "Purple");

		return treeMap;

	} // settreeMap


} // end class

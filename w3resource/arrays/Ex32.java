package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
 * 주어진 배열의 중복 요소를 제거하고 배열의 새 길이를 반환하는 Java 프로그램을 작성하십시오.
 * 샘플 배열: [20, 20, 30, 40, 50, 50, 50]
 * 중복 요소를 제거한 후 프로그램은 배열의 새 길이로 4를 반환해야 합니다.
 */

public class Ex32 {

	
	public static void main (String[] args) {
	
	
	int[] arr = { 20, 20, 30, 40, 50, 50, 50};
	
	int[] newArr = changeHashSet(arr);
	
	System.out.println(Arrays.toString(newArr));
	
	} // main
	
	
	
	/*
	 *  HashSet 자료구조로 변환하기
	 *	-> 중복된 값을 중복저장 할 수 없는 특성 활용
	 */
	
	static int[] changeHashSet (int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		
		// 배열에 있는 값 하나씩 뽑아내어 set에 담기 (이 때 중복값 제거됨)
		for(int num : arr) {
			
			set.add(num);
			
		} // for #1
		
		// 새로운 배열 생성
		int [] newArr = new int [set.size()];
		
		// set에 있는 값을 Iterator에 넣어준다.
		Iterator<Integer> iterator = set.iterator();
		
		// iterator의 값을 배열에 다시 넣어준다.
		for(int i = 0; i < newArr.length; i++) {
			
			newArr[i] = iterator.next();
			
		} // for #2
		
		// 배열 순차적 정렬
		Arrays.sort(newArr);
		
		return newArr;
		
	} // changeHashSet

	
} // end class

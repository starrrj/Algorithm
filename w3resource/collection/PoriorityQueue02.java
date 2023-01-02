package collection;

import java.util.Collections;
import java.util.PriorityQueue;

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
 * Queue는 먼저 넣은 데이터가 먼저 나오는 FIFO(First In First Out) 특징을 가진 선형 자료구조입니다. 
 * 우선순위 큐(Priority Queue) 또한 큐와 비슷하지만 
 * 다른 점은 들어간 순서에 상관없이 우선순위가 높은 데이터가 먼저 나오는 자료구조
 * 
 */
public class PoriorityQueue02 {

	public static void main(String[] args) {

		int pollQueue = 0;

		// 생성
		pollQueue = setPoriorityQueue();
		System.out.println(pollQueue);

	} // main

	/*
	 * Priority Queue 생성
	 */
	public static Integer setPoriorityQueue() {

		int pollQueue = 0;
		
//		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder()); // Integer 내림차순

		queue.add(4);
		queue.add(19);
		queue.add(2);
		queue.add(1);
		
		pollQueue = queue.poll();

		return pollQueue;

	} // setPoriorityQueue

} // end class

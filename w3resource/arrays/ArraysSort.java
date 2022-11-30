package array;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
	
//		int[] numArr= { 4, 6, 1, 8, 7, 5 };

//		int[] numArr= { 4, 6, 1, 8, 8, 5, 5 };	// test
		int[] numArr= { 2, 6, 1, 3, 0, 4, 5 };	// test
		
//		int[] output = bubleSort(numArr);		// 버블정렬 적용
		int[] output = insertSort(numArr);		// 삽입정렬 적용
		
		System.out.println(Arrays.toString(output));
		
	} // main

	
	
	/*
	 *	삽입 정렬 
	 */
	public static int[] insertSort(int[] arr) {
		
		// 현재 값
		int nowValue;
		
		// index 변수.
		int preIdex;
		
		for(int i = 1; i < arr.length; i++) {
			
			nowValue = arr[i];
			preIdex = i - 1;
			
			// 현재 선택된 원소가 이전 원소보다 작은 경우 + 이전 인덱스가 0과 같거나, 클 때
			while(preIdex >= 0 && arr[preIdex] > nowValue) {
				
				// 이전 인덱스 값을 현재 인덱스에 넣기
				arr[preIdex + 1] = arr[preIdex];
				
				// 다음 대상 원소를 탐색한다.
				preIdex--;
				
			}
			
			// while 탈출 시점에 선택된 변수 값 저장.
			arr[preIdex + 1] = nowValue;
		}
		
		return arr;
		
	} // insertSort
	
	
	
	/*
	 *  버블 정렬
	 */
	public static int[] bubleSort(int[] arr) {
		
		// 값 교환시 값 넣어놓을 임시 바구니
		int tmp;
		
		
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
		
	} // selectionSort
	
} // end class

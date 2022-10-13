import java.util.Arrays;
import java.util.ArrayList;


// 제일 작은 수 제거
public class solution {

	public int[] solution(int[] arr) {
        
		// sort를 이용해서 최솟값 가져오기    
		int[] temp = arr.clone();
		Arrays.sort(temp);
		int min = temp[0];
        
		//ArrayList를 이용하여 최솟값과 같지 않은 수만 추가
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != min) {
				list.add(arr[i]);
			} //if
		} // for
		
		int[] answer;
        
		// 경우를 나눠서 배열에 값을 저장하기		
		if(list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			} // for
		} // if-else
		
        return answer;        
    } // solution
} // end class

package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex033 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int answer = 0;
		
		// 입력 스트림 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력값 변수에 넣기
		String num = br.readLine();
		
		for(int i=0; i<num.length(); i++) {
			// substring 사용하여 문자열 하나씩 리턴하여 answer에 덧셈
			answer += Integer.parseInt(num.substring(i, i+1));
			
//			System.out.println(num.substring(i, i+1));
		}

		System.out.println(answer);
		
	} // main

} // end class
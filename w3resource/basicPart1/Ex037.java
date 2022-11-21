package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String result = "";
		
		// 입력 스트림 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력값 변수에 넣기
		String str = br.readLine();
		
		// result 에 문자열 거꾸로 넣어주기
		for(int i=str.length()-1; i >-1; i--) {
			result += str.charAt(i);
		} // for

		// console 출력
		System.out.println(result);
		
	} // main

} // end class
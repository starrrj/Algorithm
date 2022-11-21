package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex019 {

	public static void main(String[] args) throws IOException {
		
		// 입력 스트림 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력한 String 값 Int 변환 후 검증 출력
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);
		
		// 10진수 2진수로 변환
		System.out.println(Integer.toBinaryString(num));

	} // main
	
} // end class

package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex034 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 입력 스트림 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력값 변수에 넣기
		int num = Integer.parseInt(br.readLine());
		
		System.out.println((6 * num*num)/(4*Math.tan(Math.PI/6)));

	} // main

} // end class
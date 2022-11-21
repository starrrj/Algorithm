package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*  타입을 변환하는 방법보다 나은 방법이 있을까...?
 *  비트연산 이해해보기
 *  BigInteger ... 란? 
 */

public class Ex017 {

	public static void main(String[] args) throws IOException {
		
		// 입력 스트림 선언 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("");
		
		// 입력받은 값 = String
		String bin1 = br.readLine();
		String bin2 = br.readLine();

		// String 값 -> 10진수 변환(int)
		int num1 = Integer.parseInt(bin1, 2);
		int num2 = Integer.parseInt(bin2, 2);

		// 출력해서 값 확인하기
		System.out.println(num1);
		System.out.println(num2);
		
		// 10진수 덧셈
		int result = num1+num2;

		// 10진수 -> 2진수로 변환
		String result2 = Integer.toBinaryString(result);
		System.out.println(result2);
		
	} // main
	
} // end class

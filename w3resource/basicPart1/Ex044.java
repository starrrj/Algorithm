package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  정수(n)를 받아들이고 n+nn+nnn의 값을 계산하는 Java 프로그램을 작성하십시오.
 */
public class Ex044 {

	public static void main(String[] args) throws NumberFormatException, IOException{

		// 입력 스트림 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		// 입력값 변수에 넣기
		int num1 = Integer.parseInt(br.readLine());
		
		// 리터럴 고정값을 어떻게 변경할지 고민하기...
//		int num2 = num1*11;
//		int num3 = num1*111
//		System.out.println(num1 + num2 + num3);
		
		System.out.printf("%d + %d%d  + %d%d%d\n", num1, num1, num1, num1, num1, num1);

	} // main
	
} // end class

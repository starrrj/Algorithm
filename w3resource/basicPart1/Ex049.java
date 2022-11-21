package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  숫자를 받아들이고 숫자가 짝수인지 확인하는 Java 프로그램을 작성하십시오. 
 *  숫자가 짝수이면 1을, 홀수이면 0을 출력합니다
 *  
 *  입력 => bufferedreader
 *  짝수, 홀수 다른 출력 => if-else or switch()
 */
public class Ex049 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 입력 스트림 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자를 입력해주세요.");
						
		// 입력값 변수에 넣기
		int num = Integer.parseInt(br.readLine());
		
		if	(num%2 == 0)  System.out.println("1");
		else 			  System.out.println("0");
        
	} // main
	
} // end class
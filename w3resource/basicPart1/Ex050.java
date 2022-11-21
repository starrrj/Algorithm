package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *   3, 5 및 둘 다로 나누어지는 1에서 100 사이의 숫자를 인쇄하는 Java 프로그램을 작성하십시오.
 *   '최소 공배수(lcm)'의 배수
 */
public class Ex050 {

	public static void  main(String[] args) throws NumberFormatException, IOException {
		
		// 입력 스트림 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자를 2개 입력해주세요.");
		
		// 입력값 변수에 넣기
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		int lcmNum = lcm(a,b);
		
		for(int i=1; lcmNum*i<100; i++) {
			
			int number = lcmNum* i;
			System.out.print(number + " ");
			
		} // for
        
	} // main
		
	static int gdc(int a, int b) { //최대 공약수
		
		if(a<b) // 유클리드 호제법 조건
		{
			int temp = a;
			a = b;
			b = temp;
		}// if
		
		while(b!=0) { // 유클리드 호제법
			int r=a%b;
			a=b;
			b=r;
		} // while
		
		return a;
	} // gdc
	
	static int lcm(int a, int b) { //최소 공배수
		return a*b / gdc(a,b);
	} // lcm

	
} // end class
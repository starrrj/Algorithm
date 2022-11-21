package basicpart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex032 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 입력 스트림 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numA = Integer.parseInt(br.readLine());
		int numB = Integer.parseInt(br.readLine());
		
		if(numA == numB) System.out.println(numA + "==" + numB);
		if(numA != numB) System.out.println(numA + "!=" + numB);
		
		if(numA < numB) System.out.println(numA + "<" + numB);
		if(numA <= numB) System.out.println(numA + "<=" + numB);
		
		if(numA > numB) System.out.println(numA + "<" + numB);
		if(numA >= numB) System.out.println(numA + ">=" + numB);
		
	} // main

} // end class
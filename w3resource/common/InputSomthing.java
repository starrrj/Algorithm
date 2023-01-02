package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputSomthing {

	String str;

	public InputSomthing (String str) {
	
		this.str = str;
		
	} // 생성자

	
	/*
	 *  input String ---> output Int
	 */
	public String inputString(String str) {

		String inputStr = null;
		
		String numberFormatMessage = "숫자형식 오류입니다.";
		String IOException = "입출력 오류입니다.";
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			str = br.readLine();
			
		} catch (NumberFormatException e) {
					
			System.out.println(e.getMessage());
			System.out.println(numberFormatMessage);
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch

	
		return inputStr;
		
	} // InputString
	
	
	
	/*
	 *  input String ---> output Int
	 */
	public int FromStrFromStr(String str) {

		int inputInt = 0;
		
		String numberFormatMessage = "숫자형식 오류입니다.";
		String IOException = "입출력 오류입니다.";
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			inputInt = Integer.parseInt(br.readLine());
			
		} catch (NumberFormatException e) {
					
			System.out.println(e.getMessage());
			System.out.println(numberFormatMessage);
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch

	
		return inputInt;
		
	} // inputDouble
	
	
	
	/*
	 *  input String ---> output Double
	 */
	public Double inputDoubleFromStr(String str) {

		Double inputdouble = null;
		
		String numberFormatMessage = "숫자형식 오류입니다.";
		String IOException = "입출력 오류입니다.";
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		try {
			
			inputdouble = Double.parseDouble(br.readLine());
			
		} catch (NumberFormatException e) {
					
			System.out.println(e.getMessage());
			System.out.println(numberFormatMessage);
			
		} catch (IOException e) {
			
			System.out.println(IOException);
			System.out.println(e.getMessage());
			
		} // try-catch

	
		return inputdouble;
		
	} // inputDouble
			

} // end class

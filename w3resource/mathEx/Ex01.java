package mathEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01 {

	public static void main(String[] args) {
		
		
		/*
		 * 1. 정수 나누기 결과를 반올림하는 Java 프로그램을 작성하십시오. 
		 */
		double value = getRoundValue(16,4);
		System.out.println(value);
		
		
		/*
		 * 2. double 값에서 정수 부분과 소수 부분을 가져오는 Java 프로그램을 작성하십시오. 
		 */
		
		Map<String, Object> map = new HashMap<String, Object>();
		map = getIntValueAndDecimalValue(132.14);
		
		String mapStr = iterateHashMap(map);
		
		System.out.println(mapStr);
		
		
		/*
		 * 3. double 값이 정수인지 테스트하는 Java 프로그램을 작성하십시오. 
		 */
		boolean isIntegerValue = isIntegerValue(14.1234);
		System.out.println(isIntegerValue);

	} // main

	
	/*
	 * 1. 정수 나누기 결과를 반올림하는 Java 프로그램을 작성하십시오. 
	 */
	public static double getRoundValue (int num1, int num2) {
		
		double value = num1 / num2;
		double roundValue = Math.round(value);
		
		return roundValue;
		
	} // getRoundValue
	
	
	/*
	 * 2-1. double 값에서 정수 부분과 소수 부분을 가져오는 Java 프로그램을 작성하십시오. 
	 */
	public static Map<String, Object> getIntValueAndDecimalValue (double doubleNum) {

		int intValue = (int) doubleNum;
		double dobleValue = doubleNum % 1;

		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("int", intValue);
		map.put("double", dobleValue);
		
		return map;
		
	} // getIntValueAndDecimalValue
	
	/*
	 * 2-2. HasMap 반복문 --> String에 값 담기
	 */
	public static String iterateHashMap(Map<String, Object> map) {

		String hashMapStr = "";
		String valueName;
		Object value;

		for (Entry<String, Object> entry : map.entrySet()) {

			valueName = entry.getKey();
			value = entry.getValue();
			
			hashMapStr += valueName + " = "+ value + " ";

		} // for

		return hashMapStr;

	} // iterateHashMap
	
	
	/*
	 * 3. double 값이 정수인지 테스트하는 Java 프로그램을 작성하십시오. 
	 */
	public static boolean isIntegerValue (double doubleNum) {

		boolean isIntegerValue = false;
		
		if(doubleNum % 1 == 0) {
			
			isIntegerValue = true;
			
		} // if
		
		return isIntegerValue;
				
	} // isIntegerValue
	
	
	/*
	 * 4.float 숫자를 지정된 십진수로 반올림하는 Java 프로그램을 작성하십시오.
	 */
	public static int getIntegerToRound (float floatNum) {
		
	} // getIntegerToRound
	
} // end class

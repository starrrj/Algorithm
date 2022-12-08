package string;

import java.util.Arrays;

public class TestEx {

	public static void main(String[] agrs) {
		
//		int a = 312;
//		
//		char num = 48;
//		System.out.println(num);
//		
		
//		char c = (char) a;
//		
//		System.out.println(c);
		
		
//		int chrVal = Character.MAX_VALUE;
//		System.out.println(chrVal);
		
		
//		String str = "asg dsp oso wmd xzs";
//		
//		String[] strArr = str.split(" ");
//		
//		System.out.println(Arrays.toString(strArr));
	
		
//		String str = "dh";
//		
//		System.out.println( str.compareTo("asdf") );  // 
		
		String str = "  "; 
		String[] strArr = null;
		String message = "문자열이 비어있습니다.";

		if (str == null || isBlank(str)==true) {

			System.out.println(message);

		} else {

			strArr = str.split(" ");

			System.out.println(">>>" + Arrays.toString(strArr) );
		}

		
	} // main
	
	/*
	 *  입력된 String 공백 또는 띄어쓰기만 존재하면 메세지 출력
	 */
	public static boolean isBlank (String str) {
		
		// 띄어쓰기 제거하기
		String nonWhitespace = str.replace(" ", "");
		
		// 문자열이 공백, 띄어쓰만 존재하는 지
		boolean isBlank = false;
		
		// 띄어쓰기를 제외한 문장이 비어있다면 true 리턴 
		if(nonWhitespace.isEmpty() == true) {
			
			isBlank = true;
			
		} // if
		
		return isBlank;
		
	} // isBlank
	
} // end class

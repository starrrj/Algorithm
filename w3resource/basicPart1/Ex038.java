package basicpart1;

public class Ex038 {

	public static void main(String[] args){

		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		countChar(test);
		
	} // main
	
	// 입력문자열 문자속성 계산하는 메소드 
	public static void countChar(String str) {
		
		// 테스트 str을 char배열에 담기
		char[] ch = str.toCharArray();
		
		// count 할 변수 선언
		int charCnt = 0;
		int blankCnt = 0;
		int numCnt = 0;
		int otherCnt = 0;
		
		for(int i = 0; i < str.length(); i++){
			
			if(Character.isLetter(ch[i]))     		{ charCnt ++ ; } 
			else if(Character.isSpaceChar(ch[i]))	{ blankCnt ++ ; }
			else if(Character.isDigit(ch[i])) 		{ numCnt ++ ; }
			else 									{ otherCnt ++; }
			
		} // for
		
		System.out.println("문자열은 " + str + "입니다. \n");
		System.out.println("문자는 " + charCnt + "개 입니다.");
		System.out.println("공백은 " + blankCnt + "개 입니다.");
		System.out.println("숫자는 " + numCnt + "개 입니다.");
		System.out.println("기타 문자는 " + otherCnt + "개 입니다.");
		
		
	} // countChar

} // end class
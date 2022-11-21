package basicpart1;

/*
 *  1에서 99까지의 홀수를 인쇄하는 Java 프로그램을 작성하십시오. 한 줄에 하나의 숫자를 인쇄하십시오.
 *  - 1~99 출력 => for문 
 *  - 홀수만!! => if문 + 나머지 연산 사용?
 *  - 한줄 출력 => print OR printf
 */
public class Ex048 {

	public static void main(String[] args) {
		
		for(int i=1; i<100; i++) {
			
			if(i%2 ==1) System.out.print(i);
			
		} // for
        
	} // main
	
} // end class
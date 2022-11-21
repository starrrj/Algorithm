package basicpart1;


/*
 *  1, 2, 3, 4를 사용하여 고유한 3자리 숫자를 생성하고 표시하는 Java 프로그램을 작성하십시오. 
 *  또한 3자리 숫자가 몇 개인지 세십시오.
 *  
 *  1. 1~4 까지의 숫자로 3자리 생성
 *  2. 숫자 중복 불가
 *  3. 3자리 숫자 출력 및 count
 */
public class Ex039 {

	public static void main(String[] args){

		int count = 0;
		
		// 변수 범위 1~4까지, 숫자 3개 = for문 3개
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				for(int k=1; k<5; k++) {				
					if(i!=j && j!=k && k!=i) { // 2. 숫자 중복 불가
						
						// 3자리 숫자 출력 및 count
						count ++;  							
						System.out.println(i+""+j+""+k); 
						
					} // if
					
				} // for3
			} // for2
		} // for1
		
		System.out.println("3자리 숫자는"+ count + "입니다.");
	} // main
	
} // end class
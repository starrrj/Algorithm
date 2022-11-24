package basicpart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ==========================================================
 * 1. 변수선언, 초기화 명시 (의미, 사용하는 곳 주석)
 * 2. Main은 결과값만 ! 로직구현 XX
 * 3. 메소드를 따로두어 로직구현 -> 최소한의 일. 
 * 4. 변수, 메소드 명명 규칙 지키기
 * 5. try-catch 문 사용하여 예외처리. 던지지말기!
 * 6. 방법론 안에서 변수선언 XX, 한번쓰고 버리는 변수는 가능
 * 7. 검증 필수!
 * 8. 선언 -> 초기화 -> 검증 -> 수행 -> 조립 -> 리턴
 * 9. 전역변수 X
 * 10. 주석 꼭 적어주기 -> 지역변수, 메서드 등 모두 !
 * 11. 논리적인 로직에서 한번 더 생각하여, 효율적으로 (***)
 * ===========================================================
 *  
 *  당신의 임무는 스프레드시트 소프트웨어의 작은 부분을 개발하는 것입니다. 
 *  지정된 그림과 같이 주어진 테이블의 열과 행을 더하는 Java 프로그램을 작성
 *  
 *  행/열 수를 입력하십시오(0은 종료) 
 *  4 
 *  25 69 51 26 
 *  68 35 29 54 
 *  54 57 45 63 
 *  61 68 47 59 
 *  결과: 
 *    25    69    51    26  [171] 
 *    68    35    29    54  [186] 
 *    54    57    45    63  [219] 
 *    61    68    47    59  [235] 
 *  [208] [229] [172] [202] [811]
 *   
 */

public class Ex242 {
	
	public static void main(String[] args) {
		
		// 입력숫자
        int num = 0;
		
		// 입력
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		
		// 0이 아닌 숫자를 입력하는 동안 반복
		while(true){

			try {
				// 입력 String을 정수로 형변환
				num = Integer.parseInt(br.readLine());
				
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			// 0을 입력하면 while문 종료
            if(num==0) {
            	break;
            }
            
            // 합계 입력할 행렬이 필요함 -> 입력한 행렬 +1 하여 배열생성 
            int[][] map = new int[num+1][num+1];
            
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                	
                    try {
                    	
                    	// 배열에 값 넣어주기
						map[i][j] = Integer.parseInt(br.readLine());
						
					} catch (NumberFormatException e) {
						System.out.println(e.getMessage());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					} // try-catch
                    
                    // 각 행의 열 합계
                    map[i][num] += map[i][j];
//                    System.out.println(map[i][num]);
                    
                } // inner-for

                // 마지막 배열에 총 합계
                map[num][num] += map[i][num];
//                System.out.println(map[num][num]);
                
            } // outer-for
            
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
            
                	// 각 열의 행 합계
                    map[num][i] += map[j][i];
//                    System.out.println(map[num][i]);
                    
                } // inner-for
            } // outer-for
            
            
            // 배열 출력
            for(int i=0;i<num+1;i++){
                for(int j=0;j<num+1;j++){
                    System.out.printf("%5d", map[i][j]);
                } // inner-for
                System.out.println();	// 행 구분 줄바꿈
            } // outer-for
            
		} // while
		
	} // main
	
	/*
	 *  메서드 작성
	 */
	
	
} // end class
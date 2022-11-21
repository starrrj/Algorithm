package basicpart1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ​​시스템 시간을 표시하는 Java 프로그램을 작성하십시오. 
 * ===> Date() 사용
 * 현재 날짜 시간을 특정 형식으로 표시하는 Java 프로그램을 작성하십시오. 
 * ===> SimpleDateFormat() 이용하기
 */
public class Ex046 {

	public static void main(String[] args) throws InterruptedException {
		
		// 실행한 날짜와 시간을 가지고 있는 객체 생성
		Date systemTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a"); 
        String now = sdf.format(systemTime);
        System.out.println(now);
        
//      SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss.SS");
//        
//      Date today = new Date ();
//		Date tomorrow = new Date ( today.getTime ( ) + (long) ( 1000 * 60 * 60 * 24 ) );
//		
//		long reqTime = System.currentTimeMillis(); 
//		String reqTimeStr = dayTime.format(new Date(reqTime));
//		
//		Thread.sleep(3123);
//		
//		long resTime = System.currentTimeMillis(); 
//		String resTimeStr = dayTime.format(resTime);
//		
//		System.out.println("Date today : " + today);
//		System.out.println("Date tomorrow : " + tomorrow);
//		System.out.println("\n");
//		System.out.println("long reqTime : " + reqTime);
//		System.out.println("\n");
//		System.out.println("요청시간 : " + reqTimeStr);
//		System.out.println("응답시간 : " + resTimeStr);
//		System.out.println("\n");
//		System.out.println("걸린시간 : " + (resTime - reqTime)/1000.000);
        
        
	} // main
	
} // end class
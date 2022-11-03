/*
*** Map 특징 ***
Map 은 선언 시 <key, value>로 값을 넣는다.
Key,Value 는 한 쌍, Key로 식별, Value에 값을 넣는 식
Key는 중복 불가, 동일값을 넣을 시엔 최근 넣은 값 적용
--> 중복값 제거 할 때 사용 goooooood

*** 주요 메소드 ***
Map 안에 값 넣기 : Map.put(key,value);
Map 안의 값 가져오기 : Map.get(key);
Map 크기 확인 : Map.size();
Map 안의 내용 변경하기 : Map.replace(key, value);
Map 안에 특정 Key, Value 들었는지 확인 : Map.containsKey(key); Map.containsValue(value);
Map의 크기가 0인지 확인 : Map.isEmpty();
Map 안의 내용 삭제 : Map.remove(key);
Key가 있으면 Value 없으면 default 호출 : Map.getOrDefault(key, default); - Map에 key에 해당하는 값이 없을 경우 default 호출
Key가 없거나 Value가 null일때만 삽입 : Map.putIfAbsent(key, value);

 *** 차이점 ****
 Map은 선언 시 HashMap, TreeMap, HashTable, LinkedHashMap 으로 선언이 가능
 
 1. HashMap - Map 안에서 key/value에 따른 순서 없음
 2. TreeMap - key 값에 따라 오름차순 정렬, 정렬 때문에 대량의 데이터 삽입/삭제시 오래 걸림
 3. LinkedHashMap - 삽입 순서에 따라 정렬
 4. HashTable - key/value에 null을 넣을 수 없음, 동기화(synchronized) 되어있음
*/


public class MapTest {
  
  public static void main(String[] args) {
  
    HashMap<String, Integer> map = new HashMap<String, Integer>(); // Map 선언
    
    // Map안에 값 넣기
    map.put("Silver", 10);
    map.put("Star", 100);
    map.put("Silver", 1010);  // Map의 Key는 중복불가, 동일한 Key에 다른 값을 넣을 경우 최근에 넣은 값 적용
   
    
    System.out.println("Map Value : " + map.get("Silver"));  // Key를 사용하여 Map 안의 값 가져오기 --> 1010
    System.out.println("Map size : " + map.size());  // Map 크기 확인 --> 2
    
    map.replace("Star", 323); // Key 값의 내용 변경
    System.out.println("Star Value : " + map.get("Star"));  // Key를 사용하여 Map 안의 값 가져오기 --> 323
    
    System.out.println("Key Exist : " + map.containsKey("Star"));  // Key가 존재하는 지 확인 --> ture
    System.out.println("Value Exist : " + map.containsValue(323));  // Value가 존재하는 지 확인 --> ture
    
    System.out.println("Map Empty : " + map.isEmpty("Star"));  // Map의 크기가 0인지 확인 --> false
    
    
  } // main
  
} // end class

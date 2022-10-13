class Solution {
    public int[] solution(int[] arr) {
        // 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴
        if(arr.length == 1) {
            return new int[]{-1};
            
        } else {
             
            int[] answer = new int[arr.length - 1];

            // 가장 작은 수 구하기
            int min = arr[0];
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        
            // answer에 가장 작은 수 빼고 채우기
            int count = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == min) continue;
                answer[count++] = arr[i];
            } 
                      
        return answer;
        } // if-else

    } // solution
       
} // end class

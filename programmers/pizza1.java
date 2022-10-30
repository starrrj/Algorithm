/* 
문제 설명
머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 
모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

제한사항
1 ≤ n ≤ 100

*/
class Solution {
    public int solution(int n) {
        
        // 7로 나누었을 때 나머지가 0이면, 첫번째 연산의 값을, 0이 아니면 두번째 연산의 값을 answer에 대입
        int answer = (n%7==0) ?  n/7 : (n/7)+1;

        return answer;
    }
}

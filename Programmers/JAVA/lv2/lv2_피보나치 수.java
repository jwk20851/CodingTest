https://programmers.co.kr/learn/courses/30/lessons/12945

class Solution {
    public int solution(int n) {
        int answer = 0;
        int num1 = 0, num2 = 1, sum = 0, cnt = 0;
        
        while(cnt < n){
            sum = num1 + num2;
            num2 = num1%1234567;
            num1 = sum%1234567;
            cnt++;
        }
        
        answer = sum%1234567;
        
        return answer;
    }
}
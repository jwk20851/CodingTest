https://programmers.co.kr/learn/courses/30/lessons/86051?language=java

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 45;
        
        for(int i : numbers){
            sum -= i;
        }
        answer = sum;
        
        return answer;
    }
}
https://programmers.co.kr/learn/courses/30/lessons/12940

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = n*m;
        int temp = 1;
        while(temp != 0){
            temp = m%n;
            m = n;
            n = temp;
        }
        
        answer[0] = m;
        answer[1] = gcd/m;
        
        return answer;
    }
}
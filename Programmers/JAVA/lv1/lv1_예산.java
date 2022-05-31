https://programmers.co.kr/learn/courses/30/lessons/12982?language=java

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        int sum = 0;
        
        for(int i : d){
            sum += i;
            answer++;
            if(sum > budget){
                answer--;
                break;
            }
        }
        
        return answer;
    }
}
//https://school.programmers.co.kr/learn/courses/30/lessons/181188

import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        
        int left = targets[0][1];
        answer++;
        
        for(int[] arr : targets){
            if(left <= arr[0]){
                left = arr[1];
                System.out.println(left);
                answer++;
            }
        }
        
        return answer;
    }
}
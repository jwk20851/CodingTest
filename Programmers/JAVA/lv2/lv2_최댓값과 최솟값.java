https://programmers.co.kr/learn/courses/30/lessons/12939

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split(" ");
        int[] intArr = new int[sArr.length];
        int idx = 0;
        for(String i : sArr){
            intArr[idx++] = Integer.parseInt(i);
        }
        Arrays.sort(intArr);
        
        answer = Integer.toString(intArr[0]) + " " + Integer.toString(intArr[intArr.length-1]);
        
        return answer;
    }
}
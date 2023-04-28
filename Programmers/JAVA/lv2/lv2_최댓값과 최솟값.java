//https://programmers.co.kr/learn/courses/30/lessons/12939

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, num = 0;
        for(int i = 0; i < arr.length; i++){
            num = Integer.parseInt(arr[i]);
            
            if(min >= num)
                min = num;
            
            if(max <= num)
                max = num;
        }
        
        answer += min+" "+max;
        
        return answer;
    }
}
/*
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
*/
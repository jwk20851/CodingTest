https://programmers.co.kr/learn/courses/30/lessons/12910

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Arrays.sort(arr);
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0){
                array.add(arr[i]);
            }
        }
        
        if(array.isEmpty())
            array.add(-1);
        
        answer = new int[array.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}
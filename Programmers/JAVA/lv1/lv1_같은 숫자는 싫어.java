https://programmers.co.kr/learn/courses/30/lessons/12906

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int temp = -1;
        
        for(int i : arr){
            if(i != temp)
                arrList.add(i);
            temp = i;
        }
        
        answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++){
            answer[i]=arrList.get(i);
        }
        
        return answer;
    }
}
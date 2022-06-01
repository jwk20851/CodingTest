https://programmers.co.kr/learn/courses/30/lessons/68935

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num = n;
        int temp = 0;
        while(num > 0){
            temp = num%3;
            arr.add(temp);
            num /= 3;
        }
        //System.out.println(arr.toString());
        
        for(int i = 0; i < arr.size(); i++){
            answer += arr.get(i) * Math.pow(3, arr.size()-i-1);
        }
        
        return answer;
    }
}
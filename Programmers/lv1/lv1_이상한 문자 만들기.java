https://programmers.co.kr/learn/courses/30/lessons/12930

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int count = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ")){
                count = 0;
            }
            else if (count%2 == 0){
                str[i] = str[i].toUpperCase();
                count++;
            }
            else{
                str[i] = str[i].toLowerCase();
                count++;
            }
            answer += str[i];
        }
        
        return answer;
    }
}
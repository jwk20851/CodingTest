https://programmers.co.kr/learn/courses/30/lessons/42576

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i]))
                break;
        }
               
        return participant[i];
    }
}
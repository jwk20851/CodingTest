https://programmers.co.kr/learn/courses/30/lessons/12915

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        
        int index = 0;
        for(int i = 97; i <= 122; i++){					//97~122:a~z, 65~90:A~Z
            for(int j = 0; j < strings.length; j++){
                if(strings[j].charAt(n) == (char)i){
                    answer[index] = strings[j];
                    index++;
                }   
            }    
        }
        
        return answer;
    }
}
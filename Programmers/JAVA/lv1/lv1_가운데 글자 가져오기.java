https://programmers.co.kr/learn/courses/30/lessons/12903

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int sLeng = s.length();
        if(sLeng%2 == 0)
            answer = s.substring(sLeng/2 - 1, sLeng/2 + 1);
        else
            answer = s.substring(sLeng/2, sLeng/2 + 1);
      
        return answer;
    }
}
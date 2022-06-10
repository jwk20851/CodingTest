https://programmers.co.kr/learn/courses/30/lessons/12951

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] temp = s.toLowerCase().split("");
        boolean space = true;
        for(String ch : temp){
            if(space == true)
                answer += ch.toUpperCase();
            else
                answer += ch;
            
            space = false;
            if(ch.equals(" "))
                space = true;
        }
        
        return answer;
    }
}
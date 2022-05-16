https://programmers.co.kr/learn/courses/30/lessons/12916

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        char c = ' ';
        
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            
            if(c == 'p'||c == 'P')
                p++;
            else if(c == 'y' ||c == 'Y')
                y++;
        }
        
        if(p==y)
            answer = true;
        else
            answer = false;

        return answer;
    }
}
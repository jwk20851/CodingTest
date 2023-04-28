//https://school.programmers.co.kr/learn/courses/30/lessons/70129

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0, zero = 0, length = 0;
        while(!s.equals("1")){
            length = s.length();
            s = s.replaceAll("0", "");
            zero += length-s.length();
            
            s = Integer.toBinaryString(s.length());
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
}
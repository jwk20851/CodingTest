https://programmers.co.kr/learn/courses/30/lessons/12922

class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 1; i <= n; i++){
            answer += (i%2 != 0)? "¼ö" : "¹Ú";
        }
        return answer;
    }
}
https://programmers.co.kr/learn/courses/30/lessons/12901?language=java

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int tmp = 0;
        
        for(int i = 1; i < a; i++){
            if(i == 2)
                tmp += 29;
            else if(i == 4 || i == 6 || i == 9 || i == 11)
                tmp += 30;
            else
                tmp += 31;
        }
        tmp += b - 1;
        answer = days[(tmp+5)%7];   //배열 안에서 계산 시 런타임 에러
        
        return answer;
    }
}
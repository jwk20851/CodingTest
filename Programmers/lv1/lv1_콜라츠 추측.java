https://programmers.co.kr/learn/courses/30/lessons/12943?language=java

class Solution {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        
        while(num != 1){
            count++;
            if(count != 500){
                num = num%2==0 ? num/2 : num*3+1;   
            }
            else {
                count = -1;
                break;
            }
        }
        answer = count;
        
        return answer;
    }
}
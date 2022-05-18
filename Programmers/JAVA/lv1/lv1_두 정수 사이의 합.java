https://programmers.co.kr/learn/courses/30/lessons/12912

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;
        int tmp = 0;
        
        if(b < a){
            tmp = a;
            a = b;
            b = tmp;
        }
        
        for(int i = a; i <= b; i++){
            sum += i;
        }
        answer = sum;
        
        return answer;
    }
}
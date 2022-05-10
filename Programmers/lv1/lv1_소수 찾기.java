https://programmers.co.kr/learn/courses/30/lessons/12921

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean check[] = new boolean[n+1]; //에라토스테네스의 채
        
        for(int i = 2; i <= n; i++){
            if(check[i] == true)
                continue;

            for(int j = i+i; j <= n; j += i){
                check[j] = true;
            }
        }
        
        for(int i = 2; i <= n; i++){
            if(check[i] == false) 
                answer++;
        }

        return answer;
    }
}
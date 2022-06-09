https://programmers.co.kr/learn/courses/30/lessons/12953?language=java

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int gcd = 0;
        for(int i = 1; i < arr.length; i++){
            gcd = Euclid(answer, arr[i]);
            answer = answer*arr[i] / gcd;   //LCM
        }
        
        return answer;
    }
    
    static int Euclid(int a, int b){
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        int tmp = 0;
        
        while(x%y != 0){
            tmp = x%y;
            x = y;
            y = tmp;
        }
        
        return y;
    }
}
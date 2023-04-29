//https://school.programmers.co.kr/learn/courses/30/lessons/68646

class Solution {
    public int solution(int[] a) {
        if(a.length == 1){
            return 1;
        }

        int answer = 2;
        int l = a[0];
        int r = a[a.length - 1];
        for(int i = 1; i < a.length-1; i++){
            if(a[i] < l){
                l = a[i];
                answer++;
            }
            if(a[a.length-1-i] < r){
                r = a[a.length-1-i];
                answer++;
            }
            
            if(l == r){
                answer--;
                break;
            }
        }
        
        return answer;
    }
}
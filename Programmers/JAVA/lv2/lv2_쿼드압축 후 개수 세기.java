//https://school.programmers.co.kr/learn/courses/30/lessons/68936

class Solution {
    int zero = 0, one = 0, cnt= 0;
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        quad(arr,0,0,arr.length);
        
        answer[0] = zero;
        answer[1] = one;
        return answer;
    }
    
    void quad(int[][] arr, int x, int y, int n){
        boolean check = true;
        
        loop:
        for(int i = x; i < x + n; i++){
            for(int j = y; j < y + n; j++){
                if(arr[i][j] != arr[x][y]){
                    check = false;
                    break loop;
                }
            }
        }
        
        if(check){
            if(arr[x][y] == 0)
                zero++;
            else
                one++;
            
            return;
        }
        
        quad(arr, x, y, n/2);
        quad(arr, x+n/2, y, n/2);
        quad(arr, x, y+n/2, n/2);
        quad(arr, x+n/2, y+n/2, n/2);
    }
}
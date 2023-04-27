//https://school.programmers.co.kr/learn/courses/30/lessons/68645

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        
        int[][] arr = new int[n][n];
        int x = -1, y = 0;
        int cnt = 1;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i%3 == 0)
                    x++;
                else if(i%3 == 1)
                    y++;
                else if(i%3 == 2){
                    x--;
                    y--;
                }
                
                arr[x][y] = cnt++;
            }
        }
        
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                answer[idx++] = arr[i][j];
            }
        }
        
        return answer;
    }
}
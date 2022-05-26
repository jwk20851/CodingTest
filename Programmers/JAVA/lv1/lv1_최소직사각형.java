https://programmers.co.kr/learn/courses/30/lessons/86491?language=java

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row = 0, col = 0, tmp = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(row < sizes[i][0]) row = sizes[i][0];
            if(col < sizes[i][1]) col = sizes[i][1];
        }
        
        answer = row * col;
        
        return answer;
    }
}
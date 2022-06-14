https://programmers.co.kr/learn/courses/30/lessons/12946

class Solution {
    static int[][] answer;
    static int idx = 0;
    
    public int[][] solution(int n) {
        answer = new int[(int)(Math.pow(2, n)-1)][2];
        hanoi(1, 2, 3, n);
        
        return answer;
    }
    
    public static void hanoi(int from, int other, int to, int n){
        if(n == 0)
            return;
        hanoi(from, to, other, n-1);
        answer[idx][0] = from;
        answer[idx++][1] = to;
        hanoi(other, from, to, n-1);
    }
}
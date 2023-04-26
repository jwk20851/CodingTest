//https://school.programmers.co.kr/learn/courses/30/lessons/64061?language=java

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int answer = 0;
        for(int i : moves){
            for(int j = 0; j < board.length; j++){
                if(board[j][i-1] == 0)
                    continue;
                
                if(st.peek() == board[j][i-1]){
                    st.pop();
                    answer += 2;
                }
                else{
                    st.push(board[j][i - 1]);
                }
                
                board[j][i-1] = 0;
                break;
            }
        }
        
        return answer;
    }
}
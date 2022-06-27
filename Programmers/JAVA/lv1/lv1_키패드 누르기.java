https://programmers.co.kr/learn/courses/30/lessons/67256?language=java

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 10, right = 12;
        for(int n : numbers){
            if(n == 1 || n == 4 || n == 7){
                answer += "L";
                left = n;
            }
            else if(n == 3 || n == 6 || n == 9){
                answer += "R";
                right = n;
            }
            else{
                if(n == 0)
                    n = 11;
                
                int leftLength = Math.abs(n-left)/3 + Math.abs(n-left)%3;
                int rightLength = Math.abs(n-right)/3 + Math.abs(n-right)%3;
                if(leftLength > rightLength){
                    answer += "R";
                    right = n;
                }
                else if(leftLength < rightLength){
                    answer += "L";
                    left = n;
                }
                else{
                    if(hand.equals("left")){
                        answer += "L";
                        left = n;
                    }
                    else{
                        answer += "R";
                        right = n;
                    }
                }
            }
        }
        
        return answer;
    }
}
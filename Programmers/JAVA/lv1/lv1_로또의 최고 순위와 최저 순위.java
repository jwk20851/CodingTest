https://programmers.co.kr/learn/courses/30/lessons/77484

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match_num = 0;
        
        for(int i : lottos){
            if( i == 0 ){
                zero++;
            }
            else{
                for(int j : win_nums){
                    if(i == j){
                        match_num++;
                    }
                }
            }
        }
        
        int low = match_num;
        int high = zero+match_num;
        
        int[] answer = {getGrade(high),getGrade(low)};
        return answer;
    }
    
    public int getGrade(int n){
        switch(n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}
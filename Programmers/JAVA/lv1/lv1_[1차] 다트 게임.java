https://programmers.co.kr/learn/courses/30/lessons/17682

import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int idx = 0, n = 0;
        
        String sum = "";
        char c = ' ';
        for(int i = 0; i < dartResult.length(); i++){
            c = dartResult.charAt(i);
            
            if(c >= '0' && c <= '9'){       
                sum += String.valueOf(c);
            }

            else if(c == 'S'||c == 'D'||c == 'T'){
                n = Integer.parseInt(sum);
                switch(c){
                    case 'S':
                        score[idx] = (int)Math.pow(n,1);
                        break;
                    case 'D':
                        score[idx] = (int)Math.pow(n,2);
                        break;
                    case 'T':
                        score[idx] = (int)Math.pow(n,3);
                        break;
                }
                idx++;
                sum = "";
            }
            else {
                if(c == '*'){
                    score[idx-1] *= 2;
                    if(idx-2 >= 0)
                        score[idx-2] *= 2; 
                }
                else if(c == '#'){
                    score[idx-1] *= (-1);
                }
            }
        }
    
        for(int i : score){
            answer += i;
        }
    
        return answer;
    }
}
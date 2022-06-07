https://programmers.co.kr/learn/courses/30/lessons/42840

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        
        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2,4,2,5};
        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0; i < answers.length; i++){
            if(stu1[i%stu1.length] == answers[i]) score[0]++;
            if(stu2[i%stu2.length] == answers[i]) score[1]++;
            if(stu3[i%stu3.length] == answers[i]) score[2]++;
        }

        int max = Math.max(Math.max(score[0],score[1]),score[2]);

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == score[0]) list.add(1);
        if(max == score[1]) list.add(2);
        if(max == score[2]) list.add(3);

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
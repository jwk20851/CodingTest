https://programmers.co.kr/learn/courses/30/lessons/68644

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j <numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if(list.indexOf(sum) == -1)
                   list.add(sum);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
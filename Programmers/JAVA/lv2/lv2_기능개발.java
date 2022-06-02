https://programmers.co.kr/learn/courses/30/lessons/42586?language=java

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        double day = 0;
        for(int i = 0; i < progresses.length; i++){
            day = (100 - progresses[i])/(double)speeds[i];
            queue.add((int)Math.ceil(day));     //Math.ceil: 올림
        }
        //System.out.println("초기 큐 : " + queue);
        
        List<Integer> list = new ArrayList<>();
        
        int temp = queue.peek();
        int count = 0;
        int queueSize = queue.size();
        for(int i = 0; i < queueSize; i++){
            if(temp >= queue.peek()){
                count++;
                queue.poll();
                if(queue.peek() == null)
                    list.add(count);
            } else if(temp < queue.peek()){
                list.add(count);
                count = 1;
                temp = queue.poll();
                if(queue.peek() == null)
                    list.add(count);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
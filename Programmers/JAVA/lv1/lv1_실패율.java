https://programmers.co.kr/learn/courses/30/lessons/42889

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {            //런타임 에러 발생, 추후 재확인
        int[] answer = new int[N];
        double[] result = new double[N];
        
        Arrays.sort(stages);
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i : stages)
            queue.add(i);
                
        int calSize = queue.size();
        double cnt = 0.0, sum = 0.0;
        int fail = 1, idx = 0;
        while(queue.peek() != null){
            if(fail == queue.peek()){
                queue.poll();
                cnt++;
                
                if(queue.peek() == null){
                    for(double i : result){
                        sum += i;
                    }
                    if(sum == 0.0)
                        result[idx++] = (double)cnt/calSize;
                }
            }
            else if(fail < queue.peek()){
                result[idx++] = (double)cnt/calSize;
                calSize -= cnt;
                fail++;
                cnt = 0.0;
            }
        }
        
        Double[] resultIdx = new Double[result.length];
        idx = 0;
        for(double d : result)
            resultIdx[idx++] = d;
        
        Arrays.sort(resultIdx);
        idx = 0;
        for(int i = resultIdx.length - 1; i >= 0; i--){
            for(int j = 0; j < result.length; j++){
                if(result[j] == resultIdx[i] && answer[idx] == 0){
                    answer[idx++] = j+1;
                    break;
                }
            }
        }
        
        for(int i = answer.length-1; i > 0; i--){
            if(answer[i] == answer[i-1]){
                answer[i]++;
            }
        }       //배열 내 중복값이 없을 때까지 반복돼야함
        
        return answer;
    }
}
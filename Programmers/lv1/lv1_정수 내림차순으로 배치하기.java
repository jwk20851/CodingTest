https://programmers.co.kr/learn/courses/30/lessons/12933

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        String tmp = String.join("",arr);   //���� ���� �迭�� ���ڿ��� ��ȯ
        answer = Long.parseLong(tmp);
        //System.out.println((answer));
        return answer;
    }
}
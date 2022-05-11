https://programmers.co.kr/learn/courses/30/lessons/12933

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        String tmp = String.join("",arr);   //띄어쓰기 없이 배열을 문자열로 변환
        answer = Long.parseLong(tmp);
        //System.out.println((answer));
        return answer;
    }
}
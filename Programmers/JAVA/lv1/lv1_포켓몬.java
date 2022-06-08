https://programmers.co.kr/learn/courses/30/lessons/1845

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] mon = new int[200001];
        
        for(int i = 0; i < nums.length; i++){
            if(mon[nums[i]] == 0)
                answer++;
            mon[nums[i]]++;
        }
        
        if(answer > nums.length/2)
            answer = nums.length/2;
        
        return answer;
    }
}
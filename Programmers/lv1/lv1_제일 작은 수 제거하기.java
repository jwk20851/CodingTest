https://programmers.co.kr/learn/courses/30/lessons/12935

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        
        int answer[] = new int[arr.length-1];
        int count = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != min){
                answer[count]=arr[j];
                count++;
            }
            else
                continue;
        }
        
        return answer;
    }
}
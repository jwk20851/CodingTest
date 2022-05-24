https://programmers.co.kr/learn/courses/30/lessons/17681

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String str = "";
        
        for(int i = 0; i < n; i++){
            str = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            while(str.length() != n){
                str = "0" + str;
            }
            
            str = str.replaceAll("1" , "#");
            str = str.replaceAll("0" , " ");
            answer[i] = str;
        }
        
        return answer;
    }
}
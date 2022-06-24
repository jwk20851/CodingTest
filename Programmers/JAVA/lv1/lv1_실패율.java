https://programmers.co.kr/learn/courses/30/lessons/42889

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] check = new int[N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i+1)
                    check[i]++;
            }
        }
        
        double[] result = new double[N];
        int st_leng = stages.length;
        for(int i = 0; i < check.length; i++){
            result[i] = (st_leng == 0)? 0 : (double)check[i]/st_leng;
            st_leng -= check[i];
        }
        
        double max = result[0];
        int target = 1;
        for(int i = 0; i < result.length; i++){
            max = result[0];
            target = 1;
            for(int j = 0; j < result.length; j++){
                if(max < result[j]){
                    max = result[j];
                    target = j+1;
                }
            }
            result[target-1] = -1;
            answer[i] = target;
        }
        
        return answer;
    }
}
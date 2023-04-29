//https://school.programmers.co.kr/learn/courses/30/lessons/77885

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                answer[i] = numbers[i]+1;
            }
            else{
                String bin = Long.toBinaryString(numbers[i]);
                
                if(!bin.contains("0")){
                    bin = "10" + bin.substring(1);
                }
                else{
                    for(int j = bin.length()-1; j >= 0; j--){
                        if(bin.charAt(j)=='0'){
                            bin = bin.substring(0,j) +"10"+ bin.substring(j+2);
                            break;
                        }
                    }
                }
                
                answer[i] = Long.parseLong(bin, 2);
            }
        }
        
        return answer;
    }
}
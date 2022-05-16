https://programmers.co.kr/learn/courses/30/lessons/12919

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "±è¼­¹æÀº " + i + "¿¡ ÀÖ´Ù";
                break;
            }
        }
                
        return answer;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/76502

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            answer += check(s)? 1:0;
            
            s = s.substring(1, s.length()) + s.charAt(0);
        }
        
        return answer;
    }
    
    private boolean check(String s){
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            try{
                switch(s.charAt(i)){
                    case '[': 
                        st.add('[');
                        break;
                    case ']':
                        if(st.peek() != '[')
                            return false;
                        st.pop();
                        break;
                    case '{': 
                        st.add('{');
                        break;
                    case '}':
                        if(st.peek() != '{')
                            return false;
                        st.pop();
                        break;
                    case '(': 
                        st.add('(');
                        break;
                    case ')':
                        if(st.peek() != '(')
                            return false;
                        st.pop();
                        break;
                }
            } catch(Exception e){
                return false;
            }
        }
        
        return st.isEmpty()? true:false;
    }
}
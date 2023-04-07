//https://www.acmicpc.net/problem/2504

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> st = new Stack<>();
        
        int num = 1, sum = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            
            if(c=='(' || c=='['){
                st.push(c);
                num *= (c=='(')? 2:3;
            }
            else if(c==')'){
                if(st.isEmpty() || st.peek()!='('){
                    System.out.print(0);
                    System.exit(0);
                }
                else if(str.charAt(i-1)=='(')
                    sum += num;
                    
                st.pop();
                num /= 2;
            }
            else if(c==']'){
                if(st.isEmpty() || st.peek()!='['){
                    System.out.print(0);
                    System.exit(0);
                }
                else if(str.charAt(i-1)=='[')
                    sum += num;
                    
                st.pop();
                num /= 3;
            }
        }
        
        System.out.print(st.isEmpty()? sum:0);
    }
}
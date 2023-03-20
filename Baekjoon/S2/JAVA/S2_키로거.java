//https://www.acmicpc.net/problem/5397

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> left, right;
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0){
		    String str = br.readLine();
		    
		    left = new Stack<Character>();
		    right = new Stack<Character>();
		    
		    char ch = ' ';
		    for(int i = 0; i < str.length(); i++){
		        ch = str.charAt(i);
		        switch(ch){
		            case '<':
		                if(!left.isEmpty())
		                    right.push(left.pop());
		                break;
		            case '>':
		                if(!right.isEmpty())
		                    left.push(right.pop());
		                break;
	                case '-':
		                if(!left.isEmpty())
		                    left.pop();
		                break;
		            default:    
		                left.push(ch);
		                break;
		        }
		    }
		    
	        while(!left.isEmpty())
		        right.push(left.pop());
		    
		    String ans = "";
		    while(!right.isEmpty())
                sb.append(right.pop());
		    sb.append(ans+"\n");
		}
		
		System.out.print(sb);
	}
}
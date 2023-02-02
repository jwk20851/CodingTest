//https://www.acmicpc.net/problem/3986

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    String str = br.readLine();
		    if(str.length()%2 != 0)
		        continue;
		        
		    cnt += Check(str);
		}
		
		System.out.print(cnt);
	}
	
	static int Check(String str){
	    Stack<Character> st = new Stack<>();
	    st.push(str.charAt(0));
	    
	    for(int i = 1; i < str.length(); i++){
	        char tmp = str.charAt(i);
	        if(st.size() > 0 && st.peek() == tmp)
	            st.pop();
	        else
	            st.push(tmp);
	    }
	    
        if(st.isEmpty())
            return 1;
        else
            return 0;
	}
}
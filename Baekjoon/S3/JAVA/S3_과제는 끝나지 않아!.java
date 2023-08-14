//https://www.acmicpc.net/problem/17952

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		Stack<Homework> stack = new Stack<>();
		int total = 0;
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    int tmp = Integer.parseInt(st.nextToken());
		    if(tmp == 1){
		        int s = Integer.parseInt(st.nextToken());
		        int m = Integer.parseInt(st.nextToken());
		        if(m == 1)
		            total += s;
		        else
		            stack.push(new Homework(s, m-1));
		    }
		    else{
		        if(stack.isEmpty())
		            continue;
		            
	            Homework hw = stack.pop();
	            hw.min--;
	            if(hw.min == 0)
                    total += hw.score;
                else 
                    stack.push(hw);
		    }
		}
		
		System.out.print(total);
    }
    
    static class Homework{
        int score, min;
        
        public Homework(int score, int min){
            this.score = score;
            this.min = min;
        }
    }
}
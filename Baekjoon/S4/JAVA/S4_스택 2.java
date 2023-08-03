//https://www.acmicpc.net/problem/28278

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
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while(N-- > 0){
            st = new StringTokenizer(br.readLine());
            switch(Integer.parseInt(st.nextToken())){
                case 1:
    				stack.push(Integer.parseInt(st.nextToken()));
    				break;
    			case 2:
                    sb.append(stack.isEmpty()? -1 : stack.pop()).append("\n");
    				break;
    			case 3:
    				sb.append(stack.size()).append("\n");
    				break;
    			case 4:
    				sb.append(stack.isEmpty()? 1 : 0).append("\n");
    				break;
    			case 5:
    				sb.append(stack.isEmpty()? -1 : stack.peek()).append("\n");
    				break;
            }
        }
        
        System.out.print(sb);
	}
}
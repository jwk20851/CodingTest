//https://www.acmicpc.net/problem/28279

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
    private static final int NONE = -1;
    private static Deque<Integer> dq;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dq = new ArrayDeque<>();
		while(N-- > 0){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    cmd(st, Integer.parseInt(st.nextToken()));
		}
		
        System.out.print(sb);
    }
    
    private static void cmd(StringTokenizer st, int n){
        switch(n){
            case 1:
                dq.addFirst(Integer.parseInt(st.nextToken()));
                break;
            case 2:
                dq.addLast(Integer.parseInt(st.nextToken()));
                break;
            case 3:
                sb.append(dq.isEmpty()? NONE : dq.pollFirst()).append("\n");
                break;
            case 4:
                sb.append(dq.isEmpty()? NONE : dq.pollLast()).append("\n");
                break;
            case 5:
                sb.append(dq.size()).append("\n");
                break;
            case 6:
                sb.append(dq.isEmpty()? 1 : 0).append("\n");
                break;
            case 7:
                sb.append(dq.isEmpty()? NONE : dq.peekFirst()).append("\n");
                break;
            case 8:
                sb.append(dq.isEmpty()? NONE : dq.peekLast()).append("\n");
                break;
        }
    }
}
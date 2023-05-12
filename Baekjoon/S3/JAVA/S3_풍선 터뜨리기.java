//https://www.acmicpc.net/problem/2346

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] balloon = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			balloon[i] = Integer.parseInt(st.nextToken());
			
		Deque<Paper> dq = new ArrayDeque<Paper>();
		for(int i = 1; i < N; i++)
			dq.add(new Paper(i+1, balloon[i]));
			
		int tmp = balloon[0];
		StringBuilder sb = new StringBuilder();
		sb.append("1 ");
		while(!dq.isEmpty()){
			if(tmp > 0){
				for(int i = 1; i < tmp; i++)
					dq.add(dq.poll());
				
				Paper p = dq.poll();
				tmp = p.value;
				sb.append(p.idx+" ");
			}
			else{
				for(int i = 1; i < Math.abs(tmp); i++)
					dq.addFirst(dq.pollLast());
				
				Paper p = dq.pollLast();
				tmp = p.value;
				sb.append(p.idx+" ");
			}
		}
		
		System.out.print(sb);
	}
    
	private static class Paper{
	    int idx, value;
	    
	    Paper(int idx, int value){
	        this.idx = idx;
	        this.value = value;
	    }
	}
}
//https://www.acmicpc.net/problem/13335

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] truck = new int[n];
		for(int i = 0; i < n; i++)
		    truck[i] = Integer.parseInt(st.nextToken());
		
		Queue<Integer> bridge = new LinkedList<Integer>();
		for(int i = 0; i < w; i++)
			bridge.offer(0);
		
		int cnt = 0, idx = 0, weight = 0;
		while(!bridge.isEmpty()){
		    while(idx < n){
				weight -= bridge.poll();
		        if(weight+truck[idx] <= L){
					bridge.offer(truck[idx]);
					weight += truck[idx++];
				}
				else
					bridge.offer(0);
				
		        cnt++;
		    }
		    
		    bridge.poll();
		    cnt++;
		}
        
        System.out.println(cnt);
	}
}
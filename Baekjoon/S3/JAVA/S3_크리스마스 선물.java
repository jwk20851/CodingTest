//https://www.acmicpc.net/problem/14235

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = 0, tmp = 0;
		while(n-- > 0){
		    st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			if(a == 0)
			    sb.append(pq.isEmpty()? "-1\n" : pq.poll()+"\n");
			else{
				while(a-- > 0){
				    tmp = Integer.parseInt(st.nextToken());
				    pq.offer(tmp);
				}
			}
		}
		
		System.out.print(sb);
	}
}
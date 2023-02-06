//https://www.acmicpc.net/problem/2075

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < n; j++)
		        pq.offer(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 0; i < n-1; i++) 
            pq.remove();
		
		System.out.println(pq.poll());
	}
}
//https://www.acmicpc.net/problem/1417

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    if(N == 1){
	        System.out.println(0);
	        System.exit(0);
	    }
	    
	    int ds = Integer.parseInt(br.readLine());
	    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	    for(int i = 0; i < N-1; i++)
	        pq.add(Integer.parseInt(br.readLine()));
	    
	    int cnt = 0;
	    while(true){
	        int tmp = pq.poll();
	        if(ds > tmp)
	            break;
	        
	        pq.add(tmp-1);
	        ds++;
	        cnt++;
	    }
	    
	    System.out.print(cnt);
	}
}
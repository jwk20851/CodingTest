//https://www.acmicpc.net/problem/15903

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            pq.offer(Long.parseLong(st.nextToken()));
        
        for(int i = 0; i < m; i++){
            long num1 = pq.poll();
            long num2 = pq.poll();
            pq.offer(num1+num2);
            pq.offer(num1+num2);
        }
        
        long sum = 0;
        for(long a : pq)
            sum += a;
        
        System.out.print(sum);
    }
}
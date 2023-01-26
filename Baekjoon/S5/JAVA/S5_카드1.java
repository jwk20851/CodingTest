//https://www.acmicpc.net/problem/2161

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++)
            q.add(i);
        
        StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
		    sb.append(q.poll()+" ");
		    q.add(q.poll());
		}
		
		System.out.print(sb);
	}
}
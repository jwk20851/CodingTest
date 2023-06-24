//https://www.acmicpc.net/problem/1138

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] h = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++)
		    h[i] = Integer.parseInt(st.nextToken());
		
		List<Integer> li = new ArrayList<Integer>();
		for(int i = N; i >= 1; i--)
		    li.add(h[i], i);
        
        for(int ans : li)
		    System.out.print(ans+" ");
	}
}
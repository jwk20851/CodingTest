//https://www.acmicpc.net/problem/24480

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    private static List<List<Integer>> li;
    private static int[] order;
    private static int cnt = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        li = new ArrayList<>();
        for(int i = 0; i <= N; i++)
            li.add(new ArrayList<Integer>());
        
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            li.get(u).add(v);
            li.get(v).add(u);
        }
        
        for(int i = 1; i <= N; i++)
			Collections.sort(li.get(i), Collections.reverseOrder());
		
		order = new int[N+1];
		DFS(R);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++)
			sb.append(order[i]+"\n");
		
        System.out.print(sb);
	}
	
	private static void DFS(int r){
	    order[r] = ++cnt;
	    for(int i = 0; i < li.get(r).size(); i++){
			int tmp = li.get(r).get(i);
			if(order[tmp] == 0)
				DFS(tmp);
		}
		
		return;
	}
}
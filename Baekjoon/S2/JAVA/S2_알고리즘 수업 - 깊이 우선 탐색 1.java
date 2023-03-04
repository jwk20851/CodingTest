//https://www.acmicpc.net/problem/24479

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    static List<List<Integer>> li;
    static int[] check;
    static int cnt = 1;
    
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
			Collections.sort(li.get(i));
		
		check = new int[N+1];
        DFS(R);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < check.length; i++)
			sb.append(check[i]).append("\n");
		
        System.out.print(sb);
	}
	
	static void DFS(int r){
	    check[r] = cnt;
	    
	    for(int i = 0; i < li.get(r).size(); i++){
			int tmp = li.get(r).get(i);
			if(check[tmp] == 0){
				cnt++;
				DFS(tmp);
			}
		}
	}
}
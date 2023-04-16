//https://www.acmicpc.net/problem/24444

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int n = 0, m = 0;
    private static int[] visit;
    private static List<List<Integer>> li = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		visit = new int[N+1];
        for(int i = 0; i <= N; i++)
            li.add(new ArrayList<>());
            
		for(int i = 0; i < M; i++){
		    st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		
    		li.get(u).add(v);
    		li.get(v).add(u);
		}
		
		for(int i = 1; i <= N; i++)
            Collections.sort(li.get(i));
		
		BFS(R);
		
        StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++){
		    sb.append(visit[i]+"\n");
		}
		
		System.out.print(sb);
	}
	
	static void BFS(int idx){
	    Queue<Integer> q = new LinkedList<>();
	    int cnt = 1;
	    visit[idx] = cnt++;
	    q.add(idx);
	    
	    while(!q.isEmpty()){
	        int tmp = q.poll();
	        
	        for(int i = 0; i < li.get(tmp).size(); i++){
	            if(visit[li.get(tmp).get(i)] == 0){
	                visit[li.get(tmp).get(i)] = cnt++;;
	                q.add(li.get(tmp).get(i));
	            }
	        }
	    }
	}
}
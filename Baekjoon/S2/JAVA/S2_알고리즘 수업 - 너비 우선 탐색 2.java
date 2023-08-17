//https://www.acmicpc.net/problem/24445

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
    private static int N,M,R;
    private static List<List<Integer>> li;
    private static int[] ans;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		li = new ArrayList<>();
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
            Collections.sort(li.get(i), Collections.reverseOrder());
        
        ans = new int[N+1];
        visited = new boolean[N+1];
        BFS();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++)
            sb.append(ans[i]).append('\n');
        System.out.print(sb);
    }
    
    private static void BFS(){
        Queue<Integer> q = new LinkedList<>();
        q.add(R);
        visited[R] = true;
        
        int cnt = 0;
        while(!q.isEmpty()){
            int tmp = q.poll();
            ans[tmp] = ++cnt;
            
            for(int i = 0; i < li.get(tmp).size(); i++){
                int next = li.get(tmp).get(i);
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }
}
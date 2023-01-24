//https://www.acmicpc.net/problem/1325

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static ArrayList<ArrayList<Integer>> al = new ArrayList<>();;
    static boolean[] visit;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for(int i = 0; i <= n; i++)
            al.add(new ArrayList<>());
        
		for(int i = 0; i < m; i++){
		    st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());
		    al.get(b).add(a);
		}
		
		int[] ans = new int[n + 1];
		int max = 0;
        for(int i = 1; i <= n; i++){
            visit = new boolean[n + 1];
            ans[i] = BFS(i);
            max = Math.max(max, ans[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(ans[i] == max)
                sb.append(i+" ");
        }
        
        System.out.print(sb);
	}
	
	static int BFS(int x){
	    Queue<Integer> q = new LinkedList<>();
	    q.add(x);
	    
	    int cnt = 0;
	    visit[x] = true;
	    while(q.size() > 0){
	        int v = q.poll();
	        
	        for(int i : al.get(v)){
	            if(!visit[i]){
	                q.add(i);
	                visit[i] = true;
	                cnt++;
	            }
	        }
	    }
	    
	    return cnt;
	}
}
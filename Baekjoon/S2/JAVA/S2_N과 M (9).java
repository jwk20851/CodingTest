//https://www.acmicpc.net/problem/15663

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    private static int[] arr, ans;
    private static boolean[] visited;
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		visited = new boolean[N];
		ans = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        
        DFS(0);
		
		System.out.print(sb);
	}
	
	private static void DFS(int idx){
	    if(idx == M){
	        for(int i = 0; i < M; i++)
	            sb.append(ans[i]+" ");
	        sb.append("\n");
	        return;
	    }
	    
	    int before = 0;
	    for(int i = 0; i < N; i++){
	        if(visited[i])
	            continue;
	        
	        if(before == arr[i])
	            continue;
	            
	        visited[i] = true;
	        ans[idx] = arr[i];
	        before = arr[i];
	        DFS(idx+1);
	        visited[i] = false;
	    }
	}
}
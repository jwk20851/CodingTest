//https://www.acmicpc.net/problem/15664

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    private static int N, M;
    private static int[] arr, ans;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		for(int i = 0; i < N; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);

		visited = new boolean[N];
		ans = new int[M];
		DFS(0, 0);
		
		System.out.print(sb);
    }
    
    private static void DFS(int idx, int depth){
        if(depth == M){
			for(int i = 0; i < M; i++)
				sb.append(ans[i]+" ");
			sb.append("\n");
			
			return;
		}
		
		int before = -1;
		for(int i = idx; i < N; i++){
			int now = arr[i];
			if(visited[i] || before == now)
				continue;
			
			ans[depth] = now;
			before = now;
			visited[i] = true;
			DFS(i+1, depth+1);
			visited[i] = false;
		}
    }
}
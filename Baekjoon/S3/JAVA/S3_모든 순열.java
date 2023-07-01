//https://www.acmicpc.net/problem/10974

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    private static int N;
    private static int[] arr;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		visited = new boolean[N];
		
		DFS(0);
		
		System.out.print(sb);
	}
	
	private static void DFS(int depth){
	    if(depth == N){
	        for(int v : arr)
                sb.append(v+" ");
            sb.append("\n");
            return;
	    }
	    
	    for(int i = 0; i < N; i++){
	        if(!visited[i]){
	            visited[i] = true;
	            arr[depth] = i+1;
	            DFS(depth+1);
	            visited[i] = false;
	        }
	    }
	}
}
//https://www.acmicpc.net/problem/15666

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    private static int N, M;
	private static int[] arr;
	private static int[] result;
    private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		result = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		DFS(0, 0);
		
		System.out.print(sb);
	}
    
	private static void DFS(int idx, int depth){
	    if(depth == M){
	        for(int i = 0; i < M; i++)
	            sb.append(result[i]+" ");
            sb.append("\n");
            return;
	    }
	    
	    int tmp = 0;
		for(int i = idx; i < N; i++){
			if(tmp == arr[i])
			    continue;
			
			result[depth] = arr[i];
			DFS(i, depth+1);
			tmp = arr[i];
		}
	}
}
//https://www.acmicpc.net/problem/15665

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    private static int N, M;
    private static int[] arr, ans;
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
		
		ans = new int[M];
		Arrays.sort(arr);
		DFS(0);
		
		System.out.println(sb);
    }
    
    private static void DFS(int depth){
        if(depth == M){
            for(int i = 0; i < M; i++)
                sb.append(ans[i]+" ");
            sb.append("\n");
            
            return;
        }
        
        int before = 0;
        for(int i = 0; i < N; i++){
            if(before != arr[i]){
                before = arr[i];
                ans[depth] = arr[i];
                DFS(depth+1);
            }
        }
    }
}
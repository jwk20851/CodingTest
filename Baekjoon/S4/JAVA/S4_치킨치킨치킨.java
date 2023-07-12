//https://www.acmicpc.net/problem/16439

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N, M, ans = 0;
    private static int[][] chicken;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		chicken = new int[N][M];
		visited = new boolean[M];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < M; j++)
		        chicken[i][j] = Integer.parseInt(st.nextToken());
		}
		
		DFS(0,0);
		
		System.out.println(ans);
    }
    
    private static void DFS(int idx, int depth){
        if(depth == 3){
            int sum = 0;
            for(int i = 0; i < N; i++){
                int max = 0;
                for(int j = 0; j < M; j++){
                    if(visited[j])
                        max = Math.max(max, chicken[i][j]);
                }
                sum += max;
            }
            
            ans = Math.max(ans, sum);
        }
        
        for(int i = idx; i < M; i++){
            if(!visited[i]){
                visited[i] = true;
                DFS(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
}
//https://www.acmicpc.net/problem/15661

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N, min = Integer.MAX_VALUE, num = 0;
    private static int[][] map;
    private static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new boolean[N];
		for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(num = 1; num < N; num++)
			DFS(0, 0);
		
        System.out.println(min);
	}
	
	private static void DFS(int idx, int depth){
	    if(depth == num){
            check();
            return;
        }
	   
	    for(int i = idx; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                DFS(i+1, depth+1);
                visited[i] = false;
            }
        }
	}
	
	private static void check(){
        int start = 0, link = 0;
        for(int i = 0; i < N - 1; i++){
            for (int j = i + 1; j < N; j++){
                if(visited[i] && visited[j])
                    start += map[i][j]+map[j][i];
                else if(!visited[i] && !visited[j])
                    link += map[i][j]+map[j][i];
            }
        }
        
        min = Math.min(min, Math.abs(start-link));
        
        if(min == 0){
            System.out.println(min);
            System.exit(0);
        }
    }
}
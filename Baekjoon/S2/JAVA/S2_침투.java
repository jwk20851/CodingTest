//https://www.acmicpc.net/problem/13565

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int M, N;
    private static boolean check = false;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dr = {-1, 0, 1, 0};
    private static int[] dc = {0, -1, 0, 1};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
		for(int i = 0; i < M; i++){
		    String str = br.readLine();
		    for(int j = 0; j < N; j++)
		        map[i][j] = str.charAt(j)-'0';
		}
		
		visited = new boolean[M][N];
		for(int i = 0; i < N; i++){
		    if(check)
		        break;
		    if(!visited[0][i] && map[0][i] == 0)
		        DFS(0, i);
		}
		
        System.out.print(check? "YES":"NO");
    }
    
    private static void DFS(int r, int c){
        if(r == M-1){
            check = true;
            return;
        }
        
        visited[r][c] = true;
        for(int i = 0; i < 4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            if(nr<0 || nr>=M || nc<0 || nc>=N)
                continue;
            if(visited[nr][nc] || map[nr][nc] == 1)
                continue;
                
            DFS(nr, nc);
        }
    }
}
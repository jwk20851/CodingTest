//https://www.acmicpc.net/problem/14503

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N, M, ans = 1;
    private static int[][] map;
	private static int dr[] = {-1,0,1,0};
	private static int dc[] = {0,1,0,-1};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < M; j++)
		        map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		DFS(r, c, d);
		
		System.out.println(ans);
    }
    
    private static void DFS(int r, int c, int dir){
		map[r][c] = -1;
		
	    for(int i = 0; i < 4; i++){
			dir = (dir-1 >= 0)? dir-1 : 3;
			int nr = r + dr[dir];
			int nc = c + dc[dir];
			
			if(nr<0 || nc<0 || nr>=N || nc>=M)
			    continue;
			
			if(map[nr][nc] == 0){
				ans++;
				DFS(nr,nc, dir);
				return;
			}
		}
		
		int back = (dir+2) % 4;
		int br = r + dr[back];
		int bc = c + dc[back];
        
        if(br<0 || br>=N || bc<0 || bc>=M)
            return;
            
		if(map[br][bc] != 1)
			DFS(br,bc,dir);
    }
}
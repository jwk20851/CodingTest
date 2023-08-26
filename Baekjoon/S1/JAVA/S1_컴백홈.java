//https://www.acmicpc.net/problem/1189

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int R, C, K, ans = 0;
    private static char[][] map;
    private static boolean[][] visited;
    private static int[] dr = {1, 0, -1, 0};
    private static int[] dc = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		for(int i = 0; i < R; i++){
		    String str = br.readLine();
		    for(int j = 0; j < C; j++)
		        map[i][j] = str.charAt(j);
		}
		
		visited = new boolean[R][C];
		visited[R-1][0] = true;
		DFS(R-1, 0, 1);
		
		System.out.print(ans);
    }
    
    private static void DFS(int r, int c, int depth){
        if(r==0 && c==C-1){
			if(depth == K)
				ans++;
			return;
		}
		
		for(int i = 0; i < 4; i++){
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(nr<0 || nr>=R || nc<0 || nc>=C)
				continue;
			if(map[nr][nc] == 'T' || visited[nr][nc])
				continue;
				
			visited[nr][nc] = true;
			DFS(nr, nc, depth+1);
			visited[nr][nc] = false;
		}
    }
}
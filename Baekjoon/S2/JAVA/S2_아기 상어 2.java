//https://www.acmicpc.net/problem/17086

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int N,M, ans = 0;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < M; j++)
		        map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++){
		    for(int j = 0; j < M; j++){
		        if(map[i][j] == 0)
		            BFS(i,j);
		    }
		}
		
		System.out.print(ans);
    }
    
    private static void BFS(int x, int y){
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(x, y, 0));
        visited = new boolean[N][M];
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            Pos tmp = q.poll();
            x = tmp.x;
            y = tmp.y;
            int dis = tmp.d+1;
            for(int i = 0; i < 8; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx<0 || nx>=N || ny<0 || ny>=M)
                    continue;
                if(visited[nx][ny])
                    continue;
                    
                if(map[nx][ny] == 1){
                    ans = Math.max(ans, dis);
                    return;
                }
                
                visited[nx][ny] = true;
                q.add(new Pos(nx,ny,dis));
            }
        }
    }
    
    static class Pos{
        int x, y, d;
        public Pos(int x, int y, int d){
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
}
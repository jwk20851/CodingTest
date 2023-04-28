//https://www.acmicpc.net/problem/14940

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int n, m;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[][] ans;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        map = new int[n][m];
        visited = new boolean[n][m];
        ans = new int[n][m];
        
        int x = 0, y = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 0){
                    visited[i][j] = true;
                    continue; 
                }
                
                if(map[i][j] == 2){
                    x = i;
                    y = j;
                }
            }
        }
        
        BFS(x, y, 0);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sb.append((map[i][j]==1 && ans[i][j]==0)? "-1 " : ans[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
	
	private static void BFS(int x, int y, int depth){
	    Queue<Point> q = new LinkedList<>();
	    q.add(new Point(x,y,depth));
	    visited[x][y] = true;
	    
	    while(!q.isEmpty()){
	        Point tmp = q.poll();
	        x = tmp.x;
	        y = tmp.y;
	        depth = tmp.depth;
	        
	        for(int i = 0; i < 4; i++){
	            int nx = x+dx[i];
	            int ny = y+dy[i];
	            
	            if(nx<0 || ny<0 || nx>=n || ny>=m)
	                continue;
	            if(visited[nx][ny])
	                continue;
	                
	            ans[nx][ny] = depth+1;
	            q.add(new Point(nx,ny,depth+1));
	            visited[nx][ny] = true;
	        }
	    }
	}
	
	private static class Point{
	    int x,y,depth;
	    
	    Point(int x, int y, int depth){
	        this.x = x;
	        this.y = y;
	        this.depth = depth;
	    }
	}
}
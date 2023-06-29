//https://www.acmicpc.net/problem/14716

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int M, N, cnt = 0;
    private static int[][] banner;
    private static boolean[][] visited;
    private static int[] dx = {0, 1, 0, -1, 1, -1, 1, -1};
    private static int[] dy = {1, 0, -1, 0, 1, 1, -1, -1};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		banner = new int[M][N];
		visited = new boolean[M][N];
		for(int i = 0; i < M; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < N; j++)
		        banner[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				if(!visited[i][j] && banner[i][j]==1)
				    BFS(i,j);
			}
		}
		
		System.out.print(cnt);
	}
	
	private static void BFS(int x, int y){
	    Queue<Point> q = new LinkedList<Point>();
	    q.add(new Point(x,y));
	    visited[x][y] = true;
	    while(!q.isEmpty()){
	        Point tmp = q.poll();
	        x = tmp.x;
	        y = tmp.y;
	        
	        for(int i = 0; i < 8; i++){
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx<0 || ny<0 || nx>=M || ny>=N)
				    continue;
				if(banner[nx][ny] == 0)
				    continue;
				
				if(!visited[nx][ny] && banner[nx][ny]==1){
    				q.add(new Point(nx,ny));
    				visited[nx][ny] = true;
				}
			}
        }
        cnt++;
        
		return;
	}
	
	static class Point{
	    int x, y;
	    public Point(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	}
}
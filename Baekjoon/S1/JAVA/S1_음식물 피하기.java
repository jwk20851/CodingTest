//https://www.acmicpc.net/problem/1743

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int[][] foodWaste;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int N, M;
    
    private static class Point{
        int x,y;
        
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    int K = Integer.parseInt(st.nextToken());
		
		foodWaste = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
		    int x = Integer.parseInt(st.nextToken());
		    int y = Integer.parseInt(st.nextToken());
		    foodWaste[x][y] = 1;
		}
		
		int max = 0;
		for(int i = 1; i <= N; i++){
		    for(int j = 1; j <= M; j++){
		        if(!visited[i][j] && foodWaste[i][j] == 1)
		            max = Math.max(max, BFS(i,j));
		    }
		}
		
		System.out.print(max);
	}
	
	private static int BFS(int x, int y){
	    Queue<Point> q = new LinkedList<Point>();
	    q.add(new Point(x, y));
	    visited[x][y] = true;
	    
	    int cnt = 1;
	    while(!q.isEmpty()){
	        Point tmp = q.poll();
	        x = tmp.x;
	        y = tmp.y;

	        for(int i = 0; i < 4; i++){
	            int nx = x + dx[i];
	            int ny = y + dy[i];

	            if(nx<=0 || ny<=0 || nx>N || ny>M)
	                continue;
	            
	            if(!visited[nx][ny] && foodWaste[nx][ny] == 1){
    	            q.add(new Point(nx, ny));
    	            visited[nx][ny] = true;
    	            cnt++;
	            }
	        }
	    }
	    
	    return cnt;
	}
}
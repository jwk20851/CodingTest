//https://www.acmicpc.net/problem/1303

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int N, M;
    private static int[] soldier = new int[2];
    private static char[][] map;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());   //가로
		M = Integer.parseInt(st.nextToken());   //세로
		
		map = new char[M][N];
		visited = new boolean[M][N];
		for(int i = 0; i < M; i++){
		    String str = br.readLine();
		    for(int j = 0; j < N; j++)
		        map[i][j] = str.charAt(j);
		}
		
		for(int i = 0; i < M; i++){
		    for(int j = 0; j < N; j++){
		        if(!visited[i][j])
		            BFS(i,j);
		    }
		}
		
		System.out.print(soldier[0]+" "+soldier[1]);
	}
	
	private static void BFS(int x, int y){
	    Queue<Point> q = new LinkedList<Point>();
	    q.add(new Point(x,y));
	    visited[x][y] = true;
	    
	    char pre = map[x][y];
	    int idx = (pre=='W')? 0:1;
	    
	    int cnt = 1;
	    while(!q.isEmpty()){
	        Point tmp = q.poll();
	        x = tmp.x;
	        y = tmp.y;
	        
	        for(int i = 0; i < 4; i++){
	            int nx = x + dx[i];
	            int ny = y + dy[i];
	            
	            if(nx<0 || ny<0 || nx>=M || ny>=N)
	                continue;
	                
	            if(!visited[nx][ny] && pre==map[nx][ny]){
	                q.add(new Point(nx, ny));
	                visited[nx][ny] = true;
	                cnt++;
	            }
	        }
	    }
	    
	    soldier[idx] += Math.pow(cnt, 2);
	}
	
	private static class Point{
	    int x, y;
	    
	    Point(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	}
}
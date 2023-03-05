//https://www.acmicpc.net/problem/10026

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int N;
    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        visit = new boolean[N][N];
        
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++)
                map[i][j] = str.charAt(j);
        }
        
        int nCnt = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visit[i][j]){
                    BFS(i, j, map[i][j]);
                    nCnt++;
                }
            }
        }
        
        visit = new boolean[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 'R')
                    map[i][j] = 'G';
            }
        }
        
        int wCnt = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visit[i][j]){
                    BFS(i, j, map[i][j]);
                    wCnt++;
                }
            }
        }
        
        System.out.print(nCnt + " " + wCnt);
	}
	
	static void BFS(int x, int y, char c){
	    Queue<Point> q = new LinkedList<>();
	    q.add(new Point(x, y));
	    visit[x][y] = true;
	    
	    while(!q.isEmpty()){
	        Point po = q.poll();
	        x = po.x;
	        y = po.y;

	        for(int i = 0; i < 4; i++){
	            int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >= N)
                    continue;
                    
                if(!visit[nx][ny] && map[nx][ny]==c){
                    q.add(new Point(nx, ny));
	                visit[nx][ny] = true;
                }
	        }
	    }
	}
	
	static class Point{
	    int x, y;
	    
	    public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
//https://www.acmicpc.net/problem/16174

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};
    static boolean check = false;
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];
        
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }
        
        BFS(0, 0);
        
        System.out.print(check? "HaruHaru" : "Hing");
	}
	
	static void BFS(int x, int y){
	    Queue<Point> q = new LinkedList<>();
	    q.add(new Point(x, y));
	    visit[x][y] = true;
	    
	    while(!q.isEmpty()){
	        Point po = q.poll();
	        x = po.x;
	        y = po.y;
	        
	        if(map[x][y] == -1){
	            check = true;
	            return;
	        }
	        
	        for(int i = 0; i < 2; i++){
	            int nx = x + map[x][y]*dx[i];
                int ny = y + map[x][y]*dy[i];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >= N)
                    continue;
                    
                if(!visit[nx][ny]){
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
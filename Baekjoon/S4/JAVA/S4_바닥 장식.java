//https://www.acmicpc.net/problem/1388

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m, cnt = 0;
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		for(int i = 0; i < n; i++){
		    String str = br.readLine();
		    for(int j = 0; j < m; j++){
		         map[i][j] = str.charAt(j);
		    }
		}
		
		visit = new boolean[n][m];
        for(int i = 0; i < n; i++){
		    for(int j = 0; j < m; j++){
		         if(!visit[i][j]){
		             BFS(i,j);
		             cnt++;
		         }
		    }
		}
		
        System.out.print(cnt);
	}
	
	static void BFS(int x, int y){
	    Queue<Point> q = new LinkedList<>();
	    q.add(new Point(x, y));
	    visit[x][y] = true;
	    
	    while(q.size() > 0){
	        Point p = q.poll();
	        x = p.x;
	        y = p.y;

            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                
                if(map[x][y] == '-'){
                    if(map[x][ny] == map[x][p.y] && !visit[x][ny]){
                        q.add(new Point(x, ny));
                        visit[x][ny] = true;
                    }
                }
                else{
                    if(map[nx][y] == map[x][y] && !visit[nx][y]){
                        q.add(new Point(nx, y));
                        visit[nx][y] = true;
                    }
                }
            }
	    }
	}
	
	static class Point{
	    int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
	}
}
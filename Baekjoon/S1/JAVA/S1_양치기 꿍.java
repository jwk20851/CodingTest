//https://www.acmicpc.net/problem/3187

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int R, C, totalSheep = 0, totalWolf = 0;
    private static int[][] field;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		field = new int[R][C];
		visited = new boolean[R][C];
		for(int i = 0; i < R; i++){
		    String str = br.readLine();
		    for(int j = 0; j < C; j++){
		        char c = str.charAt(j);
		        field[i][j] = c;
		        if(c == 'v')
		            totalWolf++;
		        if(c == 'k')
		            totalSheep++;
		    }
		}
		
		for(int i = 0; i < R; i++){
		    for(int j = 0; j < C; j++){
		        if(field[i][j]=='k' && !visited[i][j])
		            BFS(i,j);
		    }
		}
		
		System.out.print(totalSheep +" "+ totalWolf);
	}
	
	private static void BFS(int x, int y){
	    Queue<Point> q = new LinkedList<Point>();
	    q.add(new Point(x, y));
	    visited[x][y] = true;
	    
	    int sheep = 1;
	    int wolf = 0;
	    while(!q.isEmpty()){
	        Point tmp = q.poll();
	        x = tmp.x;
	        y = tmp.y;
	        
	        for(int i = 0; i < 4; i++){
	            int nx = x + dx[i];
	            int ny = y + dy[i];
	            
	            if(nx < 0 || ny < 0 || x >= R || y >= C)
	                continue;
                if(visited[nx][ny] || field[nx][ny] == '#')
                    continue;
                
                if(field[nx][ny] == 'v')
                    wolf++;
                else if(field[nx][ny] == 'k')
                    sheep++;
                
                q.add(new Point(nx,ny));
                visited[nx][ny] = true;
	        }
	    }
	    
	    if(sheep > wolf)
	        totalWolf -= wolf;
	    else
	        totalSheep -= sheep;
	}
	
	private static class Point{
	    int x, y;
	    public Point(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	}
}
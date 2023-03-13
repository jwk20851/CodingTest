//https://www.acmicpc.net/problem/3184

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int backyard[][];
    private static boolean visited[][];
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int R,C,totalSheep = 0, totalWolf = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		backyard = new int[R][C];
		visited = new boolean[R][C];
		for(int i = 0; i < R; i++){
		    String str = br.readLine();
		    for(int j = 0; j < C; j++){
		        backyard[i][j] = str.charAt(j);
		        if(backyard[i][j] == 'o')
		            totalSheep++;
		        if(backyard[i][j] == 'v')
		            totalWolf++;
		    }
		}

		for(int i = 0; i < R; i++){
		    for(int j = 0; j < C; j++){
		        if(!visited[i][j] && backyard[i][j] == 'o')
		            BFS(i, j);
		    }
		}
		
		System.out.println(totalSheep+" "+totalWolf);
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
	            
	            if(nx<0 || ny<0 || nx>=R || ny>=C)
	                continue;
	            if(backyard[nx][ny] == '#')
	                continue;
	                
	            if(!visited[nx][ny]){
	                if(backyard[nx][ny] == 'o')
	                    sheep++;
	                if(backyard[nx][ny] == 'v')
	                    wolf++;
	                    
	                q.add(new Point(nx, ny));
	                visited[nx][ny] = true;
	            }
	        }
	    }

	    if(sheep > wolf)
	        totalWolf -= wolf;
	    else
	        totalSheep -= sheep;
	}
	
	private static class Point{
	    int x,y;
	    
	    Point(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	}
}
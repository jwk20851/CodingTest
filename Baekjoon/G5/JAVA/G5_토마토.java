//https://www.acmicpc.net/problem/7569

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int[][][] tomato;
    private static int[] dx = {-1, 1, 0, 0, 0, 0};
    private static int[] dy = {0, 0, -1, 1, 0, 0};
    private static int[] dz = {0, 0, 0, 0, -1, 1};
    private static Queue<Point> q;
    private static int M,N,H;
    
    private static class Point{
        int x,y,z;
        
        Point(int x,int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    M = Integer.parseInt(st.nextToken());
	    N = Integer.parseInt(st.nextToken());
	    H = Integer.parseInt(st.nextToken());
		
		tomato = new int[M][N][H];
		q = new LinkedList<Point>();
		
		boolean allRipen = true;
		for(int i = 0; i < H; i++){
		    for(int j = 0; j < N; j++){
		        st = new StringTokenizer(br.readLine());
		        for(int k = 0; k < M; k++){
		            tomato[k][j][i] = Integer.parseInt(st.nextToken());
		            if(tomato[k][j][i] == 0)
		                allRipen = false;
		            if(tomato[k][j][i] == 1)
		                q.add(new Point(k, j, i));
		        }
		    }
		}
		
		if(allRipen){
		    System.out.print("0");
		    System.exit(0);
		}
		
		BFS();
		
		int max = 0;
		for(int i = 0; i < H; i++){
		    for(int j = 0; j < N; j++){
		        for(int k = 0; k < M; k++){
		            if(tomato[k][j][i] == 0){
		                System.out.print("-1");
		                System.exit(0);
		            }
		            max = Math.max(max, tomato[k][j][i]);
		        }
		    }
		}
		
		System.out.print(max-1);
	}
	
	private static void BFS(){
	    while(!q.isEmpty()){
	        Point tmp = q.poll();
	        int x = tmp.x;
	        int y = tmp.y;
	        int z = tmp.z;
	        
	        for(int i = 0; i < 6; i++){
	            int nx = x + dx[i];
	            int ny = y + dy[i];
	            int nz = z + dz[i];
	            
	            if(nx<0 || ny<0 || nz<0 || nx>=M || ny>=N || nz>=H)
	                continue;
	            
	            if(tomato[nx][ny][nz] == 0){
    	            q.add(new Point(nx, ny, nz));
    	            tomato[nx][ny][nz] = tomato[x][y][z]+1;
	            }
	        }
	    }
	}
}
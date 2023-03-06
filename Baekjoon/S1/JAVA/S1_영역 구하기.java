//https://www.acmicpc.net/problem/2583

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

public class Main{
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static int N, M;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visit = new boolean[N][M];
		for(int i = 0; i < K; i++){
		    st = new StringTokenizer(br.readLine());
		    int x1 = Integer.parseInt(st.nextToken());
		    int y1 = Integer.parseInt(st.nextToken());
		    int x2 = Integer.parseInt(st.nextToken());
		    int y2 = Integer.parseInt(st.nextToken());
		    
		    for(int x = x1; x < x2; x++){
		        for(int y = y1; y < y2; y++){
		            if(map[x][y] == 0)
		                map[x][y] = 1;
		        }
		    }
		}
		
		int cnt = 0;
		List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(!visit[j][i] && map[j][i] == 0){
                    cnt++;
                    li.add(BFS(j,i));
                }
            }
        }
        
        Collections.sort(li);
        
        StringBuilder sb = new StringBuilder();
        sb.append(cnt+"\n");
        for(int i = 0; i < li.size(); i++)
            sb.append(li.get(i)+"\n");
        
        System.out.print(sb);
	}
	
	static int BFS(int x, int y){
	    int area = 1;
	    Queue<Point> q = new LinkedList<Point>();
	    q.add(new Point(x,y));
	    visit[x][y] = true;
	    
	    while(!q.isEmpty()){
	        Point po = q.poll();
	        
	        for(int i = 0; i < 4; i++){
    	        int nx = po.x + dx[i];
    	        int ny = po.y + dy[i];
	            
	            if(nx < 0 || ny < 0 || nx >= N || ny >= M)
	                continue;
	                
	            if(!visit[nx][ny] && map[nx][ny]==0){
	                q.add(new Point(nx,ny));
	                visit[nx][ny] = true;
	                area++;
	            }
	        }
	    }
	    
	    return area;
	}
	
	static class Point{
	    int x, y;
	    
	    public Point(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	}
}
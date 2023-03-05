//https://www.acmicpc.net/problem/16173

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int[][] map;
    static int N;
    static boolean check = false;
    static boolean[][] visit;
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};
    
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
        
        DFS(0, 0);
        
        System.out.print(check? "HaruHaru" : "Hing");
	}
	
	static void DFS(int x, int y){
	    visit[x][y] = true;
	    
	    if(x==N-1 && y==N-1){
	        check = true;
	        return;
	    }
	    
        for(int i = 0; i < 2; i++){
            int nx = x + map[x][y]*dx[i];
            int ny = y + map[x][y]*dy[i];
            
            if(nx < 0 || ny < 0 || nx >= N || ny >= N)
                continue;
            if(!visit[nx][ny])
                DFS(nx, ny);
        }
	}
}
//https://www.acmicpc.net/problem/14620

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N, ans = Integer.MAX_VALUE;
    private static int[][] garden;
    private static boolean[][] visited;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		garden = new int[N][N];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < N; j++)
		        garden[i][j] = Integer.parseInt(st.nextToken());
		}
		
		visited = new boolean[N][N];
	    DFS(0, 0);
	    
		System.out.print(ans);
    }
    
    private static void DFS(int cnt, int nowCost){
        if(cnt == 3){
            ans = Math.min(ans, nowCost);
            return;
        }

        for(int i = 1; i < N-1; i++){
            for(int j = 1; j < N-1; j++){
                if(!checkGarden(i,j))
                    continue;

                if(!visited[i][j]){
                    visited[i][j] = true;
                    DFS(cnt+1, nowCost +sumCost(i,j));
                    rollback(i,j);
                    visited[i][j] = false;
                }
            }
        }
    }
    
    private static boolean checkGarden(int x, int y){
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(visited[nx][ny])
                return false;
        }
        
        return true;
    }
    
    private static int sumCost(int x, int y){
        int tmp = garden[x][y];
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            tmp += garden[nx][ny];
            visited[nx][ny] = true;
        }
        
        return tmp;
    }
    
    private static void rollback(int x, int y){
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            visited[nx][ny] = false;
        }
    }
}
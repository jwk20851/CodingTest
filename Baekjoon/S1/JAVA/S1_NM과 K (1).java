//https://www.acmicpc.net/problem/18290

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N,M,K, max = Integer.MIN_VALUE;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] arr;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < M; j++)
		        map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		visited = new boolean[N][M];
		arr = new int[K];
		
		DFS(0, 0, 0);
		
		System.out.print(max);
    }
    
    private static void DFS(int x, int y, int depth){
        if(depth == K){
            int sum = 0;
            for(int i : arr)
                sum += i;
                
            max = Math.max(max, sum);
            
            return;
        }
        
        for(int i = x; i < N; i++){
            for(int j = y; j < M; j++){
                if(visited[i][j])
                    continue;
                
                if(check(i, j)){
                    visited[i][j] = true;
                    arr[depth] = map[i][j];
                    DFS(x, y, depth +1);
                    arr[depth] = 0;
                    visited[i][j] = false;
                }
            }
        }
    }
    
    public static boolean check(int x, int y){
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx<0 || nx>=N || ny<0 || ny>=M)
                continue;
            if(visited[nx][ny])
                return false;
        }
        
        return true;
    }
}
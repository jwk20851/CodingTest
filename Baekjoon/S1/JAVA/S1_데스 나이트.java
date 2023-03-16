//https://www.acmicpc.net/problem/16948

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int N, r2, c2;
    private static int[][] board;
    private static boolean[][] visited;
    private static int[] dx = {-2, -2, 0, 0, 2, 2};
    private static int[] dy = {-1, 1, -2, 2, -1, 1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        visited = new boolean[N][N];
      
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        
        if(r1==r2 && c1==c2){
            System.out.print(0);
            System.exit(0);
        }
        
        board[r2][c2] = 1;
      
        System.out.print(BFS(r1,c1,0));
    }
    
    private static int BFS(int x, int y, int cnt){
        Queue<Point> q = new LinkedList<Point>();
        q.add(new Point(x,y,cnt));
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            Point tmp = q.poll();
            x = tmp.x;
            y = tmp.y;
            cnt = tmp.cnt;
            
            for(int i = 0; i < 6; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx<0 || ny<0 || nx>=N || ny>=N)
                    continue;
                    
                if(!visited[nx][ny]){
                    if(board[nx][ny]==1)
                        return ++cnt;
                        
                    q.add(new Point(nx,ny,cnt+1));
                    visited[nx][ny] = true;
                }
            }
        }
        
        return -1;
    }
    
    private static class Point{
        int x, y, cnt;
       
        Point(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
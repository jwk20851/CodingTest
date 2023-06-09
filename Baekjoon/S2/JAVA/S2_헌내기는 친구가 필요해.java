//https://www.acmicpc.net/problem/21736

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int N,M;
    private static char[][] campus;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        campus = new char[N][M];
        visited = new boolean[N][M];
        int x = 0,y = 0;
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                campus[i][j] = str.charAt(j);
                
                if(campus[i][j] == 'I'){
                    x = i;
                    y = j;
                }
            }
        }
        
        int total = BFS(x,y);
        
        System.out.println(total == 0? "TT" : total);
    }
    
    private static int BFS(int x, int y){
        Queue<Point> q = new LinkedList<Point>();
        q.add(new Point(x,y));
        visited[x][y] = true;
        
        int cnt = 0;
        while(!q.isEmpty()){
            Point tmp = q.poll();
            x = tmp.x;
            y = tmp.y;
            
            for(int i = 0; i < 4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                
                if(nx<0 || ny<0 || nx>=N || ny>=M)
                    continue;
                if(campus[nx][ny] == 'X')
                    continue;
                
                if(!visited[nx][ny]){
                    if(campus[nx][ny] == 'P')
                        cnt++;
                    
                    q.add(new Point(nx,ny));
                    visited[nx][ny] = true;
                } 
            }
        }
        
        return cnt;
    }
    
    private static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
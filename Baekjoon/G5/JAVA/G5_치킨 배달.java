//https://www.acmicpc.net/problem/15686

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    private static int N,M, ans = Integer.MAX_VALUE;
    private static int[][] map;
    private static boolean[] visited;
    private static List<Point> people;
    private static List<Point> chicken;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N][N];
        people = new ArrayList<>();
        chicken = new ArrayList<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                
                if(map[i][j] == 1)
                    people.add(new Point(i,j));
                else if(map[i][j] == 2)
                    chicken.add(new Point(i,j));
            }
        }

        visited = new boolean[chicken.size()];
        DFS(0, 0);
        
        System.out.print(ans);
    }
    
    private static void DFS(int idx, int depth){
        if(depth == M){
            int sum = 0;
            for(int i = 0; i < people.size(); i++){
                Point pp = people.get(i);
                int px = pp.x;
                int py = pp.y;
                
                int dis = Integer.MAX_VALUE;
                for(int j = 0; j < chicken.size(); j++){
                    if(visited[j]){
                        Point cc = chicken.get(j);
                        int cx = cc.x;
                        int cy = cc.y;
                        
                        dis = Math.min(dis, Math.abs(px-cx)+Math.abs(py-cy));
                    }
                }
                sum += dis;
            }
            ans = Math.min(ans, sum);
            
            return;
        }
        
        for(int i = idx; i < chicken.size(); i++){
            visited[i] = true;
            DFS(i+1, depth+1);
            visited[i] = false;
        }
    }
    
    static class Point{
        int x, y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
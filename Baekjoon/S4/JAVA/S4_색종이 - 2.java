//https://www.acmicpc.net/problem/2567

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[101][101];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    if(map[x+j][y+k] == 0)
                        map[x+j][y+k] = 1;
                }
            }
        }
        
        int cnt = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if((i>0 && j>0) && map[i][j] == 1){
                    for(int k = 0; k < 4; k++){
                        int x = i+dx[k];
                        int y = j+dy[k];
                        
                        if(map[x][y] == 0)
                            cnt++;
                    }
                }
            }
        }
        
        System.out.print(cnt);
    }
}
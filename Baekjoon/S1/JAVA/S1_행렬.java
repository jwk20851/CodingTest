//https://www.acmicpc.net/problem/1080

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N, M;
    private static int[][] map, target;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i = 0; i < N; i++){
		    String tmp = br.readLine();
		    for(int j = 0; j < M; j++)
		        map[i][j] = tmp.charAt(j)-'0';
		}
		
		target = new int[N][M];
        for(int i = 0; i < N; i++){
		    String tmp = br.readLine();
		    for(int j = 0; j < M; j++)
		        target[i][j] = tmp.charAt(j)-'0';
		}
		
		int min = changeMap();
		
		System.out.println(checkMap()? min:-1);
    }
    
    private static int changeMap(){
        int cnt = 0;
        for(int i = 0; i < N-2; i++){
			for(int j = 0; j < M-2; j++){
				if(map[i][j] == target[i][j])
				    continue;
				
				for(int r = i; r < i+3; r++){
					for(int c = j; c < j+3; c++)
						map[r][c] = (map[r][c] == 0)? 1 : 0;
				}
				cnt++;
			}
		}
		
		return cnt;
    }
    
    private static boolean checkMap(){
        for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				if(map[i][j] != target[i][j])
				    return false;
			}
		}
		
		return true;
    }
}
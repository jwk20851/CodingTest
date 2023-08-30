//https://www.acmicpc.net/problem/2422

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static boolean[][] combi;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
	    combi = new boolean[N+1][N+1];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            combi[a][b] = combi[b][a] = true;
        }
        
        System.out.print(checkCombi(N));
    }
    
    private static int checkCombi(int N){
        int ans = 0;
        for(int i = 1; i <= N; i++){
            for(int j = i+1; j <= N; j++){
                if(combi[i][j])
                    continue;
                    
                for(int k = j+1; k <= N; k++){
                    if(!combi[k][i] && !combi[k][j])
                        ans++;
                }
            }
        }
        
		return ans;
    }
}
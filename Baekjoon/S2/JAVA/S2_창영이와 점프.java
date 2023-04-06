//https://www.acmicpc.net/problem/22114

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] dis = new int[N-1];
        for(int i = 0; i < N-1; i++)
            dis[i] = Integer.parseInt(st.nextToken());
            
        int[][] dp = new int[N][2];
        dp[0][0] = dp[0][1] = 1;
        int max = 0;
        for(int i = 1; i < N; i++){
            if(dis[i-1] <= K){
                dp[i][0] = dp[i-1][0]+1;
                dp[i][1] = dp[i-1][1]+1;
            }
            else{
                dp[i][0] = 1;
                dp[i][1] = dp[i-1][0]+1;
            }
                
            max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
        }
        
        System.out.print(max);
    }
}
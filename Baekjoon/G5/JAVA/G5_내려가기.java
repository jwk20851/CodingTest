//https://www.acmicpc.net/problem/2096

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[4];
		int[][][] dp = new int[N+1][4][2];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		StringTokenizer st;
		for(int i = 1; i <= N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 1; j <= 3; j++){
		        arr[j] = Integer.parseInt(st.nextToken());
		    }
		    
		    for(int j = 1; j <= 3; j++){
		        if(j == 1){
                    dp[i][j][0] = arr[j] + Math.min(dp[i-1][j][0], dp[i-1][j+1][0]);
                    dp[i][j][1] = arr[j] + Math.max(dp[i-1][j][1], dp[i-1][j+1][1]);
                }
                else if(j == 3){
                    dp[i][j][0] = arr[j] + Math.min(dp[i-1][j][0], dp[i-1][j-1][0]);
                    dp[i][j][1] = arr[j] + Math.max(dp[i-1][j][1], dp[i-1][j-1][1]);
                }
                else{
                    dp[i][j][0] = arr[j] + Math.min(dp[i-1][j][0], Math.min(dp[i-1][j+1][0], dp[i-1][j-1][0]));
                    dp[i][j][1] = arr[j] + Math.max(dp[i-1][j][1], Math.max(dp[i-1][j+1][1], dp[i-1][j-1][1]));
                }
                
                if(i == N){
                    min = Math.min(min, dp[i][j][0]);
                    max = Math.max(max, dp[i][j][1]);
                }
		    }
		}
		
		System.out.print(max+" "+min);
	}
}
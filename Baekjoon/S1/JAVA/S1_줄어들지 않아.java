//https://www.acmicpc.net/problem/2688

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
        
		long[][] dp = new long[65][10];
		Arrays.fill(dp[1], 1);
		for(int i = 2; i <= 64; i++){
            for(int j = 0; j < 10; j++){
                for(int k = j; k < 10; k++){
                    dp[i][j] += dp[i-1][k];
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
		while(T-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    
            long ans = 0;
		    for(int i = 0; i < 10; i++)
                ans += dp[n][i];
                
		    sb.append(ans+"\n");
		}
		
		System.out.print(sb);
	}
}
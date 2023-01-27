//https://www.acmicpc.net/problem/2407

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        BigInteger[][] dp = new BigInteger[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= i; j++){
                dp[i][j] = (j==0 || j==i)? BigInteger.ONE : dp[i-1][j-1].add(dp[i-1][j]);
            }
        }
		
		System.out.println(dp[n][m]);
	}
}
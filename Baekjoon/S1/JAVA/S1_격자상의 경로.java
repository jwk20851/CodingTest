//https://www.acmicpc.net/problem/10164

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        int k = Integer.parseInt(tmp[2]);
        
        int[][] dp = new int[n][m];
        int x = 0, y = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
				dp[i][j] = (i==0 || j==0)? 1 : dp[i-1][j] + dp[i][j-1];
				
				cnt++;
				
				if(cnt == k){
					x = i;
					y = j;
				}
			}
        }
        
		System.out.print(dp[x][y]*dp[n-1-x][m-1-y]);
	}
}
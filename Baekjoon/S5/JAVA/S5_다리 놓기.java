//https://www.acmicpc.net/problem/1010

import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int t = Integer.parseInt(br.readLine());
	    while(t-- > 0){
	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

            int[][] dp = new int[n+1][m+1];
				
            for(int i = 1; i <= m; i++)
                dp[1][i] = i;
            
            for(int i = 2; i <= n; i++){
                for(int j = 2; j <= m; j++){
                    dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
                }
            }
            
			sb.append(dp[n][m]+"\n");
	    }
	    
	    System.out.print(sb);
	    br.close();
	}
}

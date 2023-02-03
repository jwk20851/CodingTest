//https://www.acmicpc.net/problem/11060

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = Integer.MAX_VALUE;
        }
		
		dp[1] = 0;
		for(int i = 1; i <= n; i++){
            if(dp[i] == Integer.MAX_VALUE)
                continue;
                
            for(int j = 1; j <= arr[i]; j++){
                if(i+j <= n)
                    dp[i+j] = Math.min(dp[i+j], dp[i]+1);
            }
        }
		
		System.out.print((dp[n] != Integer.MAX_VALUE)? dp[n] : "-1");
	}
}
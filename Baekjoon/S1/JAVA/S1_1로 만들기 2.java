//https://www.acmicpc.net/problem/12852

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        
        int[] num = new int[n+1];
		for(int i = 2; i <= n; i++){
		    if(i%3==0 && dp[i] > dp[i/3]+1){
		        dp[i] = dp[i/3] + 1;
		        num[i] = i/3;
		    }
		    if(i%2==0 && dp[i] > dp[i/2]+1){
		        dp[i] = dp[i/2] + 1;
		        num[i] = i/2;
		    }
		    if(dp[i] > dp[i-1]+1){
		        dp[i] = dp[i-1] + 1;
		        num[i] = i-1;
		    }
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(dp[n] + "\n");
		
		while(n > 0){
			sb.append(n + " ");
			n = num[n];
		}
		
		System.out.println(sb);
	}
}
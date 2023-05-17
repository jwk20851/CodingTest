//https://www.acmicpc.net/problem/9658

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1001];
		dp[2] = dp[4] = 1;
		for(int i = 5; i <= N; i++)
		    dp[i] = (dp[i-1]==1 && dp[i-3]==1 && dp[i-4]==1)? 0:1;
		    
		System.out.println((dp[N]==1)? "SK" : "CY");
	}
}
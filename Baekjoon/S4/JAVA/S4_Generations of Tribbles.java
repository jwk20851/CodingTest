//https://www.acmicpc.net/problem/9507

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		BigInteger[] dp = new BigInteger[68];
		dp[0] = dp[1] = new BigInteger("1");
		dp[2] = new BigInteger("2");
		dp[3] = new BigInteger("4");
		
		for(int i = 4; i < 68; i++)
		    dp[i] = dp[i-1].add(dp[i-2].add(dp[i-3].add(dp[i-4])));
		    
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		    sb.append(dp[Integer.parseInt(br.readLine())]+"\n");
		
		System.out.print(sb);
	}
}
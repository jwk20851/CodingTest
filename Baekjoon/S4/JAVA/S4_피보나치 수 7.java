//https://www.acmicpc.net/problem/15624

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] dp = new int[1000001];
        dp[1] = dp[2] = 1;
        for(int i = 3; i <= 1000000; i++)
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        
        System.out.print(dp[N]);
    }
}
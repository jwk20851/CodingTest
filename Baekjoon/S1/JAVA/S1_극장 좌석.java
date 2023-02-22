//https://www.acmicpc.net/problem/2302

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++)
            dp[i] = dp[i-1] + dp[i-2];
        
        int sum = 1, tmp = 0; 
        for(int i = 0; i < m; i++){
			int num = Integer.parseInt(br.readLine());
			sum *= dp[num-tmp-1];
			tmp = num;
		}
        sum *= dp[n-tmp];
        
        System.out.println(sum);
	}
}
//https://www.acmicpc.net/problem/18353

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] soldier = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++)
		    soldier[i] = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[N+1];
		Arrays.fill(dp, 1);
		for(int i = 1; i <= N; i++){
		    for(int j = 1; j <= i; j++){
		        if(soldier[j] > soldier[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
		    }
		}
		
		int max = dp[0];
        for(int i = 1; i <= N; i++)
            max = Math.max(max, dp[i]);
		
		System.out.print(N-max);
	}
}
//https://www.acmicpc.net/problem/1660

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[122];
		int[] sum = new int[122];
		for(int i = 1; i <= 121; i++){
            dp[i] = dp[i-1]+i;
            sum[i] = sum[i-1] + dp[i];
        }

		int[] tmp = new int[N+1];
		Arrays.fill(tmp, Integer.MAX_VALUE);
		tmp[0] = 0;
		tmp[1] = 1;
		for(int i = 2; i <= N; i++){
			for(int j = 1; j <= 121; j++){
				if(sum[j] > i)
				    break;
				tmp[i] = Math.min(tmp[i], tmp[i-sum[j]] + 1);
			}
		}
		
		System.out.println(tmp[N]);
	}
}
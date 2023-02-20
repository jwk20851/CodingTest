//https://www.acmicpc.net/problem/2670

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        for(int i = 0; i < n; i++)
            arr[i] =  Double.parseDouble(br.readLine());
            
        double[] dp = new double[n];
        double max = arr[0];
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(arr[i-1], dp[i-1]*arr[i-1]);
            max = Math.max(max, dp[i]);
        }
        
		System.out.printf("%.3f", max);
	}
}
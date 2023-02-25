//https://www.acmicpc.net/problem/1535

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] L = new int[n];
        int[] J = new int[n];
        
        String[] tmp = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
            L[i] = Integer.parseInt(tmp[i]);
            
        tmp = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
            J[i] = Integer.parseInt(tmp[i]);
        
        int[] dp = new int[101];
        for(int i = 0; i < n; i++){
            for(int j = 100; j > L[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-L[i]]+J[i]);
            }
        }
        
        System.out.println(dp[100]);
	}
}
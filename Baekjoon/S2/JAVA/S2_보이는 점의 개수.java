//https://www.acmicpc.net/problem/2725

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dp = new int[1001];
		dp[1] = 3;
		for(int i = 2; i <= 1000; i++){
		    int cnt = 0;
		    for(int j = 1; j < i; j++){
		        if(GCD(i,j) == 1)
		            ++cnt;
		    }
		    dp[i] = dp[i-1] + cnt*2;
		}
		
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());
		for(int i = 0; i < C; i++){
		    int n = Integer.parseInt(br.readLine());
		    sb.append(dp[n]+"\n");
		}
		
		System.out.print(sb);
	}
	
	static int GCD(int a, int b){
	    int tmp = a%b;
	    
	    if(tmp == 0)
	        return b;
	        
	    return GCD(b, tmp);
	}
}
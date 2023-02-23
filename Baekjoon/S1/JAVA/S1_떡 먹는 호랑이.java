//https://www.acmicpc.net/problem/2502

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int d, k;
    static int[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        d = Integer.parseInt(st.nextToken());
        dp = new int[d+1];
        
        k = Integer.parseInt(st.nextToken());
        boolean check = false;
        for(int i = 1; i <= k/2; i++){
            for(int j = i+1; j < k; j++){
                dp[1] = i;
                dp[2] = j;
                
                funcDP();
            }
        }
	}
	
	static void funcDP(){
	    for(int i = 3; i <= d; i++)
	        dp[i] = dp[i-1]+dp[i-2];
	        
	    if(dp[d] == k){
    		System.out.println(dp[1]);
    		System.out.println(dp[2]);
    		System.exit(0);    		
    	}
	}
}
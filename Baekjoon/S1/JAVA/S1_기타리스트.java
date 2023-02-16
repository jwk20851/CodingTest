//https://www.acmicpc.net/problem/1495

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);   //곡 수
        int s = Integer.parseInt(arr[1]);   //시작 볼륨
        int m = Integer.parseInt(arr[2]);   //최대 볼륨
		
		StringTokenizer st = new StringTokenizer(br.readLine());
        int[] vol = new int[n];
        for(int i = 0; i < n; i++)
            vol[i] = Integer.parseInt(st.nextToken());
        
        int[][] dp = new int[n][m+1];   //[순서][볼륨]
        if(s+vol[0] <= m)
            dp[0][s+vol[0]] = 1;
        if(s-vol[0] >= 0)
            dp[0][s-vol[0]] = 1;
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= m; j++){
                if(dp[i-1][j] == 1){
                    if(j + vol[i] <= m)
                        dp[i][j + vol[i]] = 1;
                        
                    if(j - vol[i] >= 0)
                        dp[i][j - vol[i]] = 1;
                }
            }
        }
        
        int max = -1;
		for(int i = m; i >= 0; i--){
		    if(dp[n-1][i] == 1)
		        max = Math.max(max, i);
		}
		
		System.out.print((max == -1)? "-1" : max);
	}
}
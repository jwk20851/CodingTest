//https://www.acmicpc.net/problem/1058

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		char[][] map = new char[N+1][N+1];
		char[][] ans = new char[N+1][N+1];
		for(int i = 1; i <= N; i++){
		    String str = br.readLine();
		    for(int j = 1; j <= N; j++){
		        map[i][j] = str.charAt(j-1);
		        ans[i][j] = map[i][j];
		    }
		}
		
		for(int i = 1; i <= N; i++){
		    for(int j = 1; j <= N; j++){
		        for(int k = 1; k <= N; k++){
		            if(map[i][j] == 'Y' && map[j][k] == 'Y' && i != k)
		                ans[i][k] = 'Y';
		        }
		    }
		}
		
		int max = 0;
		for(int i = 1; i <= N; i++){
		    int cnt = 0;
		    for(int j = 1; j <= N; j++){
    		    if(ans[i][j]=='Y')
    		        cnt++;
    		}
    		max = Math.max(max, cnt);
		}
		
		System.out.print(max);
	}
}
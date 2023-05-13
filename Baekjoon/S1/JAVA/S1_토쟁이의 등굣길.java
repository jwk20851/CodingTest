//https://www.acmicpc.net/problem/12785

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int[][] city = new int[w+1][h+1];
		city[1][1] = 1;
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= x; i++){
		    for(int j = 1; j <= y; j++){
		        if(i==1 && j==1)
		            continue;
		        
		        city[i][j] += (city[i-1][j]+city[i][j-1])%1000007;
		    }
		}
		
		for(int i = x; i <= w; i++){
		    for(int j = y; j <= h; j++){
		        if(i==x && j==y)
		            continue;
		            
		        city[i][j] += (city[i-1][j]+city[i][j-1])%1000007;
		    }
		}
		
		System.out.print(city[w][h]);
	}
}
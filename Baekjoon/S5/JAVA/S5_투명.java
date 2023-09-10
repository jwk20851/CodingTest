//https://www.acmicpc.net/problem/1531

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] pic = new int[101][101];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    int lx = Integer.parseInt(st.nextToken());
		    int ly = Integer.parseInt(st.nextToken());
		    int rx = Integer.parseInt(st.nextToken());
		    int ry = Integer.parseInt(st.nextToken());
		    
		    for(int j = lx; j <= rx; j++){
		        for(int k = ly; k <= ry; k++)
		            pic[j][k]++;
		    }
		}
		
		int cnt = 0;
		for(int i = 1; i <= 100; i++){
		    for(int j = 1; j <= 100; j++){
		        if(pic[i][j] > M)
		            cnt++;
		    }
		}
		
		System.out.print(cnt);
    }
}
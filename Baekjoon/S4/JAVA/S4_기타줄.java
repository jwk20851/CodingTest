//https://www.acmicpc.net/problem/1049

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
		
		int[][] line = new int[M][2];
		int six = Integer.MAX_VALUE;
		int one = Integer.MAX_VALUE;
		for(int i = 0; i < M; i++){
		    st = new StringTokenizer(br.readLine());
		    line[i][0] = Integer.parseInt(st.nextToken());
		    line[i][1] = Integer.parseInt(st.nextToken());
		    
		    if(line[i][0] <= six)
		        six = line[i][0];
            if(line[i][1] <= one)
		        one = line[i][1];
		}
		
        int ans = Integer.MAX_VALUE;
        ans = Math.min(((N/6)+1)*six, N*one);    
        ans = Math.min(ans, ((N/6))*six + (N%6)*one);
        
        System.out.print(ans);
	}
}
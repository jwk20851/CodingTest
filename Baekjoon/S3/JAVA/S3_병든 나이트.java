//https://www.acmicpc.net/problem/1783

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    int	N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int ans = 0;
        if(N == 1)
            ans = 1;
	    else if(N == 2) 
            ans = Math.min(4, (M+1)/2);
		else if(N >= 3)
			ans = (M < 7)? Math.min(M, 4) : M-2;
			
		System.out.print(ans);
    }
}
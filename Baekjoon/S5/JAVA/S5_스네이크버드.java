//https://www.acmicpc.net/problem/16435

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        int[] h = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            h[i] = Integer.parseInt(st.nextToken());
            
        Arrays.sort(h);
        for(int i = 0; i < N; i++){
			if(L >= h[i])
				L++;
		}
		
        System.out.print(L);
	}
}
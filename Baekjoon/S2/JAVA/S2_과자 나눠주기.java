//https://www.acmicpc.net/problem/16401

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
	    st = new StringTokenizer(br.readLine());
		int[] snack = new int[N];
		for(int i = 0; i < N; i++)
            snack[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(snack);
        
        int l = 1, r = snack[N-1];
        while(l <= r){
            int mid = (l+r)/2;
            
            int cnt = 0;
            for(int i = 0; i < N; i++){
                if(mid <= snack[i])
                    cnt += snack[i]/mid;
            }
            
            if(cnt >= M)
                l = mid +1;
            else
                r = mid -1;
        }
            
        System.out.print(r);
	}
}
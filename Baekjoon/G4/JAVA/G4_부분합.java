//https://www.acmicpc.net/problem/1806

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
        st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		int l = 0, r = 0;
		long sum = 0;
		int cnt = 0, ans = Integer.MAX_VALUE;
		while(l<=r){
            if(sum < S && r < N){
                sum += arr[r++];
                cnt++;
                continue;
		    }
		    else if(sum >= S){
    	        ans = Math.min(ans, cnt--);
    	        sum -= arr[l++];
		    }
		    else
		        break;
		}
		
        System.out.print((ans==Integer.MAX_VALUE)? 0 : ans);
	}
}
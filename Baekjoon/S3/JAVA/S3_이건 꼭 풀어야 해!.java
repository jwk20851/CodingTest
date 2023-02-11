//https://www.acmicpc.net/problem/17390

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int[] sum = new int[n+1];
		for(int i = 1; i <= n; i++)
		    sum[i] = sum[i-1]+arr[i-1];
		
		StringBuilder sb = new StringBuilder();
		while(q-- > 0){
		    st = new StringTokenizer(br.readLine());
    		int l = Integer.parseInt(st.nextToken());
    		int r = Integer.parseInt(st.nextToken());
    		sb.append((l == r)? arr[l-1]+"\n" :sum[r]-sum[l-1]+"\n");
		}
		
		System.out.print(sb);
	}
}
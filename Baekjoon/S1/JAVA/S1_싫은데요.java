//https://www.acmicpc.net/problem/25916

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		   
		int l = 0, r = 0;
		long sum = 0, max = 0;
		while(r < n){
		    if(sum+arr[r] <= m){
		        sum += arr[r];
		        max = Math.max(sum, max);
		        r++;
		    }
		    else{
		        sum -= arr[l];
		        l++;
		    }
		    
		    if(l > r){
		        sum += arr[r];
		        r++;
		    }
		}
		
		System.out.println(max);
	}
}
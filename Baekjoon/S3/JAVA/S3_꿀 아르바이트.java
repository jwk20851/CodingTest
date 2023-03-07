//https://www.acmicpc.net/problem/12847

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
		
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++)
		    arr[i] =  Integer.parseInt(st.nextToken());
		
		long sum = 0, max = 0;
		for(int i = 1; i <= n; i++){
		    sum += arr[i];
		    
		    if(i >= m){
		        max = Math.max(sum, max);
		        sum -= arr[i-m+1];
		    }
		}
		
		System.out.print(Math.max(sum,max));
	}
}
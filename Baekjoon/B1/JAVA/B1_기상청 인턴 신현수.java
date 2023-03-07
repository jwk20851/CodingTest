//https://www.acmicpc.net/problem/2435

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++)
		    arr[i] =  Integer.parseInt(st.nextToken());
		
		int sum = 0, max = Integer.MIN_VALUE;
		for(int i = 1; i <= N; i++){
		    sum += arr[i];
		    if(i >= K){
		        max = Math.max(sum, max);
		        sum -= arr[i+1-K];
		    }
		}
		
		System.out.print(max);
	}
}
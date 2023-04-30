//https://www.acmicpc.net/problem/2012

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		    
		Arrays.sort(arr);
		long sum = 0;
		for(int i = 0; i < N; i++)
		    sum += Math.abs(arr[i]-(i+1));
		
        
		System.out.print(sum);
	}
}
//https://www.acmicpc.net/problem/18310

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		System.out.print(n%2==0? arr[n/2 -1] : arr[n/2]);
	}
}
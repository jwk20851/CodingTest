//https://www.acmicpc.net/problem/2491

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		String[] tmp = br.readLine().split(" ");
		for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(tmp[0]);
		
		int max = 0, cnt = 0;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] <= arr[i+1]) cnt++;
			else cnt = 1;
			max = Math.max(max, cnt);
		}
		
		int cnt = 1;
		for(int i=0; i < n-1; i++) {
			if(arr[i] >= arr[i+1]) cnt++;
			else cnt = 1;
			max = Math.max(max, cnt);
		}
		System.out.print(max);
	}
}
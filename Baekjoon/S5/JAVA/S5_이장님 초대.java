//https://www.acmicpc.net/problem/9237

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++){
		    arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int cnt = 2, max = 0;
		for(int i = 0; i < n; i++){
			max = Math.max(max, cnt + arr[i]);
			cnt++;
		}
		
		System.out.println(max);
	}
}
//https://www.acmicpc.net/problem/27724

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int total = (int)(Math.log(N)/Math.log(2)); //log2 8 = 3;
		int se = (int)(Math.log(K)/Math.log(2));
		int ans = Math.min(total, se+M);
		
		System.out.print(ans);
	}
}
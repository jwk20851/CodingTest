//https://www.acmicpc.net/problem/6986

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		double[] score = new double[N];
		for(int i = 0; i < N; i++)
		    score[i] = Double.parseDouble(br.readLine());
		
		Arrays.sort(score);
		
		for(int i = 0; i < K; i++){
		    score[i] = score[K];
		    score[N-1-i] = score[N-1-K];
		}
		
		double ans1 = 0, ans2 = 0;
		for(int i = 0; i < N; i++){
		    if(i>=K && i<=N-1-K)
		        ans1 += score[i];
		    ans2 += score[i];
		}
		
		ans1 /= N-2*K*1.0;
		ans2 /= N*1.0;
		
		System.out.printf("%.2f\n", ans1);
		System.out.printf("%.2f", ans2);
    }
}
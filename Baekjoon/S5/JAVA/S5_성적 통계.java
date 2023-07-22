//https://www.acmicpc.net/problem/5800

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= K; i++){
		    st = new StringTokenizer(br.readLine());
		    
		    int N = Integer.parseInt(st.nextToken());
		    int[] score = new int[N];
		    for(int j = 0; j < N; j++)
				score[j] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(score);
			
			int gap = 0;
		    for(int j = 0; j < N-1; j++)
				gap = Math.max(gap, score[j+1] - score[j]);
			
			sb.append("Class "+ i +"\n");
			sb.append("Max "+ score[N-1] +", Min "+ score[0] +", Largest gap "+ gap +"\n");
		}
		
		System.out.print(sb);
	}
}
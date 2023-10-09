//https://www.acmicpc.net/problem/25945

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] cons = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i = 0; i < N; i++){
		    cons[i] = Integer.parseInt(st.nextToken());
		    sum += cons[i];
		}
		
		int avr = sum/N;
		int high = 0, low = 0;
		for(int i = 0; i < N; i++){
		    if(cons[i] > avr+1)
		        high += cons[i]-(avr+1);
		    else if(cons[i] < avr)
		        low += avr - cons[i];
		}
		
		System.out.print(Math.max(high,low));
    }
}
//https://www.acmicpc.net/problem/1024

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
	    int L = Integer.parseInt(st.nextToken());
	    
	    StringBuilder sb = new StringBuilder();
	    while(true){
			int min = N/L - (L-1)/2;
			if(min < 0 || L > 100){
				System.out.println(-1);
				System.exit(0);
			}
			
			int sum = (min*2 +L -1)*L/2;
			if(sum == N){
				for(int i = 0; i < L; i++) 
					sb.append((min+i) + " ");
				break;
			}
			
			L++;
		}
		System.out.println(sb);
	}
}
//https://www.acmicpc.net/problem/11501

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
	    int T = Integer.parseInt(br.readLine());
	    while(T-- > 0){
	        int N = Integer.parseInt(br.readLine());
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int[] stocks = new int[N];
	        for(int i = 0; i < N; i++)
	            stocks[i] = Integer.parseInt(st.nextToken());
	        
	        long sum = 0, max = 0;
	        for(int i = N-1; i >= 0; i--){
	            if(max <= stocks[i]){
	                max = stocks[i];
	            }
	            else{
	                sum += max-stocks[i];
	            }
	        }
	        
	        sb.append(sum+"\n");
	    }
	    
	    System.out.print(sb);
	}
}
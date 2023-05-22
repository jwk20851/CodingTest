//https://www.acmicpc.net/problem/16974

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	private static long[] burger, patty;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long X = Long.parseLong(st.nextToken());
		
		burger = new long[N+1];
		patty = new long[N+1];
		
		burger[0] = patty[0] = 1; 
		for(int i = 1; i <= N; i++){
		    burger[i] = 2*burger[i-1] +3;
		    patty[i] = 2*patty[i-1] +1;
		}
		
		System.out.print(recursive(N, X));
	}
	
	private static long recursive(int N, long X){
	    if(N == 0){
    		if(X == 0)
    			return 0;
    		else if(X == 1)
    			return 1;
    	}
	    
	    if(X == 1)
		    return 0;
    	else if(X <= 1+burger[N-1])
    		return recursive(N-1, X-1);
    	else if(X == burger[N-1] +2)
    		return patty[N-1] + 1;
    	else if(X <= 2*burger[N-1] +2)
    		return patty[N-1] + 1 + recursive(N-1, X-(burger[N-1] +2));
    	else
    		return 2*patty[N-1] + 1;
	}
}
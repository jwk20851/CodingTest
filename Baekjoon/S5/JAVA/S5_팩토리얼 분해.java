//https://www.acmicpc.net/problem/2057

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Long N = Long.parseLong(br.readLine());
    	if(N == 0){
    	    System.out.print("NO");
    	    return;
    	}
    	
    	//입력 최댓값보다 20!이 더 큼
    	long[] fact = new long[20];
    	fact[0] = 1;
    	for(int i = 1; i < 20; i++)
    		fact[i] = fact[i-1] * i;
    	
    	for(int i = 19; i >= 0; i--){
			if(N >= fact[i])
			    N -= fact[i];
		}
		
	    System.out.print((N == 0)? "YES" : "NO");
	}
}
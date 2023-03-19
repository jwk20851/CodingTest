//https://www.acmicpc.net/problem/2485

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int gcd = 0;
		for(int i = 1; i < N; i++)
            gcd = GCD(gcd, arr[i]-arr[i-1]);
		
		System.out.println((arr[N-1]-arr[0])/gcd-N+1);
	}
	
	private static int GCD(int a, int b){
	    int tmp = a%b;
	    if(tmp == 0)
	        return b;
	    
	    return GCD(b,tmp);
	}
}
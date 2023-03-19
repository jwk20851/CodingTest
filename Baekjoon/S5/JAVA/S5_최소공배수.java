//https://www.acmicpc.net/problem/13241

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long gcd = GCD(Math.max(a,b), Math.min(a,b));
		a /= gcd;
		b /= gcd;
		
		System.out.println(a*b*gcd);
	}
	
	private static long GCD(long a, long b){
	    long tmp = a%b;
	    if(tmp == 0)
	        return b;
	        
	    return GCD(b, tmp);
	}
}
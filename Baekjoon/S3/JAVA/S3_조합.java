//https://www.acmicpc.net/problem/2407

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        BigInteger bi1 = BigInteger.ONE;
		BigInteger bi2 = BigInteger.ONE;
		
		for(int i = 0; i < m; i++){
		    bi1 = bi1.multiply(new BigInteger(String.valueOf(n-i)));
			bi2 = bi2.multiply(new BigInteger(String.valueOf(i+1)));
		}
		
		System.out.println(bi1.divide(bi2));
	}
}
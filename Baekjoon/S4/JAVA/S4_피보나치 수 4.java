//https://www.acmicpc.net/problem/10826

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger[] bi = new BigInteger[n+1];
        bi[0] = new BigInteger("0");
        
        if(n > 0)
            bi[1] = new BigInteger("1");
        
		for(int i = 2; i <= n; i++)
		    bi[i] = bi[i-1].add(bi[i-2]);
		
		System.out.println(bi[n]);
	}
}
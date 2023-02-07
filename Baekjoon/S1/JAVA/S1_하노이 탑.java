//https://www.acmicpc.net/problem/1914

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		if(n <= 20){
		    sb.append((int)(Math.pow(2, n) - 1) + "\n");
            hanoi(n, 1, 2, 3);
            System.out.print(sb);
        }
        else{
            BigInteger bi = new BigInteger("1");
            for(int i = 1; i <= n; i++)
                bi = bi.multiply(new BigInteger("2"));
                
            bi = bi.subtract(new BigInteger("1"));
            
            System.out.println(bi);
        }
	}
	
	static void hanoi(int n, int start, int mid, int end){
	    if(n == 1)
            sb.append(start + " " + end + "\n");
        else{
            hanoi(n-1, start, end, mid);
            sb.append(start + " " + end + "\n");
            hanoi(n-1, mid, start, end);
        }
	}
}
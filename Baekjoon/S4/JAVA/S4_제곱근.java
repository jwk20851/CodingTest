//https://www.acmicpc.net/problem/13706

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
    private static char[] arr;
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        BigInteger start = new BigInteger("1");
        BigInteger end = N;
        
        while(true){
            BigInteger mid = (start.add(end)).divide(new BigInteger("2"));
            
            int ans = (mid.multiply(mid)).compareTo(N);
            if(ans == 1)
                end = mid.subtract(new BigInteger("1"));
            else if(ans == -1)
                start = mid.add(new BigInteger("1"));
            else{
                System.out.print(mid);
                break;
            }
        }
	}
}
//https://www.acmicpc.net/problem/1850

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        
        System.out.println("1".repeat((int)gcd(n, m)));
    }
    
    private static long gcd(long a, long b){
		if(b == 0)
		    return a;
		return gcd(b, a%b);
	}
}
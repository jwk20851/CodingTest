//https://www.acmicpc.net/problem/5347

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
		    st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());
		    
		    sb.append(LCM(a,b)+"\n");
		}
		
        System.out.print(sb);
    }
    
    private static long LCM(int a, int b){
        long big = Math.max(a,b);
		long small = Math.min(a,b);
		    
        long gcd = GCD(big, small);
        long lcm = (big*small)/gcd;
        
        return lcm;
    }
    
    private static long GCD(long a, long b){
        if(a%b == 0)
            return b;
            
        return GCD(b, a%b);
    }
}
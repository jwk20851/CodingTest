//https://www.acmicpc.net/problem/9711

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		BigInteger[] dp = new BigInteger[10001];
        dp[1] = dp[2] = new BigInteger("1");
        for(int i = 3; i <= 10000; i++){
        	//a.add(b): a+b (a,b는 BigInteger)
            dp[i] = dp[i-1].add(dp[i-2]);
        }
            
        StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= T; i++){
		    st = new StringTokenizer(br.readLine());
		    int P = Integer.parseInt(st.nextToken());
		    int Q = Integer.parseInt(st.nextToken());
		    
		    sb.append("Case #").append(i).append(": ");
		    //a.remainder(b): a%b (a,b는 BigInteger)
		    //BigInteger.valueOf(a): a를 BigInteger로 형변환
		    sb.append(dp[P].remainder(BigInteger.valueOf(Q))).append("\n");
		}
		
		System.out.print(sb);
    }
}
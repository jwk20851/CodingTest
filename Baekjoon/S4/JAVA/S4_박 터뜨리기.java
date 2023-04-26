//https://www.acmicpc.net/problem/19939

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int sum = K*(K+1)/2;;
        if(N < sum)
            System.out.print("-1");
        else
            System.out.print(((N-sum)%K == 0)? K-1 : K);
	}
}
//https://www.acmicpc.net/problem/16488

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
		/*
		AC == N
		F(i) = AP^2 + BP*CP
		AP^2 = (BC/2 - BP)^2 + AD^2
		AD^2 = AC^2 - (BC/2)^2
		BC*CP = BP(BC-BP)
		F(i) = (BC/2 - BP)^2 + AC^2 - (BC/2)^2 + BP(BC-BP)
		    = (BC/2)^2 - BC*BP + BP^2 + AC^2 - (BC/2)^2 + BP*BC - BP^2
		    = AC^2 = N^2;
		*/
		System.out.print((long)N*N*K);
	}
}
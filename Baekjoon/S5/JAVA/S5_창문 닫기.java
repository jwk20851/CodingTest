//https://www.acmicpc.net/problem/13909

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i = 1; i*i <= N; i++)
            cnt++;
		
		System.out.print(cnt);
	}
}
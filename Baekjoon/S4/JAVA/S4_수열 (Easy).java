//https://www.acmicpc.net/problem/23827

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		long sum = 0;
		for(int i = 0; i < N; i++){
		    arr[i] = Integer.parseInt(st.nextToken());
		    sum += arr[i];
		}
		
		long ans = 0;
        for(int i = 0; i < N; i++){
            sum -= arr[i];
		    ans += (arr[i]*sum)%1000000007;
        }
		
		System.out.print(ans%1000000007);
	}
}
//https://www.acmicpc.net/problem/1740

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(N > 1){
            sb.append(N%2);
            N /= 2;
        }
		sb.append(1);
		
		long ans = 0;
		for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '1')
                ans += pow(i);
        }
		
		System.out.print(ans);
	}
	
	private static long pow(int cnt){
	    long tmp = 1;
        for(int i = 0; i < cnt; i++)
            tmp *= 3;
            
        return tmp;
	}
}
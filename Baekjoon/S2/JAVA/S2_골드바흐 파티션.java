//https://www.acmicpc.net/problem/17103

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] arr = new boolean[1000001];
		arr[1] = true;
		for(int i = 2; i < Math.sqrt(1000001); i++){
		    if(arr[i])
		        continue;
		        
		    for(int j = 2*i; j < 1000001; j+=i)
		        arr[j] = true;
		}
		    
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    int cnt = 0;
		    
		    for(int i = 1; i <= n/2; i++){
		        if(!arr[i] && !arr[n-i])
		            cnt++;
		    }
		    
		    sb.append(cnt+"\n");
		}
		
		System.out.print(sb);
	}
}
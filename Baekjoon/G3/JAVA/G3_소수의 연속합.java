//https://www.acmicpc.net/problem/1644

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N==1){
		    System.out.print(0);
		    System.exit(0);
		}
		    
		int max = 4000000;
		boolean[] cNum = new boolean[max+1];
		
		for(int i = 2; i <= max; i++){
		    for(int j = i+i; j <= max; j += i){
		        if(!cNum[j])
		            cNum[j] = true;
		    }
		}
		
		int l = 2, r = 2, ans = 0;
		long sum = 0;
		while(l <= r){
		    if(sum < N){
		        if(!cNum[r])
		            sum += r;
		            
		        if(r <= N)
		            r++;
		    }
		    else if(sum >= N){
		        if(sum == N)
		            ans++;
		            
		        if(!cNum[l])
		            sum -= l;
		        l++;
		    }
		    if(l>N && r>N)
		        break;
		}
		
        System.out.print(ans);
	}
}
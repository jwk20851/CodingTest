//https://www.acmicpc.net/problem/1644

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N==1){
		    System.out.print(0);
		    System.exit(0);
		}
		    
		boolean[] cNum = new boolean[N+1];
		for(int i = 2; i <= N; i++){
		    for(int j = i+i; j <= N; j += i){
		        if(!cNum[j])
		            cNum[j] = true;
		    }
		}
		
		List<Integer> prime = new ArrayList<Integer>();
		for(int i = 2; i <= N; i++){
		    if(!cNum[i])
		        prime.add(i);
		}
		
		int l = 0, r = 0, ans = 0;
		long sum = 0;
		while(l <= r){
            if(sum < N){
                if(r < prime.size())
                    sum += prime.get(r);
                r++;
            }
            else if(sum >= N){
                if(sum == N)
                    ans++;
                
                sum -= prime.get(l);
                
                if(l < prime.size())
                    l++;
            }
            else if(r > prime.size() && l > prime.size())
                break;
		}
		
        System.out.print(ans);
	}
}
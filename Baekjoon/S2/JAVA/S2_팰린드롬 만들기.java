//https://www.acmicpc.net/problem/1254

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < str.length(); i++){
		    if(isPalin(str.substring(i)))
		        ans = Math.min(ans, str.length()+i);
		}
		
        System.out.print(ans);
	}
	
	private static boolean isPalin(String tmp){
	    int l = 0, r = tmp.length()-1;
	    while(l <= r){
	        if(tmp.charAt(l)==tmp.charAt(r)){
	            l++;
	            r--;
	        }
	        else
	            return false;
	    }
	    return true;
	}
}
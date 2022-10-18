//https://www.acmicpc.net/problem/1316

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int cnt = n;
	    
	    while(n-- > 0){
	        String str = br.readLine();
			boolean[] arr = new boolean[26];
			
			for (int i = 0; i < str.length(); i++) {
				if(!arr[str.charAt(i) - 'a'])
					arr[str.charAt(i) - 'a'] = true;
					
				else if(i > 0 && str.charAt(i) != str.charAt(i-1)){
					cnt--;
					break;
				}
			}
	    }
	    
	    System.out.println(cnt);
	    br.close();
	}
}

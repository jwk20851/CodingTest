//https://www.acmicpc.net/problem/1213

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++)
			arr[str.charAt(i)-'A']++;
			
		int cnt = 0;
		char tmp = ' ';
		for(int i = 0; i < 26; i++){
		    if(arr[i]%2 != 0){
		        tmp = (char)(i+'A');
		        cnt++;
		    }
		}
		
		if(cnt > 1){
		    System.out.print("I'm Sorry Hansoo");
		}
		else{
		    String ans = "";
		    for(int i = 0; i < 26; i++){
		        for(int j = 0; j < arr[i]/2; j++){
		            ans += (char)(i+'A');
		        }
		    }
		    
		    StringBuffer sb = new StringBuffer(ans);
            String reverse = sb.reverse().toString();
            
            System.out.println((tmp != ' ')? ans+tmp+reverse : ans+reverse);
		}
	}
}
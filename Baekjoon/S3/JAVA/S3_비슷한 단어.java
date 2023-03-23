//https://www.acmicpc.net/problem/2607

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String str = br.readLine();
        int length = str.length();
        
        int[] alpha = new int[27];
        for(int i = 0; i < length; i++)
            alpha[str.charAt(i)-65]++;
            
        int cnt = 0;
        while(N-- > 1){
            str = br.readLine();
            int[] tmp = new int[27];
            for(int i = 0; i < str.length(); i++)    
                tmp[str.charAt(i)-65]++;
            
            int diff = 0;
            for(int i = 0; i < 27; i++)
                diff += Math.abs(alpha[i]-tmp[i]);
            
            if(length == str.length()){
                if(diff==0 || diff==2)
                    cnt++;
            }
            else if(Math.abs(length-str.length())==1){
                if(diff == 1)
                    cnt++;
            }
        }
        
        System.out.print(cnt);
	}
}
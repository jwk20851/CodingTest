//https://www.acmicpc.net/problem/5525

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());  
		char[] arr = br.readLine().toCharArray();
		
		int cnt = 0, ans = 0;
        for(int i = 0; i < m-2; i++){
            if(arr[i]=='I' && arr[i+1]=='O' && arr[i+2]=='I'){
                cnt++;
                
                if(cnt == n){
                    ans++;
                    cnt--;
                }
                
                i++;
            }
            else
                cnt = 0;
        }
        
        System.out.print(ans);
	}
}
//https://www.acmicpc.net/problem/1802

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-- > 0){
            String str = br.readLine();
            if(str.length() == 1)
				sb.append("YES\n");
            else{
                int leng = str.length();
                int cnt = leng/2;
    			boolean check = false;
    			while(cnt > 0){
    				for(int i = 0, j = leng-1; i < cnt; i++, j--){
    					if(str.charAt(i) == str.charAt(j)){
    						check = true;
    						break;
    					}
    				}
    				
    				if(check)
    					break;
    				
    				leng /= 2;
    				cnt /= 2;
    			}
    			
    			sb.append(check? "NO\n" : "YES\n");
            }
        }
        System.out.print(sb);
    }
}
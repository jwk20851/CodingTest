//https://www.acmicpc.net/problem/11723

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        boolean[] s = new boolean[21];
        
        while(n-- > 0){
            String[] str = br.readLine().split(" ");
            
            if(str.length > 1)
                m = Integer.parseInt(str[1]);
                
            switch(str[0]){
                case "add":
                    s[m] = true;
                    break;
                    
                case "remove":
                    s[m] = false;
                    break;
                    
                case "check":
                    sb.append(s[m]? "1\n":"0\n");
                    break;
                    
                case "toggle":
                    s[m] = !s[m];
                    break;
                    
                case "all":
                    for(int i = 1; i <= 20; i++)
                        s[i] = true;
                    break;
                    
                case "empty":
                    for(int i = 1; i <= 20; i++)
                        s[i] = false;
                    break;
            }
        }
        
        System.out.print(sb);
    }
}
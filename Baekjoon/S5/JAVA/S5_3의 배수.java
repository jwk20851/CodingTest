//https://www.acmicpc.net/problem/1769

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int cnt = 0;
        while(true){
            if(str.length() == 1)
                break;
                
            int sum = 0;
            for(int i = 0; i < str.length(); i++)
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            
            cnt++;
            str = Integer.toString(sum);
        }
        
        System.out.println(cnt);
        System.out.println((Integer.parseInt(str)%3 == 0)? "YES":"NO");
    }
}
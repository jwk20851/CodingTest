//https://www.acmicpc.net/problem/1789

import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        
        long cnt = 0;
        while(true){
            cnt++;
            if(cnt*(cnt+1)/2 > n)
                break;
        }
        
        System.out.print(cnt-1);
        br.close();
    }
}
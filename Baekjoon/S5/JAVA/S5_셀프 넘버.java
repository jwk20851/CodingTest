//https://www.acmicpc.net/problem/4673

import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        boolean[] ans = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        for(int i = 1; i <= 10000; i++){
            idx = check(i);
            
            if(idx <= 10000)
                ans[check(i)] = true;
            
            if(!ans[i])
                sb.append(i+"\n");
        }
        
        System.out.println(sb);
    }
    
    static int check(int n){
        int sum = n;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
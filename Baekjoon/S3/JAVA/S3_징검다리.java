//https://www.acmicpc.net/problem/11561

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            long N = Long.parseLong(br.readLine());
            
            long l = 1, r = (long)Math.sqrt(2*N-1);
            while(l <= r){
                long mid = (l+r)/2;
                
                if((long)(mid*(mid+1)/2) <= N)
                    l = mid+1;
                else
                    r = mid-1;
            }
            
            sb.append(r+"\n");
        }
        
        System.out.print(sb);
    }
}
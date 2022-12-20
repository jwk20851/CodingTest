//https://www.acmicpc.net/problem/2417

import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        long l = 0, r = n;
        long min = Long.MAX_VALUE;
        
        while(l <= r){
            long mid = (l+r)/2;
            long tmp = (long)Math.pow(mid,2);
            
            if(tmp < n)
                l = mid+1;
            else{
                min = mid;
                r = mid-1;
            }
        }
        
        System.out.println(min);
    }
}
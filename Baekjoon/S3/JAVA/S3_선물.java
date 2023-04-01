//https://www.acmicpc.net/problem/1166

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long L = Long.parseLong(st.nextToken());
        long W = Long.parseLong(st.nextToken());
        long H = Long.parseLong(st.nextToken());
        
        double min = 0, max = Math.max(L, Math.max(W, H));
        while(min <= max){
            double mid = (min+max)/2;
            if(mid == min || mid == max)
                break;
                    
            long cnt = (long)(L/mid)*(long)(W/mid)*(long)(H/mid);    
            if(cnt < N)
                max = mid;
            else
                min = mid;
        }
        
        System.out.print(min);
    }
}
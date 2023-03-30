//https://www.acmicpc.net/problem/13702

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] mak = new int[N];
        for(int i = 0; i < N; i++)
            mak[i] = Integer.parseInt(br.readLine());
        
        long l = 1, r = mak[N-1], ans = 0;
        while(l <= r){
            long mid = (l+r)/2;
                
            long cnt = 0;
            for(int i = 0; i < N; i++)
                cnt += mak[i]/mid;
            
            if(cnt < K)
                r = mid -1;
            else{
                ans = mid;
                l = mid +1;
            }
        }
        
        System.out.print(ans);
    }
}